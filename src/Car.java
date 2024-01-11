public class Car extends Vehicle {
    private int fuel = 0;
    public Car(String name){
        super(name, "Motor");

    }
    @Override
    public void soundWarning(){
        System.out.println("*Horn*");
    }
    @Override
    public double getPrice(){
        return 1000;
    }
    public void refuel(){
        this.fuel = 100;
    }

}
