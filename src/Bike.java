public class Bike extends Vehicle implements ShopFeatures{
    private double price = 0;
    DiscountCategory discountCat;
    public Bike(String name, double price) {
        super(name, "Pedal");
        this.price = price;
        discountCat = DiscountCategory.NEW;
    }
    public Bike(String name, double price, DiscountCategory discountCat){
        super(name, "Pedal");
        this.price = price;
        this.discountCat = discountCat;
    }
    public Bike(String name) {
        super(name, "Pedal");
        super.price = price;
    }
    @Override
    public void soundWarning(){
        System.out.println("*Bell*");
    }

    @Override
    public String getProductNumber() {
        return null;
    }
    public double getNetPrice(){
        double netPrice = price;
        switch(discountCat) {
            case DEMO:
                netPrice = price * 0.95;
                break;
            case RETURNED:
                netPrice = price * 0.9;
                break;
            default:
                netPrice = price;
        }
        return price;
    }

    @Override
    public double getPrice() {
        return price;
    }

}
