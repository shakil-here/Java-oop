public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(3, 2);
        Point p4 = new Point(0, 2);

        Quadrilateral quad = new Quadrilateral(p1, p2, p3, p4);

        Trapezoid trap = new Trapezoid(p1, p2, p3, p4);
        System.out.println("Trapezoid area: " + trap.getArea());

        Parallelogram para = new Parallelogram(p1, p2, p3, p4);
        System.out.println("Parallelogram area: " + para.getArea());

        Rectangle rect = new Rectangle(p1, p2, p3, p4);
        System.out.println("Rectangle area: " + rect.getArea());

        Square square = new Square(p1, p2, p3, p4);
        System.out.println("Square area: " + square.getArea());
    }
}