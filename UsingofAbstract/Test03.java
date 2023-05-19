//Example of 3 Banks
//Abstract Class

abstract class Bank{
public abstract void getBalance();
}

//1st SubClass

class BankA extends Bank{
public void getBalance(){
System.out.println("$ 200");
}
}

//2nd SubClass

class BankB extends Bank{
public void getBalance(){
System.out.println("$ 500");
}
}

//3rd SubClass

class BankC extends Bank{
public void getBalance(){
System.out.println("$ 1000");
}
}

//Maiin Class

class Test03{
public static void main(String[] args){
BankA OBJ = new BankA();
OBJ.getBalance();
BankB OBJ1 = new BankB();
OBJ1.getBalance();
BankC OBJ2 = new BankC();
OBJ2.getBalance();
}
}