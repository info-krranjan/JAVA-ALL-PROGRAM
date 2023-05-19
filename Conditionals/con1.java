import java.util.Scanner;

/*
 * Q1 - Write a program which takes the values of length and breadth from user and check if it is 
 a square or not.
 */

public class con1 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Enter length: ");
            int length = scan.nextInt();
            System.out.println("Enter breadth: ");
            int breadth = scan.nextInt();
            if (length == breadth) {
                System.out.println("Square.");
            }
            else{
                System.out.println("not square.");
            }
        }
    }
}
