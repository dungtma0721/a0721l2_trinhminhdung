package ss6_Inheritance_Polymorphism.bai_tap.circle_cylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double volume(){
        return (height*getRadius()*getRadius()*Math.PI);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + getRadius() +
                ", color='" + getColor() +
                ", height=" + height +
                '}';
    }
}
