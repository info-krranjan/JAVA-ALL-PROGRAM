//Multiple Interface

//1st Interface

interface Snu{
public void BCA();
}

//2nd Interface

interface YBN{
public void BBA();
}
class Univ implements Snu,YBN{
public void BCA(){
System.out.println("1st Interface.");
}
public void BBA(){
System.out.println("2nd Interface");
}
}
class Test07{
public static void main(String[] args){
Univ obj = new Univ();
obj.BCA();
obj.BBA();
}
}