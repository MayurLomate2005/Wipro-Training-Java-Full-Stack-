package Assignment_1 ;
import java.util.Scanner;
  class CheckGreater{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no");
        int a = sc.nextInt();
        System.out.println("Enter the second no");
        int b = sc.nextInt();

        if(a>b){
            System.out.println("a is greater than b");

        }
        else{
            System.out.println("b is greater than b");
        }


    }
}

