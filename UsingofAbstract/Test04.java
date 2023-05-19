abstract class A{
public A(){
System.out.println("Abstract Constructor.");
}
}
class B extends A{
B(){
System.out.println("Normal Constructor.");
}
}
class Test04{
public static void main(String[] args){
B obj = new B();
}
}