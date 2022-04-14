package lesson4;

public enum CarBodyType {
    SEDAN("Sedan"),
    HATCHBACK("Hatchback"),
    COUPE("Coupe"),
    HARDTOP("Hardtop"),
    LIFTBACK("Liftback");

    public String size;

    CarBodyType(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "CarBodyType " +
                "= '" + size + '\'';
    }
}
