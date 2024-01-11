public class Vehicle {
    public String name;    //deklarerar instansvariabeln name
    public String type;
    public String getName(){
        return name; //this krävs inte eftersom den tidigare parametern inte är tillgänglig här
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
