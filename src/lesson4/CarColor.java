package lesson4;

public enum CarColor {
    GREEN("Green"),
    BLUE("Blue"),
    PINK("Pink"),
    BROWN("Brown"),
    BLACK("Black"),
    WHITE("White"),
    RED("Red"),
    YELLOW("Yellow");

    public String titleColor;

    CarColor(String titleColor) {
        this.titleColor = titleColor;
    }



    @Override
    public String toString() {
        return "CarColor " +
                "= '" + titleColor + '\''
                ;
    }
}
