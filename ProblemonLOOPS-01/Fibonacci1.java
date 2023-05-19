
public class Fibonacci1{
public static void main(String[] args){

int n = 0;
int a = 1;
int b;
int i;
int cnt = 10;
System.out.print(n+" "+a);

for(i = 2; i <= cnt; ++i){
b = n+a;
System.out.print(" "+b);
n = a;
a = b;
}
}
}