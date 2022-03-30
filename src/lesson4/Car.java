package lesson4;

public class Car {

    private int mileage;
    private int fuel;
    private int speed;
    private int coolantLevel; // Litres
    private String color;
    private String engine;

    public Car() {} // Сonstructor without parameters

    public Car(int mileage, int fuel, int speed, int coolantLevel, String color, String engine) {
        this.mileage = mileage;
        this.fuel = fuel;
        this.speed = speed;
        this.coolantLevel = coolantLevel;
        this.color = color;
        this.engine = engine;
    }





    public static void main(String[] args) {

        Car mclaren = new Car(13453, 12, 0, 2, "white", "V6");
        Car reno = new Car();


    }
}
