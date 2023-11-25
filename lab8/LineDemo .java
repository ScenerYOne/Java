import java.util.Scanner;
public class LineDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of lines: ");
        int numberOfLines = scanner.nextInt();

        int requiredPoints = numberOfLines * 2;
        System.out.println("\nYou need " + requiredPoints + " Points to form " + numberOfLines + " Lines.");

        Point2D[] points = new Point2D[requiredPoints];
        Line[] lines = new Line[numberOfLines];

        for (int i = 0; i < requiredPoints; i += 2) {
            System.out.println("Enter coordinates for Point " + (i + 1) + ":");
            System.out.print("x: ");
            int x1 = scanner.nextInt();
            System.out.print("y: ");
            int y1 = scanner.nextInt();

            System.out.println("Enter coordinates for Point " + (i + 2) + ":");
            System.out.print("x: ");
            int x2 = scanner.nextInt();
            System.out.print("y: ");
            int y2 = scanner.nextInt();

            points[i] = new Point2D(x1, y1);
            points[i + 1] = new Point2D(x2, y2);

            lines[i / 2] = new Line(points[i], points[i + 1]);
        }

        System.out.println("=================");
        System.out.println("Initial Lines");
        for (Line line : lines) {
            System.out.println(line);
        }

        System.out.println("=================");
        System.out.println("After Move Points");
        for (Point2D point : points) {
            point.moveLeft(10);
            point.moveUp(20);
        }

        for (Line line : lines) {
            System.out.println(line);
        }
    }
}
