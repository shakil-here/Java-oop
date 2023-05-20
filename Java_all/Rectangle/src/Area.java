public class Area {
    public static void main(String[] args) {
        Rectangle r1= new Rectangle();
        System.out.println(r1.toString());
        r1.setHight(5);
        r1.setWidth(2);
        System.out.println(r1.toString());
        System.out.println("Area: "+r1.getarea());
    }
}
