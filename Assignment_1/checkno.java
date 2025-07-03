package Assignment_1;
 import java.util.Scanner;
 class checkno {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int no = sc.nextInt();
        if(no < 0){
            System.out.println("the no is negative");
        }
        else if(no == 0){
            System.out.println("the no is Zero");
        }
        else{
            System.out.println("the no is Positive");
        }



    }
    
}
