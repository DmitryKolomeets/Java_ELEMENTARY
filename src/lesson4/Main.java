package lesson4;

public class Main {

    public static void main(String[] args) {

        Car ferrari = new SportCar(2541, 25, 0, 2, CarColor.PINK, BrandCar.LAMBORGHINI, CarBodyType.COUPE, EngineType.v6);

        System.out.println();
        System.out.println(ferrari.getCarColor());
        System.out.println();
        System.out.println(ferrari.getBrandCar());
        System.out.println();
        System.out.println(ferrari.getCarBodyType());
        System.out.println();
        System.out.println(ferrari.getEngineType());


    }


}