package Assignment_1;
import java.util.Scanner;
public class CheckEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no ");
        int no1 = sc.nextInt();

        //check Even or odd

        // if(no1 % 2 == 0){
        //     System.out.println("The no is even");
        // }
        // else{
        //     System.out.println("the no is odd");

        // }


        // check sum is even or odd
        System.out.println("Enter the second no");
        int no2 = sc.nextInt();
    
        if((no1 + no2) % 2 == 0){
            System.out.println("the sum is Even");
        }
        else{
            System.out.println("the sum is odd");
        }
        
    }
    
}
