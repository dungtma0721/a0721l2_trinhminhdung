package ss4_class_object.thuc_hanh;

public class Rectangle { // // Create a class
    double width, height;
    public Rectangle() { //// Create a class constructor for the  class
    }
    public Rectangle(double width, double height) { //hieu la:  constructor
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }
    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
