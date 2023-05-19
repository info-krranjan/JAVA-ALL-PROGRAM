//Current class constructor using Super keyword
class A{
A(){
System.out.println("Parent Constructor");
}
}
class B extends A{
B(){
super();
System.out.println("Child Constructor");
}
}
class Check1{
public static void main(String[] args){
B obj = new B();
}
}