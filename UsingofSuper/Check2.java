//Current class constructor with parameter using Super keyword
class A{
A(int a){
System.out.println(a);
}
}
class B extends A{
B(){
super(20);
System.out.println("Child Constructor");
}
}
class Check2{
public static void main(String[] args){
B obj = new B();
}
}