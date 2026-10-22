package recursion.Arrays;

public class TraversalArray {

    public static void printInc(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }

        System.out.print(arr[index] + " ");
        printInc(arr, index + 1);
    }

    public static void rev(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }

        rev(arr, index + 1);
        System.out.print(arr[index] + " ");
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 98, 34, 23, 45};

        System.out.println("Forward order:");
        printInc(arr, 0);

        System.out.println();

        System.out.println("Reverse order:");
        rev(arr, 0);

        System.out.println();
    }
}

