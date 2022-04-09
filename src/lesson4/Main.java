package lesson4;

public class Main {

    public static void main(String[] args) {

        Car peugeot = new SportCar(12, 4, 0, 1, "white", "V2");
        Car ferari = new SportCar(25, 15, 0, 1, "red", "V6");
        Car man = new FreightCar(0, 32, 0, 3, "black", "V6");

//        peugeot.numberOfDoors("");
//        ferari.numberOfDoors("");
//        man.numberOfDoors("");
//
//        ferari.setSpeed(400);
//        System.out.println(ferari.getSpeed());
//        ferari.setFuel(60);
//        System.out.println(ferari.getFuel());
//
//        man.setSpeed(32);
//        System.out.println(man.getSpeed());
//        man.setFuel(60);
//        System.out.println(man.getFuel());
//

        System.out.println(man.mileage);
        man.addDistance(11000);
        System.out.println(man.mileage);
        System.out.println(man.isReadyToService());
        System.out.println(man.getDistanceOnService());
        man.addDistance(13000);
        System.out.println(man.getDistanceOnService());
        man.addDistance(43547);
        System.out.println(man.getDistanceOnService());

        System.out.println(ferari.mileage);
        ferari.addDistance(4250);
        System.out.println(ferari.mileage);
        System.out.println(ferari.getDistanceOnService());
        System.out.println();

        Cow cow = new Cow();
        cow.makeAMove("");
        cow.makeSound("");
        System.out.println();

        man.makeAMove("");
        man.makeSound("");
        System.out.println();

        ferari.makeAMove("");
        ferari.makeSound("");

    }



}