import java.util.Scanner;

/*
 * Q5 - Create a calculator using switch statement to perform addition, subtraction, multiplication 
 and division
 */

public class con5 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Enter operator: (+, -, * or /)");
            char op = scan.next().charAt(0);
            System.out.println("Enter value of a: ");
            int a = scan.nextInt();
            System.out.println("Enter value of b: ");
            int b = scan.nextInt();
            int ans;

            switch(op) {
                case '+':
                ans = a+b;
                System.out.println(a + " + " + b + " = " + ans);
                break;
                case '-':
                ans = a-b;
                System.out.println(ans);
                break;
                case '*':
                ans = a*b;
                System.out.println(ans);
                break;
                case '/':
                ans = a/b;
                System.out.println(ans);
                break;
                default:
                System.out.println("Wrong Entry...");
            }
        }
    }
}
