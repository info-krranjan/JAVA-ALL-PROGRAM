import java.util.*;
public class Fibonacci{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);

System.out.println("Enter a no: ");
int n = scan.nextInt();

int a = 1;
int b = 1;

for(int i = 1; i <= n; i++){
int sum = a+b;
System.out.println(sum);
n = b;
b = sum;
}
}
}