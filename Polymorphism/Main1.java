//Method overloading

class Sum{
public int Show(int x, int y){
return x+y;
}
public int Show(int x, int y, int z){
return x+y+z;
}
}
class Main1{
public static void main(String[] args){
Sum obj = new Sum();
System.out.println(obj.Show(10,20));
System.out.println(obj.Show(10,20,30));
}
}