package demo_subkey_lt.override;

public class Bike2 extends Vehicle {
    static void run() {
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
//        Bike2 obj = new Bike2();
//        obj.run();
        Vehicle.run();
    }
}
