package lesson4;

public class FreightCar extends Car implements TakeAction{

     private final int kilometersToMaintenance = 10000;

    public FreightCar(int mileage, int fuel, int speed, int coolantLevel, String color, String engine) {
        super(mileage, fuel, speed, coolantLevel, color, engine);
    }

    @Override
    public boolean isReadyToService() {
        if (distanceOnService > kilometersToMaintenance) {
            return true;
        } else {
            return false;
        }
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

    @Override
    public void makeSound(String sound) {
        System.out.println("Tr-tr-tr");
    }

    @Override
    public void makeAMove(String move) {
        System.out.println("Troom-Troom");
    }
}
