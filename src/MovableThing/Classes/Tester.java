package MovableThing.Classes;

public class Tester {

    public static void main(String[] args) {

        MovablePoint point_one = new MovablePoint(1, 2, 3, 4);
        MovablePoint point_two = new MovablePoint(5, 6, 3, 4);
        MovablePoint point_three = new MovablePoint(2, 4, 3, 3);

        MovableRectangle rectangle_one = new MovableRectangle(point_one, point_two);
        MovableRectangle rectangle_two = new MovableRectangle(point_one, point_three);

        System.out.println("rectangle_one = " + rectangle_one);
        rectangle_one.moveUp();
        System.out.println("rectangle_one = " + rectangle_one);

        System.out.println("rectangle_two = " + rectangle_two);
        rectangle_two.moveDown();
        System.out.println("rectangle_two = " + rectangle_two);

    }
}
