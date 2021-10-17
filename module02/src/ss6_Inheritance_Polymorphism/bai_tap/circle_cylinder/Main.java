package ss6_Inheritance_Polymorphism.bai_tap.circle_cylinder;

public class Main {
    public static void main(String[] args) {
    Circle circle=new Circle();
    Circle circle2=new Circle(1,"red");
        System.out.println(circle);
        System.out.println(circle2);
    Cylinder cylinder=new Cylinder();
    Cylinder cylinder2=new Cylinder(1,"blue",2);
        System.out.println(cylinder);
        System.out.println(cylinder2);
    }
}
