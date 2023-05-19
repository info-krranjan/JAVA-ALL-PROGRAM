public class Switch01 {
    public static void main(String[] args) {
        int x = 1;
        int a = 10;
        int b = 10;
        System.out.println("This is Addition, Subtraction and Multiplication:- ");
        switch(x){
            case 1:
            System.out.println(a+b);
            break;
            case 2:
            System.out.println(a-b);
            break;
            case 3:
            System.out.println(a/b);
            break;
            default:
            System.out.println("invalid...");
        }
    }
}
