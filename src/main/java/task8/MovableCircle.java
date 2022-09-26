package task8;

public class MovableCircle implements Movable {
    private MovablePoint movablePoint;
    private int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.movablePoint = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        movablePoint.moveUp();

    }

    @Override
    public void moveDown() {
        movablePoint.moveDown();

    }

    @Override
    public void moveLeft() {
        movablePoint.moveLeft();

    }

    @Override
    public void moveRight() {
        movablePoint.moveRight();

    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "movablePoint=" + movablePoint +
                ", radius=" + radius +
                '}';
    }
}
