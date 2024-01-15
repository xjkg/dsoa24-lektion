abstract class Clothing {
    public String name;
    public String brand;
    public String color;
    public double price;

    public String getName(){
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    abstract void mend();
}
