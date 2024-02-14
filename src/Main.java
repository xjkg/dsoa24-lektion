import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    //konstant skapas med static final
    static final double GAME_VERSION = 1.0;

    public static void main(String[] args) {
    new BigO();
    String[] weekDays = { "Måndag", "Tisdag", "Onsdag", "Torsdag", "Fredag", "Lördag", "Söndag" };
    StringArray days = new StringArray(weekDays);
    int today = 2;
    int daysahead = 7;
    int futureindex = (today + daysahead) % days.size();
    System.out.printf("I dag är det %s\n", days.get(today));
    System.out.printf("I övermorgon är det %s\n", weekDays[today+2]);
    System.out.printf("Om %d dagar är det %s\n", daysahead, weekDays[futureindex]);
    /*
    String[] meleeChars = {"Mario", "Luigi","Link","Ganon","Zelda","Marth","Ike","Mewtwo","Pikachu","Mr.Game n' Watch","Captain Falcon","Peach"};
    StringArray ssbm = new StringArray(meleeChars);

    Person falco = new Person("Falco");
    Person sheik = new Person("Sheik");
    Person fox = new Person("Fox");

    System.out.println("ssbm size: "+ssbm.size());
    System.out.println(ssbm);
    ssbm.add(0, "Fox");
    System.out.println(ssbm);
    ssbm.reverse();
    System.out.println(ssbm);




DSOA BATTLEGAME ERA
        FileUtils.writeTextFile("hello.txt", "hello!");
        String fileContent = FileUtils.readTextFile("hello.txt");

        System.out.println(fileContent);


        int myInt = Utils.getIntInput("Skriv ett heltal");

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

        default constructor Foo foo = new Foo();


        Bike bike = new Bike("Jopo", 300, DiscountCategory.DEMO);
        BikeShop bikeShop = new BikeShop();
        bikeShop.addBike(bike);
        bikeShop.addBike(new Bike("Harley", 1500, DiscountCategory.RETURNED));
        for (int i = 0; i < bikeShop.getBikes().size() ; i++) {
            System.out.printf("%d %s %.2f €\n",
                    i,
                    bikeShop.getBikes().get(i).getName(),
                    bikeShop.getBikes().get(i).getPrice());

        }

        Customer customer;
        Customer loadedCustomer = (Customer) FileUtils.loadObject("customer.sav");
        if (loadedCustomer != null) {
            customer = loadedCustomer;
        } else {
            customer = new Customer(1000);
        }

        customer.buyBike(bikeShop.chooseBike());
        if(customer.getCurrentBike() != null) {
            System.out.printf("Du köpte en %s, du har %.2f€ kvar",customer.getCurrentBike().getName(),customer.getFunds());
            FileUtils.saveObject(customer, "customer.sav");
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
                drivers.get("lisa").getName()); */
    }
}