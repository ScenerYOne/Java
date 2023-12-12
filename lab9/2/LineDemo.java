import java.util.ArrayList;
import java.util.Scanner;

public class LineDemo {
    public static void main(String[] args) {
        ArrayList<Point2D> points = new ArrayList<>();
        points.add(new Point2D(5, 7));
        points.add(new Point2D(10, 12));
        points.add(new Point2D(20, 12));
        points.add(new Point2D(15, 22));
        points.add(new Point2D(30, 10));
        points.add(new Point2D(24, 20));

        System.out.println("Line No. 1. From " + points.get(0) + " to " + points.get(1));
        System.out.println("Slope is " + points.get(0).calculateSlope(points.get(1)) + " Distance is " + points.get(0).calculateDistance(points.get(1)));
        System.out.println("Line No. 2. From " + points.get(2) + " to " + points.get(3));
        System.out.println("Slope is " + points.get(2).calculateSlope(points.get(3)) + " Distance is " + points.get(2).calculateDistance(points.get(3)));
        System.out.println("Line No. 3. From " + points.get(4) + " to " + points.get(5));
        System.out.println("Slope is " + points.get(4).calculateSlope(points.get(5)) + " Distance is " + points.get(4).calculateDistance(points.get(5)));

        System.out.println("=============================================");
        System.out.println("After Move Point");

      //  for (Point2D point : points) {
            points.get(0).moveLeft(10);
              points.get(1).moveLeft(10);
            points.get(0).moveUp(20);
             points.get(1).moveUp(10);

             points.get(2).moveRight(30);
              points.get(3).moveRight(30);
            points.get(2).moveDown(100);
             points.get(3).moveDown(100);


        System.out.println("Line No. 1. From " + points.get(0) + " to " + points.get(1));
        System.out.println("Slope is " + points.get(0).calculateSlope(points.get(1)) + " Distance is " + points.get(0).calculateDistance(points.get(1)));
        System.out.println("Line No. 2. From " + points.get(2) + " to " + points.get(3));
        System.out.println("Slope is " + points.get(2).calculateSlope(points.get(3)) + " Distance is " + points.get(2).calculateDistance(points.get(3)));
        System.out.println("Line No. 3. From " + points.get(4) + " to " + points.get(5));
        System.out.println("Slope is " + points.get(4).calculateSlope(points.get(5)) + " Distance is " + points.get(4).calculateDistance(points.get(5)));
    }
}