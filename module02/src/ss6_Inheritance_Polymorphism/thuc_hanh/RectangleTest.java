package ss6_Inheritance_Polymorphism.thuc_hanh;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        //rectangle = new Rectangle(2.5, 3.8, "orange", true);
        rectangle=new Rectangle("red",true,2.5,3.8);
        System.out.println(rectangle);
    }
}
