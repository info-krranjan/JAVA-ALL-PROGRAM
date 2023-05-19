/*
Q2 - Swap two numbers without the use of third variable
*/

import java.util.Scanner;

public class op2 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Enter the value of a:");
            int a = scan.nextInt();
            System.out.println("Enter the value of b: ");
            int b = scan.nextInt();

            System.out.println("After Swap.....");

            a = a+b;
            b = a-b;
            a = a-b;

            System.out.println("The value of a:"+a);
            System.out.println("The value opf b:"+b);
        }

    }
}
