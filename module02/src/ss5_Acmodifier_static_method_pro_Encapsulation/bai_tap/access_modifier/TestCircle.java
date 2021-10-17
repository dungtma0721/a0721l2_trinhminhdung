package ss5_Acmodifier_static_method_pro_Encapsulation.bai_tap.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3,"red");
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());
    }
}
