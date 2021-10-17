package lop_Object_Casting;

public class Dog3 extends Animal{
    static void method(Animal a) {
        if (a instanceof Dog3) {
            Dog3 d = (Dog3) a;// downcasting
            System.out.println("downcasting is ok");
        }
    }

    public static void main(String[] args) {
        Animal a = new Dog3();
        Dog3.method(a);
    }
}
