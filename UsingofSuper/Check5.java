//Current class method with parameter using Super keyword
class A{
void Show(int a){
System.out.println(a);
}
}
class B extends A{
void Show(int c){
super.Show(10);
System.out.println(c);
}
}
class Check5{
public static void main(String[] args){
B obj = new B();
obj.Show(20);
}
}