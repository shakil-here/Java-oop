class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
class Quadrilateral{
    public Point [] points;

    public Quadrilateral(Point p1,Point p2,Point p3,Point p4){
        points = new Point[4];
        points[0]=p1;
        points[1]=p2;
        points[2]=p3;
        points[3]=p4;

    }

    public double getArea(){
        return 0;
    }


}


