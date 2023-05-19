class R{
    int a,b;
    R(){
        System.out.println("Default constructor");
    }
    R(int a, int b){
        a = a;
        b = b;
        System.out.println("Value of a = "+a);
        System.out.println("Value of b = "+b);
    }
}
class A{
    void Show(){
        System.out.println("Method...");
    }
    void Display(){
        this.Show();
        
    }
}

public class Rv1 {
    public static void main(String[] args) {
        R ob = new R();
        R obj = new R(1,4);
    }
}
