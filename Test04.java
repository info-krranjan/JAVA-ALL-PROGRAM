class Test04{
Test04(){
System.out.println("Default constructor..");
}
Test04(int a){
System.out.println("Value of A = "+a);
}
public static void method(){
System.out.println("This is method..");
}
public static void main(String args[]){
Test04 obj1 = new Test04();
Test04 obj = new Test04(5);
obj.method();
}
}