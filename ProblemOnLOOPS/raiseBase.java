import java.util.*;
public class raiseBase{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int b = scan.nextInt();
int ans = 1;
for(int i = 1; i <= b; i++){
ans = ans*a;
}
System.out.println(ans);
}
}