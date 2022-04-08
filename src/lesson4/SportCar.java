package lesson4;

public class SportCar extends Car {


    public SportCar(int mileage, int fuel, int speed, int coolantLevel, String color, String engine) {
        super(mileage, fuel, speed, coolantLevel, color, engine);
    }
    private final int kilometersToMaintenance = 5000;

    @Override
    public boolean isReadyToService() {
        return false;
    }

    @Override
    public int getDistanceOnService() {
        int mileageToServiceCheck = (mileage - kilometersToMaintenance);
        if ((mileageToServiceCheck) <= 0) {
            return distanceOnService = Math.abs(mileageToServiceCheck);
        } else return distanceOnService = kilometersToMaintenance - (mileage % kilometersToMaintenance);
    }

    @Override
    public void addDistance(int additionalDistance) {
        if (additionalDistance > 0) {
            this.mileage += additionalDistance;
            distanceOnService += additionalDistance;
        }

        if (additionalDistance < 0) {

            throw new ArithmeticException("Введен отрицательный пробег");
        }
    }

    @Override
    public void addDistance(double additionalDistance) {
        if (additionalDistance > 0) {

            this.mileage += additionalDistance;
            distanceOnService += additionalDistance;
        }

        if (additionalDistance < 0) {

            throw new ArithmeticException("Введен отрицательный пробег");
        }
    }

    @Override
    public void numberOfDoors(String numberOfDoors) {
        System.out.println("number of doors is 2");
    }

    @Override
    public void setSpeed(int movementSpeed) {
        speedLimit = 450;
        if (movementSpeed > 0 && movementSpeed < speedLimit)
            this.speed = speed + movementSpeed;
        else {
            System.out.println("Wrong speed. The indicator remained unchanged. ");
        }
    }

    @Override
    public void setFuel(int refueling) {
        int carTankLimit = 80;
        if (refueling > 0 && refueling <= (carTankLimit - fuel))
            this.fuel = fuel + refueling;
        else {
            System.out.println("Wrong fuel quantity. The indicator remained unchanged. ");
        }
    }
}
