import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    //konstant skapas med static final
    static final double GAME_VERSION = 1.0;

    public static void main(String[] args) {
        Random random = new Random();
        Scanner intInput = new Scanner(System.in);
        Scanner strInput = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.printf("Slumptal: %d", random.nextInt(1, 100));
        System.out.printf("\nenter för ett nytt tal, Q för att avsluta");

        while (true) {
            String hmnInput = strInput.nextLine();
                if (hmnInput.equals("q")) {
                    System.exit(0);
                    break;
                }else if (hmnInput.equals("")) {
                    System.out.printf("Slumptal: %d", random.nextInt(1, 100));
                    System.out.printf("\nenter för ett nytt tal, Q för att avsluta");
                }
        }

        //default constructor
        Foo foo = new Foo();

        Bike bike = new Bike("Jopo", 300);
        BikeShop bikeShop = new BikeShop();
        bikeShop.addBike(bike);
        bikeShop.addBike(new Bike("Harley", 1500));
        for (int i = 0; i < bikeShop.getBikes().size() ; i++) {
            System.out.printf("%d %s %.2f €\n",
                    i,
                    bikeShop.getBikes().get(i).getName(),
                    bikeShop.getBikes().get(i).getPrice());

        }



        Shirt shirt = new Shirt("Nike", 30,"Blue");
        System.out.println(shirt.getCondition());

        Clothing shirt2 = new Shirt("Dressmann", 40);


        Clothing hat = new Hat("Cowboy",60);


        Clothing hat2 = new Hat("Fedora");


        System.out.println(shirt.getBrand() +"-shirt is "+shirt.getColor()+" and costs "+shirt.getPrice());
        System.out.println(shirt2.getBrand() +"-shirt is "+shirt2.getColor() +" and costs "+shirt2.getPrice());
        System.out.println(hat.getBrand() +"-hat is "+hat.getColor()+" and costs "+hat.getPrice());
        System.out.println(hat2.getBrand() +"-hat is "+hat2.getColor()+" and costs "+hat2.getPrice());



        Car car = new Car("Tesla");
        Car car2 = new Car("Volkswagen");
        System.out.printf(
                "Brand: %s, it is %s and it costs %.2f\n",
                car.getName(),
                car.getType(),
                car.getPrice()

                );
        car.soundWarning();
        car.refuel();


        System.out.println(bike.getName() + " (" + bike.getType()+ ")");
        bike.soundWarning();

        //Upcasting
        Vehicle todaysRide = new Car("Volvo");
        System.out.println(todaysRide.getName() + " " + todaysRide.getPrice());
        Vehicle tomorrowsRide = new Bike("Citybike", 35);
        System.out.println(tomorrowsRide.getName()+ " " + tomorrowsRide.getPrice());

        System.out.println("Cars created: "+Car.getCarsCreated());
        HashMap<String,Car> drivers = new HashMap<>();

        drivers.put("kalle",car);
        drivers.put("lisa",car2);

        System.out.printf("Kalle kör en %s, och Lisa kör en %s\n",
                drivers.get("kalle").getName(),
                drivers.get("lisa").getName());
    }
}