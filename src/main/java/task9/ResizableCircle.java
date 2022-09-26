package task9;

public class ResizableCircle extends Circle implements Resizable{

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resizable(int percent) {
        radius = radius * percent/ 100;

    }

    @Override
    public String toString() {
        return super.toString();
    }


}
