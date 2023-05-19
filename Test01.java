public class Test01{
public int add(int a, int b){
return a+b;
}
public double add(double a, double b){
return a+b;
}
public static void main(String args[]){
Test01 obj = new Test01();
int sum1 = obj.add(1,2);
double sum2 = obj.add(1.4,1.6);
System.out.println("Sum = "+sum1);
System.out.println("Sum = "+sum2);
}
}