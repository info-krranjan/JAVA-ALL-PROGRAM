class AB {
    AB() {
        System.out.println("this is constructor");
    }

    AB(int i) {
        this.display();
        System.out.println(i);
    }

    void display() {
        System.out.println("This is method");
    }

    void show(String name, double marks) {
        System.out.println(name);
        System.out.println(marks);
    }
}

class B {
    public static void main(String args[]) {
        AB obj = new AB();
        AB obj1 = new AB(2);
        obj.show("kajal", 98.76);
    }
}