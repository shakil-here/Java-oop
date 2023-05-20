public class Invoice {

    private String number;
    private String description;
    private int quantity;
    private double price;
    public Invoice(){
        this.description=description;
        this.number=number;
        this.quantity=quantity;
        this.price=price;

    }


    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return description;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPrice(double price) {
        if (price>0) {
            this.price = price;
        }
        else {
            this.price=0.0;
        }
    }

    public void setQuantity(int quantity) {
        if (quantity>0) {
            this.quantity = quantity;
        }
        else{
            this.quantity=0;
        }
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getInvoiceAmount(){
        return (quantity*price);
    }

    public String tooString(){
        return "Product code: "+number+"\n"+"Product Description: "+description+"\nPer pecs price: "+price+"\nQuantity: "+quantity+"\n------------------\nTotal: "+getInvoiceAmount();
    }
}