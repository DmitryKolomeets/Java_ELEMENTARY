package lesson4;


public abstract class Car implements TakeAction {

    protected int mileage = 0;
    protected int fuel;
    protected int speed;
    private int coolantLevel; // Litres
    private CarColor carColor;
    private BrandCar brandCar;
    private CarBodyType carBodyType;
    private EngineType engineType;
    private final int dailyMileageMax = 2000;
    private final int carTankLimit = 60;
    protected int distanceOnService;
    protected int speedLimit = 330;


    public Car() {
    }

    public Car(int mileage, int fuel, int speed, int coolantLevel, CarColor carColor, BrandCar brandCar, CarBodyType carBodyType, EngineType engineType) {
        this.mileage = mileage;
        this.fuel = fuel;
        this.speed = speed;
        this.coolantLevel = coolantLevel;
        this.carColor = carColor;
        this.brandCar = brandCar;
        this.carBodyType = carBodyType;
        this.engineType = engineType;
    }

    abstract public boolean isReadyToService();

    abstract public int getDistanceOnService();

    abstract public void addDistance(int additionalDistance);

    abstract public void addDistance(double additionalDistance);


    public void numberOfDoors(String numberOfDoors) {
        System.out.println("number of doors is 5");

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

    public void setSpeed(double movementSpeed) {
        if (movementSpeed > 0 && movementSpeed < speedLimit)
            this.speed = (int) (speed + movementSpeed);
        else {
            System.out.println("Wrong speed. The indicator remained unchanged. ");
        }
    }

    public void setSpeed(long movementSpeed) {
        if (movementSpeed > 0 && movementSpeed < speedLimit)
            this.speed = (int) (speed + movementSpeed);
        else {
            System.out.println("Wrong speed. The indicator remained unchanged. ");
        }
    }

    public void setSpeed(int movementSpeed) {
        if (movementSpeed > 0 && movementSpeed < speedLimit)
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

    public CarColor getCarColor() {
        return carColor;
    }

    public void setCarColor(CarColor carColor) {
        this.carColor = carColor;
    }

    public BrandCar getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(BrandCar brandCar) {
        this.brandCar = brandCar;
    }

    public CarBodyType getCarBodyType() {
        return carBodyType;
    }

    public void setCarBodyType(CarBodyType carBodyType) {
        this.carBodyType = carBodyType;
    }


    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public static void main(String[] args) {


    }
}
