import java.util.*;
public class Switch2{
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("..........*****************************.............");
            System.out.println("Simple Calculator using Switch:-  ");
            System.out.println("..........*****************************.............");
            System.out.println("Enter 1 for Addition:- ");
            System.out.println("Enter 2 for Subtraction:- ");
            System.out.println("Enter 3 for Multiplication:- ");
            System.out.println("Enter 4 for Division:- ");
            System.out.println("Enter 5 for Remainder:- ");
            int x = scan.nextInt();
            int a;
            int b;
            switch(x){

                case 1:
                System.out.println("Addition:- ");
                System.out.println("Enter the value of A & B:- ");
                a = scan.nextInt();
                b = scan.nextInt();
                System.out.println(a+b);
                break;

                case 2:
                System.out.println("Subtraction:- ");
                System.out.println("Enter the value of A & B:- ");
                a = scan.nextInt();
                b = scan.nextInt();
                System.out.println(a-b);
                break;

                case 3:
                System.out.println("Multiplication:- ");
                System.out.println("Enter the value of A & B:- ");
                a = scan.nextInt();
                b = scan.nextInt();
                System.out.println(a*b);
                break;

                case 4:
                System.out.println("Division:- ");
                System.out.println("Enter the value of A & B:- ");
                a = scan.nextInt();
                b = scan.nextInt();
                System.out.println(a/b);
                break;

                case 5:
                System.out.println("Remainder:- ");
                System.out.println("Enter the value of A & B:- ");
                a = scan.nextInt();
                b = scan.nextInt();
                System.out.println(a%b);
                break;

                default:
                System.out.println("Invalid");
            }
        }
    }
}