public class Main {
    public static void main(String[] args) {
        Clothing shirt = new Shirt("T-shirt");
        shirt.setBrand("Nike");
        shirt.setPrice("40€");
        shirt.setColor("Blue");

        Clothing shirt2 = new Shirt("Dress-Shirt");
        shirt2.setBrand("Dressmann");
        shirt2.setPrice("60€");
        shirt2.setColor("White");

        Clothing hat = new Hat("Cowboy-Hat");
        hat.setBrand("Epic Costumes");
        hat.setPrice("20€");
        hat.setColor("Brown");

        Clothing hat2 = new Hat("Fedora");
        hat2.setBrand("Epic Costumes");
        hat2.setPrice("10€");
        hat2.setColor("Black");

        System.out.println(shirt.getName() +" "+shirt.getBrand() +" "+shirt.getColor()+" "+shirt.getPrice());
        System.out.println(shirt2.getName() +" "+shirt2.getBrand() +" "+shirt2.getColor()+" "+shirt2.getPrice());
        System.out.println(hat.getName() +" "+hat.getBrand() +" "+hat.getColor()+" "+hat.getPrice());
        System.out.println(hat2.getName() +" "+hat2.getBrand() +" "+hat2.getColor()+" "+hat2.getPrice());


        Bike bike = new Bike("Jopo");
        System.out.println(bike.getName() + " (" + bike.getType()+ ")");

        Car car = new Car("Tesla");
        System.out.println(car.getName()+ " (" + car.getType()+ ")");

        Car car2 = new Car("Fiat");
        System.out.println(car2.getName()+ " (" + car.getType()+ ")");

        car2.setName("Toyota");
        System.out.println(car2.getName()+ " (" + car.getType()+ ")");


    }
}