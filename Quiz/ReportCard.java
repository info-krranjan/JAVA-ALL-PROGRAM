import java.util.*;

public class ReportCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int marks;

        // Entering Name

        System.out.println("=======================================");

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.println("=======================================");

        // Input marks of all subject
        System.out.print("Enter your physics marks: ");
        marks = scan.nextInt();
        if (marks <= 100) {
            System.out.print("Enter your math marks: ");
            marks = scan.nextInt();
            if (marks <= 100) {
                System.out.print("Enter English marks: ");
                marks = scan.nextInt();
                if (marks <= 100) {
                    System.out.print("Enter Hindi marks: ");
                    marks = scan.nextInt();
                } else {
                    System.out.println("Write correct marks.");
                }
            } else {
                System.out.println("Write correct marks.");
            }

        } else {
            System.out.println("Write correct marks.");
        }
        System.out.println("===================================================");

        System.out.println("Score card of " + name);

        System.out.println("===================================================");

        System.out.println("Sl No.\t" + " Subject\t " + "Full marks\t" + "Obtained Marks\t" + "Grade");
        System.out.println("01 \t" + "Physics  \t" + "100  \t" + "50");

    }
}