public class Hat extends Clothing {
    public Hat(String brand, double price, String color) {
        super.brand = brand;
        super.price = price;
        super.color = color;

    }
    public Hat(String brand, double price) {
        super.brand = brand;
        super.price = price;
        super.color = "default";

    }
    public Hat(String brand) {
        super.brand = brand;
        super.price = 0;
        super.color = "default";
    }
    public Hat() {
        super.brand = "no-name";
    }

    @Override
    void mend() {
        System.out.println("Hat is mended");
    }
}
