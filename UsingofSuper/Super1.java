class A{
int a = 10;
}

class B extends A{
int a = 20;
void Display(){
System.out.println("Value of A: "+a);
System.out.println(Super.a);
}
}
class Super1{
public static void main(String args[]){
B obj = new B();
obj.Display();
}
}