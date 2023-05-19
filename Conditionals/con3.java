import java.util.Scanner;

/*
 * Q3 - Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and 
 calculate Profit or Loss.
*/

public class con3 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Find Profit or Loss: ");
            System.out.print("Enter CostPrice: ");
            int costprice = scan.nextInt();
            System.out.print("Enter selling price: ");
            int sellingprice = scan.nextInt();
            
            
            if(costprice < sellingprice){
                int profit = sellingprice - costprice;
                System.out.println("Profit: "+profit);
            }
            else if(costprice > sellingprice){
                int loss = costprice - sellingprice;
                System.out.println("Loss: "+loss);
            }
            else{
                System.out.println("No loss nor No profit");
            }
        }
    }
}
