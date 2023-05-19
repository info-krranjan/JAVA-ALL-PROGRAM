import java.util.*;
public class SwapUi {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Enter the value of A:- ");
            int a = scan.nextInt();
            System.out.println("Enter the value of B:- ");
            int b = scan.nextInt();
            System.out.println("After swapping:- ");
            a = a+b;
            b = a-b;
            a = a-b;
            System.out.println("A = "+a);
            System.out.println("B = "+b);
        }
    }
}
