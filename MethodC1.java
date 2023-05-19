class MethodC1{
MethodC1(){
System.out.println("This is constructor..");
}
public static void display(){
System.out.println("This is method..");
}
public static void show(){
System.out.println("This is 2nd method..");
}
public static void main(String args[]){
show();
MethodC1 obj = new MethodC1();
obj.display();
}
}