//Method overriding

class Vehicle{
void Show(){
System.out.println("1st method..");
}
}
class Vehicle2 extends Vehicle{
void Show(){
System.out.println("Method overriding..");
}
}
class Main{
public static void main(String[] args){
Vehicle2 obj = new Vehicle2();
obj.Show();
}
}