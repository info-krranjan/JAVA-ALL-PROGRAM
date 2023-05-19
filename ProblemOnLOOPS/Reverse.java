import java.util.*;
public class Reverse{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int ans = 0;
while(a>0){
ans = ans * 10 + a % 10;
a = a/10;
}
System.out.println(ans);
}
}