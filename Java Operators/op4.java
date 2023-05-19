/*
 * Q4 - Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if
*/

import java.util.Scanner;

public class op4 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            int a = 50;
            int b = 70;
            System.out.println(a < 50 && a < b);

            System.out.println(a < 50 || a < b);
        }
    }
}
