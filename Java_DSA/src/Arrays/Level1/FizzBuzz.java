package Arrays.Level1;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid number");
            return;
        }

        String[] result = new String[number];

        for (int i = 0; i < number; i++) {
            int value = i + 1;

            if (value % 3 == 0 && value % 5 == 0) {
                result[i] = "FizzBuzz";
            } else if (value % 3 == 0) {
                result[i] = "Fizz";
            } else if (value % 5 == 0) {
                result[i] = "Buzz";
            } else {
                result[i] = String.valueOf(value);
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + result[i]);
        }
    }
}