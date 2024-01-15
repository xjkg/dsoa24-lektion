public class Car extends Vehicle {
    static int carsCreated = 0;
    //Klassvariabel, samma variabel för alla
    private int fuel = 0;
    public Car(String name){
        super(name, "Motor");
        carsCreated++;

    }
    @Override
    public void soundWarning(){
        System.out.println("*Horn*");
    }

    public void refuel(){
        this.fuel = 100;
    }

    public static int getCarsCreated() {
        return carsCreated;
    }
}
