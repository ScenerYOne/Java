public class Squaree extends Shape {
    private double width;

    public Squaree(String color, double width) {
        this.color = color;
        this.width = width;
    }

    public double getArea() {
        return width * width;
    }

    public double getPerimeter() {
        return 4 * width;
    }

    public String toString() {
        return super.toString() + " width: " + width + "\nArea: " + getArea() + " Perimeter: " + getPerimeter();
    }
}