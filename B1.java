class B1{
int i;
B1(){
i = 10;
System.out.println("This is constructor..");
}
public static void main(String args[]){
B1 obj = new B1();
System.out.println(obj.i);
}
}