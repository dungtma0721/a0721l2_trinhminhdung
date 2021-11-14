package demo_x.b;

public class ThrowExample {
    static void validate(int age) {
        if (age < 18)
            //throw new ArithmeticException("not valid");
            throw new ArithmeticException("bkkkk");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String args[]) {
        validate(19);
        System.out.println("rest of the code...");
    }
}
