public class Main {
    public static void main(String[] args) {

        Clothing shirt = new Shirt("Nike", "30€","Blue");


        Clothing shirt2 = new Shirt("Dressmann", "20€");


        Clothing hat = new Hat("Cowboy","60€");


        Clothing hat2 = new Hat("Fedora");


        System.out.println(shirt.getBrand() +"-shirt is "+shirt.getColor()+" and costs "+shirt.getPrice());
        System.out.println(shirt2.getBrand() +"-shirt is "+shirt2.getColor() +" and costs "+shirt2.getPrice());
        System.out.println(hat.getBrand() +"-hat is "+hat.getColor()+" and costs "+hat.getPrice());
        System.out.println(hat2.getBrand() +"-hat is "+hat2.getColor()+" and costs "+hat2.getPrice());



        Car car = new Car("Tesla");
        System.out.println(car.getName()+ " (" + car.getType()+ ")");
        car.soundWarning();
        car.refuel();

        Bike bike = new Bike("Jopo");
        System.out.println(bike.getName() + " (" + bike.getType()+ ")");
        bike.soundWarning();

        //Upcasting
        Vehicle todaysRide = new Car("Volvo");
        System.out.println(todaysRide.getName() + " " + todaysRide.getPrice());
        Vehicle tomorrowsRide = new Bike("Citybike");
        System.out.println(tomorrowsRide.getName()+ " " + tomorrowsRide.getPrice());

    }
}