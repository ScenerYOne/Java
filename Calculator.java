import java.util.Scanner;
public class Calculator {
    public static void main(String [] args) {
    Scanner in = new Scanner(System.in);
        System.out.println("Calculator (+,-,*,/,%)");
        System.out.println("======================================");
        System.out.println("Press + : Add");
        System.out.println("Press - : Subtract");
        System.out.println("Press * : Multiplay");
        System.out.println("Press / : Divide");
        System.out.println("Press % : Modulo");
        System.out.println(" ");
        System.out.print("Press operator : ");
            char operator =in.next().charAt(0);
        System.out.print("Please enter x : ");
            int x = in.nextInt();
        System.out.print("Please enter y : ");
            int y = in.nextInt();

        int sum=0;

        switch (operator) {
            case '+':
                sum = x + y;
                break;
            case '-':
                sum = x - y;
                break;
            case '*':
                sum = x * y;
                break;
            case '/':
                sum = x / y;
                break;  
            case '%':
                sum = x % y;
                break;
            default:
                System.out.println("Can't find the value");  
        }
            System.out.println(x+" "+operator+" "+y+" = " +sum);
            System.out.println("Bye Bye !!!!!");
    }
}
