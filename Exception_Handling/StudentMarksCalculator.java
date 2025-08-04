package Exception_Handling ;
import java.util.Scanner;

class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

class ValueOutOfRangeException extends Exception {
    public ValueOutOfRangeException(String message) {
        super(message);
    }
}

public class StudentMarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 2; i++) {
            try {
                System.out.println("\n--- Enter Details for Student " + i + " ---");

                System.out.print("Enter name: ");
                String name = scanner.nextLine();

                int sumOfMarks = 0;

                for (int j = 1; j <= 3; j++) {
                    System.out.print("Enter marks for Subject " + j + ": ");
                    String markStr = scanner.nextLine();
                    int mark = Integer.parseInt(markStr);

                    if (mark < 0) {
                        throw new NegativeValueException("Error: Marks cannot be negative.");
                    }
                    if (mark > 100) {
                        throw new ValueOutOfRangeException("Error: Marks cannot be greater than 100.");
                    }

                    sumOfMarks += mark;
                }

                double average = (double) sumOfMarks / 3.0;
                System.out.println("----------------------------------------");
                System.out.printf("Average marks for %s: %.2f%n", name, average);
                System.out.println("----------------------------------------");

            } catch (NumberFormatException e) {
                System.out.println("Invalid Input! Please enter integer values only for marks.");
                System.out.println("Let's try again for this student.");
                i--;
            } catch (NegativeValueException | ValueOutOfRangeException e) {
                System.out.println(e.getMessage());
                System.out.println("Let's try again for this student.");
                i--;
            }
        }

        System.out.println("\nProgram finished.");
        scanner.close();
    }
}
