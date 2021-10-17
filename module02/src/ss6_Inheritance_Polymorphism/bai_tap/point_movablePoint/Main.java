package ss6_Inheritance_Polymorphism.bai_tap.point_movablePoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        Point point2 = new Point(1,1);
        System.out.println(point);
        System.out.println(point2);
        MovablePoint movablePoint = new MovablePoint();
        MovablePoint movablePoint2 = new MovablePoint(1,2,3,4);
        System.out.println(movablePoint);
        System.out.println(movablePoint2);
    }
}
