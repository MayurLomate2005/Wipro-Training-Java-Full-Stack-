package Exception_Handling ;
import java.util.Scanner;


public class checkexp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.println("Enter the size of array");
            int size = Integer.parseInt(scanner.nextLine());

           
            int[] arr = new int[size];

            
            System.out.println("Enter the elements in the array");
            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(scanner.nextLine());
            }

           
            System.out.println("Enter the index of the array element you want to access");
            int index = Integer.parseInt(scanner.nextLine());

            
            System.out.println("The array element at index " + index + " = " + arr[index]);
            System.out.println("The array element successfully accessed");

        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println(e); 
        } catch (NumberFormatException e) {
           
            System.out.println(e); 
        } finally {
           
            scanner.close();
        }
    }
}