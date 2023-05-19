// Abstract class simple program..
abstract class Snu{
public abstract void BCA();
public void Display(){
System.out.println("This is normal method.");
}
}
class Check extends Snu{
public void BCA(){
System.out.println("Abstract method.");
}
}
class Test{
public static void main(String[] args){
Check obj = new Check();
obj.BCA();
obj.Display();
}
}