//Current class variable using Super keyword
class A{
int a = 10; //variable
}
class B extends A{
int a = 20;
void Display(){
System.out.println(a);
System.out.println(super.a);
}
}
class Check{
public static void main(String[] args){
B obj = new B();
obj.Display();
}
}