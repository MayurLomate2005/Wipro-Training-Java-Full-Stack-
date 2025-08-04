package Exception_Handling;

import java.util.Scanner;
import java.util.InputMismatchException;

public class MathOperation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int[] numbers = new int[5];
            int sum = 0;

            System.out.println("Please enter five integers:");

            for (int i = 0; i < 5; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");

                try {
                    String input = sc.next();
                    numbers[i] = Integer.parseInt(input); 
                    sum += numbers[i];
                } catch (NumberFormatException e) {
                    System.out.println("Error: Not a valid integer. Try again.");
                    i--; 
                }
            }

            double average = 0;
            try {
                average = (double) sum / numbers.length; 
            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero.");
            }

            System.out.print("The numbers are: ");
            for (int num : numbers) {
                System.out.print(num + " ");
            }

            System.out.println("\n--------------------");
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);

        } catch (InputMismatchException e) {
            System.out.println("Input error: Please enter integers only.");
        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
