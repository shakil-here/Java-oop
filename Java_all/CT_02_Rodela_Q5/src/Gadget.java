class Gadget {
    private final String company;
    private final int price;

    public Gadget(String company, int price) {
        this.company = company;
        this.price = price;

    }

    public String getCompany() {
        return company;
    }

    public int getPrice() {
        return price;
    }

}

class SmartPhone extends Gadget {
    private final String model;

    public SmartPhone(String company, int price, String model) {
        super(company, price);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Company: " + getCompany() + ", Price: " + getPrice() + ", Model: " + getModel();
    }

}

