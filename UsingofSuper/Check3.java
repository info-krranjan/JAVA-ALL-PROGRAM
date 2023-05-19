//Current class method using Super keyword
class A{
void Show(){
System.out.println("Parent Method");
}
}
class B extends A{
void Show(){
super.Show();
System.out.println("Child method");
}
}
class Check3{
public static void main(String[] args){
B obj = new B();
obj.Show();
}
}