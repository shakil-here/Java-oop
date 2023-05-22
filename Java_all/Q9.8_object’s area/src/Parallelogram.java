 class Parallelogram extends Quadrilateral {

     public Parallelogram (Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }


     public double getArea() {
         double base = Math.sqrt(Math.pow((points[1].getX() - points[0].getX()), 2) + Math.pow((points[1].getY() - points[0].getY()), 2));
         double height = Math.abs(points[0].getY() - points[3].getY());

         return base * height;
     }


}
