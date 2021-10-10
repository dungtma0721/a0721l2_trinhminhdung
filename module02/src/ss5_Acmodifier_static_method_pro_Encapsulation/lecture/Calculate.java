package ss5_Acmodifier_static_method_pro_Encapsulation.lecture;

public class Calculate {
    static int cube(int x) {
        return x * x * x;
    }

    public static void main(String args[]) {
        int result = Calculate.cube(5);
        System.out.println(result);
    }
}
