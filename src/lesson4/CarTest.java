package lesson4;

public class CarTest {

    public static void main(String[] args) {

        Car volvo = new Car(6748, 3, 0, 4, "red", "V4");

        System.out.println(volvo.getEngine());
        volvo.setMileage(3000);
        System.out.println(volvo.getMileage());
        volvo.setMileage(1348);
        System.out.println(volvo.getMileage());




    }
}