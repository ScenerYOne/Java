class Point2D implements Movable {
    private int x;
    private int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveUp(int y) {
        this.y += y;
    }

    public void moveDown(int y) {
        this.y -= y;
    }

    public void moveLeft(int x) {
        this.x -= x;
    }

    public void moveRight(int x) {
        this.x += x;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double calculateSlope(Point2D otherPoint) {
        return (double) (otherPoint.getY() - this.y) / (otherPoint.getX() - this.x);
    }

    public double calculateDistance(Point2D otherPoint) {
        return Math.sqrt(Math.pow(otherPoint.getX() - this.x, 2) + Math.pow(otherPoint.getY() - this.y, 2));
    }
}