public class Bike extends Vehicle implements ShopFeatures{
    private double price = 0;
    public Bike(String name, double price) {
        super(name, "Pedal");
        this.price = price;
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

    @Override
    public double getPrice() {
        return price;
    }

}
