import java.io.Serializable;

public class Vehicle implements Serializable {

    private String name;    //deklarerar instansvariabeln name
    private String type;
    public double price;
    public void soundWarning(){
        System.out.println("*Default Sound*");
    }

    public Vehicle(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName(){
        return name; //this krävs inte eftersom den tidigare parametern inte är tillgänglig här
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
