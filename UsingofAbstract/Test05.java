abstract class A{
abstract static Rv(int a);
A(){
System.out.println("Abstract Constructor.");
}
}
class B extends A{
static Rv(int a){
System.out.println("Abstract method."+a);
}
B(){
System.out.println("Normal Constructor.");
}
}
class Test05{
public static void main(String[] args){
B obj = new B();
obj.Rv(1);
}
}