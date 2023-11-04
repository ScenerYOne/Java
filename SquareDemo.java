import java.util.Scanner;

public class SquareDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Square square1 = new Square();
        Square square2 = new Square();

            System.out.print("Enter width of 1st square: "+square1.width );
            int a = in.nextInt();
            square1.setWidth(a);

            System.out.print("Enter height of 2nd square:"+square2.width );
            int b = in.nextInt();
            square2.setWidth(b);

            System.out.println("Display Square Information");
            System.out.println(square1.toString());
            System.out.println(square2.toString());
           
            
            System.out.println("Enter new width of 1st square: ");
            int s = in.nextInt();
            square1.setWidth(s);

            System.out.println("Enter new width of 2nd square: ");
            int s1 = in.nextInt();
            square2.setWidth(s1);

            System.out.println("Display Square Information");
            System.out.println(square1.toString());
            System.out.println(square2.toString());


    }
    
}