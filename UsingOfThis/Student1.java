class Student1 {
    int id;
    String name;
    float marks;

    Student1(int id, String name, float marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(id + " " + name + " " + marks);
    }

    public static void main(String[] args) {
        Student1 obj = new Student1(01, "Ranjan", 97);
        obj.display();
    }
}