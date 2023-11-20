import java.util.ArrayList;
public class TestShapeOject {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Squaree("Orange", 4));
        shapes.add(new Squaree("Orange", 10));
        shapes.add(new Squaree("Orange", 5));
        shapes.add(new Circle("Violet", 3));
        shapes.add(new Circle("Violet", 6));
        shapes.add(new Circle("Violet", 10));

        displayAllShape(shapes);
        findMax(shapes);
    }

    public static int findMax(ArrayList<Shape> shapes) {
        double maxPerimeter = Double.MIN_VALUE;
        double minPerimeter = Double.MAX_VALUE;
        double maxCircumference = Double.MIN_VALUE;
        double minCircumference = Double.MAX_VALUE;
        int maxPerimeterIndex = -1;
        int minPerimeterIndex = -1;
        int maxCircumferenceIndex = -1;
        int minCircumferenceIndex = -1;

        for (int i = 0; i < shapes.size(); i++) {
            Shape shape = shapes.get(i);
            if (shape instanceof Squaree) {
                double perimeter = ((Squaree) shape).getPerimeter();
                if (perimeter > maxPerimeter) {
                    maxPerimeter = perimeter;
                    maxPerimeterIndex = i;
                }
                if (perimeter < minPerimeter) {
                    minPerimeter = perimeter;
                    minPerimeterIndex = i;
                }
            } else if (shape instanceof Circle) {
                double circumference = ((Circle) shape).getCircumference();
                if (circumference > maxCircumference) {
                    maxCircumference = circumference;
                    maxCircumferenceIndex = i;
                }
                if (circumference < minCircumference) {
                    minCircumference = circumference;
                    minCircumferenceIndex = i;
                }
            }
        }

        System.out.println("Square:");
        if (maxPerimeterIndex != -1) {
            System.out.println("Max Perimeter is " + maxPerimeter + " of No. " + (maxPerimeterIndex + 1));
        }
        if (minPerimeterIndex != -1) {
            System.out.println("Min Perimeter is " + minPerimeter + " of No. " + (minPerimeterIndex + 1));
        }

        System.out.println("Circle:");
        if (maxCircumferenceIndex != -1) {
            System.out.println("Max Circumference is " + maxCircumference + " of No. " + (maxCircumferenceIndex + 1));
        }
        if (minCircumferenceIndex != -1) {
            System.out.println("Min Circumference is " + minCircumference + " of No. " + (minCircumferenceIndex + 1));
        }

        return 0;
    }

    public static int displayAllShape(ArrayList<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape.toString() + "\n====================");
        }
        return 0;
    }
}


