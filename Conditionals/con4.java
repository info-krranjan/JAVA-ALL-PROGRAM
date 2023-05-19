import java.util.Scanner;

/*
 * Q4 - Write a program to print positive number entered by the user, if user enters a negative 
 number, it is skipped
*/

public class con4 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Enter an integer: ");
            int x = scan.nextInt();

            if(x > 0){
                System.out.println("Integer is: "+x);
            }
            else{
                System.out.println("The number is negative and skipped..");
            }
        }
    }
}
