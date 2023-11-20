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

    public void resize(int percent) {
        radius *= (1.0 + percent / 100.0);
    }

    public int compareTo(Object object) {
     
        if (object instanceof Circle) {
            Circle otherCircle = (Circle) object;
            double areaDiff = this.getArea() - otherCircle.getArea();
            if (areaDiff < 0) {
                return -1;
            } else if (areaDiff > 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return -2; 
        }
    }

    public String toString() {
        return super.toString() + " radius: " + radius + "\nArea: " + getArea() + " Circumference: " + getCircumference();
    }
}