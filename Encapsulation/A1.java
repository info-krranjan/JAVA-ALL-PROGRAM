class Encap02{
//Variables
private int rollNo;
private String Name;
//Methods
public void setrollNo(int newroll){
rollNo = newroll;
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
class A1{
public static void main(String[] args){
Encap obj = new Encap();
obj.setroll(3);
obj.setname("Ranjan");
System.out.println("Roll: "+obj.getroll());
System.out.println("Name: "+obj.getname());
}
}