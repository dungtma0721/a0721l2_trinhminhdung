package ss6_Inheritance_Polymorphism.thuc_hanh;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("indigo", false, 3.5);
        //circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
    }
}
