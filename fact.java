public class fact {
    public static void main(String[] args) {
        System.out.println("Factorial:- ");
        int i, fact = 1;
        int number = 5;
        for(i = 1; i <= number; i++){
            fact =fact*i;
        }
        System.out.println("Factorial of "+number+" is "+fact);
    }
}
