public class InvoiceTest {
    public static void main(String[] args) {
        Invoice rakib=new Invoice();
        rakib.setNumber("PEN001");
        rakib.setDescription("MATADOR BALLPEN");
        rakib.setPrice(10);
        rakib.setQuantity(18);
        System.out.println(rakib.tooString());

    }
}
