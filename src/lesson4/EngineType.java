package lesson4;

public enum EngineType {
    V1("1 Cylinder"),
    V2("2 Cylinders"),
    V3("3 Cylinders"),
    V4("4 Cylinders"),
    v6("6 Cylinders"),
    v8("8 Cylinders");

    public  String engineType;

    EngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    @Override
    public String toString() {
        return "EngineType " +
                "= '" + engineType + '\'';
    }
}
