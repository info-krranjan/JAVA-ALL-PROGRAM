import java.util.Scanner;

/* 
 * Q5 - Find the total number of bits needed to be flipped to convert x to y
*/

public class op5 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            int x = scan.nextInt();
            int y = scan.nextInt();
            int n = x ^ y;
            int count = 0;
            while (n != 0){
                n = n & (n - 1);
                count++;
            }
        System.out.print(count);
        }
    }   
}
