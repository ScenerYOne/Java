import java.util.ArrayList;
public class Test {
        public static void main(String[] args) {
            Squaree square1 = new Squaree("Orange", 4);
            Squaree square2 = new Squaree("Orange", 20);
            Squaree square3 = new Squaree("Orange", 5);
            Circle circle1 = new Circle("Violet", 3);
            Circle circle2 = new Circle("Violet", 3);
            Circle circle3 = new Circle("Violet", 10);
    
            square1.resize(300);
            square2.resize(200);
            square3.resize(300);
    
            circle1.resize(50);
            circle2.resize(20);
            circle3.resize(50);
    
            System.out.println("======================================");
            System.out.println("After resize ");
            System.out.println("class Square");
            System.out.println("1. " + square1.toString());
            System.out.println("2. " + square2.toString());
            System.out.println("3. " + square3.toString());
            System.out.println("==============================");
            System.out.println("class Circle");
            System.out.println("1. " + circle1.toString());
            System.out.println("2. " + circle2.toString());
            System.out.println("3. " + circle3.toString());
            System.out.println("ニニニニニニニニニニニニニニニニニ");
    
            System.out.println("Compare 2 Squares after resize ");
            int compareResultSquare = square1.compareTo(square2);
            if (compareResultSquare < 0) {
                System.out.println("Square 1 is smaller than Square 2");
            } else if (compareResultSquare > 0) {
                System.out.println("Square 1 is larger than Square 2");
            } else {
                System.out.println("Square 1 is equal to Square 2");
            }
    
            System.out.println("Compare 2 Circle after resize ");
            int compareResultCircle = circle2.compareTo(circle1);
            if (compareResultCircle < 0) {
                System.out.println("Circle 2 is smaller than Circle 1");
            } else if (compareResultCircle > 0) {
                System.out.println("Circle 2 is larger than Circle 1");
            } else {
                System.out.println("Circle 2 is equal to Circle 1");
            }
        }
    public static int displayAllShape(ArrayList<Shape> shapes) {
       
        return 0;
    }

}

    
    
    

    


