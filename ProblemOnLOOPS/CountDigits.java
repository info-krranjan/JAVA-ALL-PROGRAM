import java.util.*;
public class CountDigits{
public static void main(String[] args){
try(Scanner scan = new Scanner(System.in)){
int n = scan.nextInt();
int numOfDigits = 0;
while(n>0){
n = n/10;
numOfDigits++;
}
System.out.println("Number of Digits of " + n + " :"+numOfDigits);
}
}
}