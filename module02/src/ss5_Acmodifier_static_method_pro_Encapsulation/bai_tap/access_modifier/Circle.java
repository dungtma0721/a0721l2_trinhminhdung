package ss5_Acmodifier_static_method_pro_Encapsulation.bai_tap.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
    double getArea() { // thay doi access modifier (public, protected, no modifier, private) --> test lai
        return radius*radius*Math.PI;
    }
}
