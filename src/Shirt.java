public class Shirt extends Clothing implements ShopFeatures{
    public Shirt(String brand, double price, String color) {
        super.brand = brand;
        super.price = price;
        super.color = color;

    }
    public Shirt(String brand, double price) {
        super.brand = brand;
        super.price = price;
        super.color = "default";

    }
    public Shirt(String brand) {
        super.brand = brand;
        super.price = 0;
        super.color = "default";
    }
    public Shirt() {
        super.brand = "no-name";
    }

    @Override
    void mend() {
        System.out.println("Shirt is mended");
    }

    @Override
    public String getProductNumber() {
        return null;
    }



}
