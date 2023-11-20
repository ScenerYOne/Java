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

    public void resize(int percent) {
        width *= ( percent / 100.0);
    }

    public int compareTo(Object object) {
       
        if (object instanceof Squaree) {
            Squaree otherSquare = (Squaree) object;
            double areaDiff = this.getArea() - otherSquare.getArea();
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
        return super.toString() + " width: " + width + "\nArea: " + getArea() + " Perimeter: " + getPerimeter();
    }
}
    
