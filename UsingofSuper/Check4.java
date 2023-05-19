//Current class method using Super keyword
class A{
void Show(int a){
System.out.println(a);
}
}
class B extends A{
void Show(){
super.Show(10);
System.out.println("Child method");
}
}
class Check4{
public static void main(String[] args){
B obj = new B();
obj.Show();
}
}