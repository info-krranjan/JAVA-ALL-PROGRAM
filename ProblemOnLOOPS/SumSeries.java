import java.util.*;
public class SumSeries{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int ans = 0;
for(int i = 0; i <= a; i++){
if(i % 2 == 0){
ans = ans - i;
}
else{
ans = ans + i;
}
}
System.out.println("Sum of odd even series = "+ans);
}
}