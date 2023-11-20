public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return super.toString() + " radius: " + radius + "\nArea: " + getArea() + " Circumference: " + getCircumference();
    }
}
