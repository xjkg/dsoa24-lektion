public class Main {
    public static void main(String[] args) {

        Car car = new Car("Tesla");
        System.out.println(car.getName());

        Car car2 = new Car("Fiat");
        System.out.println(car2.getName());

        car2.setName("Toyota");
        System.out.println(car2.getName());
    }
}