/*
 * Q3 - Write a program to calculate the sum of the digits of a 3-digit number
 */

import java.util.Scanner;

public class op3 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Enter three digit:");
            int x = scan.nextInt();
            int sum = 0;
            while(x > 0){
                sum+= x % 10;
                x /= 10;
            }
            System.out.println("Sum of three digit:"+sum);
        }
    }
}
