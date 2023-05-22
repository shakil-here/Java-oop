public class Square extends Rectangle{
    public Square (Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }


    public double getArea() {
        double side = Math.sqrt(Math.pow((points[1].getX() - points[0].getX()), 2) + Math.pow((points[1].getY() - points[0].getY()), 2));

        return side * side;
    }
}
