package demo_subkey_lt.accessmodifier.accessModifier1;

public class c1 {
    public int sum(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        c1 tong1 = new c1();
        System.out.println(tong1.sum(5,1));
    }

    public c1() {
    }

}
