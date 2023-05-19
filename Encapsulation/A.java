class Encap{
//Variables
private int roll;
private String name;
//Methods
public void setroll(int newroll){
roll = newroll;
}
public void setname(String newname){
name = newname;
}
public int getroll(){
return roll;
}
public String getname(){
return name;
}
}
class A{
public static void main(String[] args){
Encap obj = new Encap();
obj.setroll(3);
obj.setname("Ranjan");
System.out.println("Roll: "+obj.getroll());
System.out.println("Name: "+obj.getname());
}
}