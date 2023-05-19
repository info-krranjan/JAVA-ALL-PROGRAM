// Interface class simple program..
interface Snu{
public void BCA();
public void MCA();
}
class Check implements Snu{
public void BCA(){
System.out.println("BCA department.");
}
public void MCA(){
System.out.println("MCA department");
}
}
class Test01{
public static void main(String[] args){
Check obj = new Check();
obj.BCA();
obj.MCA();
}
}