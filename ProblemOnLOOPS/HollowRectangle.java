import java.util.*;
public class HollowRectangle{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);

System.out.println("Enter no of rows: ");
int r = scan.nextInt();

System.out.println("Enter no of columns: ");
int c = scan.nextInt();

for(int i = 1; i <= r; i++){
for(int j = 1; j <= c; j++){
if(i == 1 || i == r || j == 1 || j == c){
System.out.print(" * ");
}
else{
System.out.print("   ");
}
}
System.out.println();
}
}
}