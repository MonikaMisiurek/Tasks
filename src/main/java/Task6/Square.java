package Task6;

public class Square extends Rectangle{

    public Square(String color, boolean isFilled, double width, double length) {
        super(color, isFilled, width, length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }


    @Override
    public void setLength(double length) {
        super.setWidth(length);
        super.setLength(length);
    }

    @Override
    public String toString() {
        return String.format("Square with windth=%f and length=%f which is subclass off %s",width,length,super.toString());

    }
}
