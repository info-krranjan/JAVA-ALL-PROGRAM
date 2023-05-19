class A{
A(int a){
System.out.println("Parent constructor \n"+a);
}
}
class B extends A{
B(int c){
super(20);
System.out.println("Child constructor..\n"+c);
}
}
class Test{
public static void main(String args[]){
B obj = new B(67);
}
}