import java.util.*;
public class Star01{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);

System.out.println("Enter no of Rows: ");
int r = scan.nextInt();
System.out.println("Enter no of Columns: ");
int c = scan.nextInt();

for(int i = 1; i <= r; i++){
for(int j = 1; j <= c; j++){
System.out.print(" * ");
}
System.out.println();
}
}
}