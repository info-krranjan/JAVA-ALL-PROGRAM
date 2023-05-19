import java.util.*;
public class HollowTriangle{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);

System.out.println("Enter no of rows: ");
int r = scan.nextInt();

for(int i = 1; i <= r; i++){
for(int j = 1; j <= i; j++){
if(i == 1 && i == r){
System.out.print("*");
}else{
System.out.print(" ");
}
}
System.out.println();
}
}
}