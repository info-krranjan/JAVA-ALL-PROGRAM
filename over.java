class over{
public static void show(int area){
area = 0;
System.out.println("Ranjan...");
}
}
class riding extends over{
public static void show(int area){
System.out.println("Area = "+area);
}
public static void main(String[] args){
riding obj = new riding();
obj.show(20);
}
}