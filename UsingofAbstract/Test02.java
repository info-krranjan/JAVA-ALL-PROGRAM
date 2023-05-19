//2 different SubClass
//Abstract class

abstract class Parent{
public abstract void Message();
}

//SubClass 01

class Child1 extends Parent{
public void Message(){
System.out.println("This is First SubClass");
}
}

//SubClass 02

class Child2 extends Parent{
public void Message(){
System.out.println("This is 2nd SubClass");
}
}

//Main Class

class Test02{
public static void main(String[] args){
Child1 obj = new Child1();
Child2 obj2 = new Child2();
obj.Message();
obj2.Message();
}
}