class MethodC{
MethodC(){
System.out.println("This is constructor..");
}
public static void display(){
System.out.println("This is method..");
}
public static void main(String args[]){
MethodC obj = new MethodC();
obj.display();
}
}