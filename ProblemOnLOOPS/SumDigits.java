import java.util.*;
public class SumDigits{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int SumofDigits = 0;
while(a>0){
SumofDigits += a%10;
a = a/10;
}
System.out.println(SumofDigits);
}
}