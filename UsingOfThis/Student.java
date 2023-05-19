class Student {
    int id;
    String name;
    float marks;

    Student(int id, String name, float marks) {
        id = id;
        name = name;
        marks = marks;
    }

    void display() {
        System.out.println(id + " " + name + " " + marks);
    }

    public static void main(String args[]) {
        Student obj = new Student(01, "Ranjan", 97);
        obj.display();
    }
}