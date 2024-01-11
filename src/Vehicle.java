public class Vehicle {

    private String name;    //deklarerar instansvariabeln name
    private String type;

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
        return 0;
    }
}
