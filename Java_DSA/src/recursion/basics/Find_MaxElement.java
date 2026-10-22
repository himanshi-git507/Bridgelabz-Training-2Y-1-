package recursion.basics;

public class Find_MaxElement {

    public static int max(int[] arr, int index) {

        if (index == arr.length - 1) {
            return arr[index];
        }

        int maxValue = max(arr, index + 1);

        return Math.max(arr[index], maxValue);
    }

    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 45, 18};

        System.out.println("Maximum element: " + max(arr, 0));
    }
}
