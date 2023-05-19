import java.util.Scanner;

/*
 * Q6 - Write a program to calculate marks to grades . Follow the conversion rule as given below : 
 */

public class con6 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Enter your marks: ");
            float marks = scan.nextFloat();

            if(marks >= 90){
                System.out.println("Your grade is A+");
            }
            else if(marks >= 80){
                System.out.println("Your grade is A");
            }
            else if(marks >= 70){
                System.out.println("Your grade is B+");
            }
            else if(marks >= 60){
                System.out.println("Your grade is B");
            }
            else if(marks >= 50){
                System.out.println("Your grade is C");
            }
            else if(marks >= 40){
                System.out.println("Your grade is D");
            }
            else if(marks >= 30){
                System.out.println("Your grade is E");
            }
            else if(marks < 30){
                System.out.println("Fail..");
            }
            else{
                System.out.println("Enter valid marks..");
            }
        }
    }
}
