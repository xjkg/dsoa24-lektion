public class Bike extends Vehicle {
    public Bike(String name) {
        super(name, "Pedal");
    }
    @Override
    public void soundWarning(){
        System.out.println("*Bell*");
    }

}
