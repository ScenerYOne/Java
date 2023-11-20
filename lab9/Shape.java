public abstract class Shape implements Resizable , Comparable{
    protected String color;

    public abstract double getArea(); 

    public void setColor(String c) {
        color = c;
    }

    public String toString() {
        return "Color: " + color;
    }
}