class B2{
int i;
B2(){
i = 10;
System.out.println("This is constructor..");
}
public static void main(String args[]){
B2 obj = new B2();
B2 obj1 = new B2();
System.out.println(obj.i);
System.out.println(obj1.i);
}
}