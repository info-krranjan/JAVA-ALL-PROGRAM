interface Ranjan{
public void Rv();
public void Ks();
}
class Ranjan1 implements Ranjan{
public void Rv(){
System.out.println("Abstract Method.");
}
public void Ks(){
System.out.println("Abstract Method01.");
}
void Display(){
System.out.println("Nomal Method.");
}
}
class Test06{
public static void main(String[] args){
Ranjan1 obj = new Ranjan1();
obj.Rv();
obj.Ks();
obj.Display();
}
}