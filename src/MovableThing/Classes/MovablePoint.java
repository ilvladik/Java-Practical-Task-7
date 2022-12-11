package MovableThing.Classes;

public class MovablePoint implements Movable {

    public int xSpeed;
    public int ySpeed;
    private int x;
    private int y;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "Point (" +
                " x = " + x + " y = " + y +
                " xSpeed = " + xSpeed + " ySpeed = " + ySpeed + " )";
    }

    @Override
    public void moveUp() {
        y += ySpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    @Override
    public void moveDown() {
        y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }
}
