class Student2 {
    int id;
    String name;
    float marks;

    Student2(int i, String n, float m) {
        id = i;
        name = n;
        marks = m;
    }

    void Display() {
        System.out.println(id + " " + name + " " + marks);
    }

    public static void main(String[] args) {
        Student2 obj = new Student2(01, "Ranjan", 99);
        obj.Display();
    }
}