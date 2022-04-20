package lesson4;

public enum BrandCar {
    TOYOTA("Toyota"),
    FERRARI("Ferrari"),
    MITSUBISHI("Mitsubishi"),
    MACLAREN("MaCLaren"),
    LOTUS("Lotus"),
    BMW("BMW"),
    LAMBORGHINI("Lamborghini"),
    AUDI("Audi");

    public String size;

    BrandCar(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "BrandCar " +
                "= '" + size + '\'';
    }
}
