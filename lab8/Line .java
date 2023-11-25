public class Line implements Movable {
    private Point2D start;
    private Point2D end;

    public Line(Point2D start, Point2D end) {
        this.start = start;
        this.end = end;
    }

    public double calculateSlope() {
        return (double) (end.getY() - start.getY()) / (end.getX() - start.getX());
    }

    public double calculateDistance() {
        return Math.sqrt(Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2));
    }

    @Override
    public void moveUp(int y) {
        start.moveUp(y);
        end.moveUp(y);
    }

    @Override
    public void moveDown(int y) {
        start.moveDown(y);
        end.moveDown(y);
    }

    @Override
    public void moveLeft(int x) {
        start.moveLeft(x);
        end.moveLeft(x);
    }

    @Override
    public void moveRight(int x) {
        start.moveRight(x);
        end.moveRight(x);
    }

    @Override
    public String toString() {
        return "Line from " + start + " to " + end + "\nSlope: " + calculateSlope() + " Distance: " + calculateDistance() + "\n";
    }
}
