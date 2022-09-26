package Task6;

public class Circle extends Shape{
    private double radius;

    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public Circle() {
        super();
        this.radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){
        return 2*3.14*radius;
    }
    @Override
    public String toString() {
        return String.format("Circle with radius=%f which is subclass off %s", radius, super.toString());
    }


}
