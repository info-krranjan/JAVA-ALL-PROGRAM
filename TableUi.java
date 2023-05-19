import java.util.*;
public class TableUi {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Enter integer:- ");
            int x = scan.nextInt();
            for(int i = 1; i<=10; i++){
                for(int j = x; j <= i; j++){
                    System.out.println(j*i);
                }
                
            }
        }
    }
}
