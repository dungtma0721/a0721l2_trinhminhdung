package ss4_class_object.bai_tap.fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
       // khong tao Constructor
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString2());

        fan2.setSpeed(2);
        fan2.setRadius(5);
        //fan1.setColor("Yel");
        fan2.setOn(false);
        System.out.println(fan2.toString2());

    }
}
