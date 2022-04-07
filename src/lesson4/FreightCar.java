package lesson4;

public class FreightCar extends Car {

    public FreightCar(int mileage, int fuel, int speed, int coolantLevel, String color, String engine) {
        super(mileage, fuel, speed, coolantLevel, color, engine);
    }

    @Override
    public void numberOfDoors(String numberOfDoors) {
        System.out.println("number of doors is 3");
    }

    @Override
    public void setSpeed(int movementSpeed) {
        int speedLimit = 60;
        if (movementSpeed > 0 && movementSpeed < speedLimit)
            this.speed = speed + movementSpeed;
        else {
            System.out.println("Wrong speed. The indicator remained unchanged. ");
        }
    }

    @Override
    public void setFuel(int refueling) {
        int carTankLimit = 100;
        if (refueling > 0 && refueling <= (carTankLimit - fuel))
            this.fuel = fuel + refueling;
        else {
            System.out.println("Wrong fuel quantity. The indicator remained unchanged. ");
        }
    }
}
