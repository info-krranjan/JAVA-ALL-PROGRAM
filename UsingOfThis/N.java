//Constructor 
class R {

    int x;
    String y;

    R() {
        System.out.println("Default Constructor...");
    }

    R(int x, String y) {
        this.x = x;
        this.y = y;
        System.out.println("Roll no: " + x);
        System.out.println("Name: " + y);
    }
}

// Constructor with method...

class A {

    A() {
        System.out.println("Default Constructor..");
    }

    void Show() {
        System.out.println("Method...");
    }

    void Display() {
        System.out.println("2nd Method...");
        this.Show();
    }
}

class N {
    public static void main(String args[]) {
        R obj = new R();
        R obj1 = new R(01, "Ranjan...");
        A obj2 = new A();
        obj2.Display();
    }
}
