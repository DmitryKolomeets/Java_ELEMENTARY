package lesson4;

import javax.swing.*;

public class Car {

    private int mileage;
    private int fuel;
    private int speed;
    private int coolantLevel; // Litres
    private String color;
    private String engine;
    private final int dailyMileageMax = 2000;
    private final int carTankLimit = 60;
    private int distanceOnService;

    public Car() {
    }

    public Car(int mileage, int fuel, int speed, int coolantLevel, String color, String engine) {
        this.mileage = mileage;
        this.fuel = fuel;
        this.speed = speed;
        this.coolantLevel = coolantLevel;
        this.color = color;
        this.engine = engine;
    }

    public void addDistance(int additionalMileage) {
        if (additionalMileage > 0) {

            mileage += additionalMileage;
            distanceOnService += additionalMileage;
        }

        if (additionalMileage < 0 ) {

            throw new ArithmeticException("Введен отрицательный пробег");
        }

    }
    public void addDistance(double additionalMileage) {
        if (additionalMileage > 0) {

            mileage += additionalMileage;
            distanceOnService += additionalMileage;
        }

        if (additionalMileage < 0 ) {

            throw new ArithmeticException("Введен отрицательный пробег");
        }

    }


    public int getMileage() {
        return mileage;
    }

    public void setMileage(int dailyMileage) {
        if (dailyMileage > 0 && dailyMileage <= dailyMileageMax)
            this.mileage = mileage + dailyMileage;
            else {
            System.out.println("Wrong mileage. The indicator remained unchanged. ");
        }
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int refueling) {
        if (refueling > 0 && refueling <= (carTankLimit - fuel))
            this.fuel = fuel + refueling;
        else {
            System.out.println("Wrong fuel quantity. The indicator remained unchanged. ");
        }
    }

    public int getSpeed() {
        return speed;

    }

    public void setSpeed(int movementSpeed) {
        if (movementSpeed > 0 && movementSpeed < 330)
            this.speed = speed + movementSpeed;
        else {
            System.out.println("Wrong speed. The indicator remained unchanged. ");
        }
    }

    public int getCoolantLevel() {
        return coolantLevel;
    }

    public void setCoolantLevel(int coolantAdd) {
        if (coolantAdd > 0 && coolantAdd <= (5 - coolantLevel))
            this.coolantLevel = coolantLevel + coolantAdd;
        else if (coolantAdd < 0 && Math.abs(coolantAdd) <= coolantLevel)
            this.coolantLevel = coolantLevel - Math.abs(coolantAdd);
        else {
            System.out.println("Check coolantAdd data. The indicator remained unchanged. ");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String colorChange) {
        if (colorChange.equals("red") || colorChange.equals("black") || colorChange.equals("white"))
            this.color = colorChange;
else {
            System.out.println("Wrong color. The indicator remained unchanged. ");
        }
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engineChange) {
        if (engineChange.equals("V6") || engineChange.equals("V4") || engineChange.equals("V2"))
        this.engine = engineChange;
        else {
            System.out.println("Wrong Engine type. The indicator remained unchanged. ");
        }
    }

    public static void main(String[] args) {

        Car mclaren = new Car(13453, 12, 0, 2, "white", "V6");
        Car reno = new Car();

        mclaren.setMileage(250);
        System.out.println(mclaren.getMileage());
        mclaren.setMileage(2000);
        System.out.println(mclaren.getMileage());
        mclaren.setMileage(-150);                  // invalid data - method don't work
        System.out.println(mclaren.getMileage());
        mclaren.setMileage(6000);                  // invalid data - method don't work
        System.out.println(mclaren.getMileage());

        mclaren.setFuel(48);
        System.out.println(mclaren.getFuel());
        mclaren.setFuel(47);                       // invalid data - method don't work
        System.out.println(mclaren.getFuel());

        mclaren.setSpeed(13);
        System.out.println(mclaren.getSpeed());
        mclaren.setSpeed(500);                     // invalid data - method don't work
        System.out.println(mclaren.getSpeed());

        mclaren.setCoolantLevel(3);
        System.out.println(mclaren.getCoolantLevel());
        mclaren.setCoolantLevel(-6);               // invalid data - method don't work
        System.out.println(mclaren.getCoolantLevel());
        mclaren.setCoolantLevel(-4);
        System.out.println(mclaren.getCoolantLevel());

        mclaren.setColor("black");
        System.out.println(mclaren.getColor());
        mclaren.setColor("red");
        System.out.println(mclaren.getColor());
        mclaren.setColor("pink");                 // invalid color - method don't work
        System.out.println(mclaren.getColor());

        mclaren.setEngine("V2");
        System.out.println(mclaren.getEngine());
        mclaren.setEngine("V12");                // invalid Engine - method don't work
        System.out.println(mclaren.getEngine());


    }
}
