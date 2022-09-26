package task6;

public class Shape {
    protected String color;
    protected boolean isFilled;

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public Shape (){
        this.color = "unknown";
        this.isFilled = false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    @Override
    public String toString() {
        return String.format("Shape with color of %s and %s", color,isFilled ? "filled" : "notFilled");
    }
}
