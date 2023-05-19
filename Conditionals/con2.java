/*
 * Q2 - Write a program to print absolute value of a number entered by the user.
*/

import java.util.Scanner;

public class con2 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Print absolute value...");
            System.out.println("Enter an negative value: ");
            int a = scan.nextInt();
            if(a<0){
                a = a*-1; // -5*-1 = 5
            }
            System.out.println(a);
        }
    }
}
