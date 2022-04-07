package lesson4;

public class CarTest {

    public static void main(String[] args) {

        Car peugeot = new Car(12, 4, 0, 1, "white", "V2");
        Car ferari = new SportCar(25, 15, 0, 1, "red", "V6");
        Car man = new FreightCar(45781, 32, 0, 3, "black", "V6");

        peugeot.numberOfDoors("");
        ferari.numberOfDoors("");
        man.numberOfDoors("");

        ferari.setSpeed(400);
        System.out.println(ferari.getSpeed());
        ferari.setFuel(60);
        System.out.println(ferari.getFuel());

        man.setSpeed(32);
        System.out.println(man.getSpeed());
        man.setFuel(60);
        System.out.println(man.getFuel());
    }
}