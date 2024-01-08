public class Car {
    private String name;    //deklarerar instansvariabeln name

    public Car(String name){
        this.name = name; //this.name hänvisar till instansvariabeln, name är parameter
    }
    public String getName(){
        return name; //this krävs inte eftersom den tidigare parametern inte är tillgänglig här
    }
    public void setName(String name) {
        this.name = name;
    }

}
