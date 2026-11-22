package Stack.Assignment_05;

public class CircularTour {

    static int findStartingPoint(int[] petrol, int[] distance) {
        int totalPetrol = 0;
        int currentPetrol = 0;
        int start = 0;

        for (int i = 0; i < petrol.length; i++) {
            int balance = petrol[i] - distance[i];

            totalPetrol += balance;
            currentPetrol += balance;

            if (currentPetrol < 0) {
                start = i + 1;
                currentPetrol = 0;
            }
        }

        if (totalPetrol < 0) {
            return -1;
        }

        return start;
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int start = findStartingPoint(petrol, distance);

        if (start == -1) {
            System.out.println("Circular tour is not possible");
        } else {
            System.out.println("Starting Pump: " + start);
        }
    }
}
