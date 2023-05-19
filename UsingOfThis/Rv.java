class Ranjan {
    int x;
    int a;

    // Default Constructor..

    Ranjan() {
        System.out.println("Default Constructor....");
    }

    // Parametrized Constructor...

    Ranjan(int x) {
        this.x = x;
        System.out.println("Value of X = " + x);
    }

    // Method...

    void Show() {
        System.out.println("Method...");
    }

    // Method with parameter

    void Display(int y) {
        a = y;
        System.out.println("Value of Y = " + a);
    }

    void Print() {
        this.Show();
        System.out.println("XYZ");
    }

}

// Main class

class Rv {
    public static void main(String[] args) {

        Ranjan obj = new Ranjan();
        Ranjan obj1 = new Ranjan(10);
        obj.Show();
        obj.Display(20);
        obj.Print();

    }
}