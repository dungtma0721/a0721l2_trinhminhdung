package demo_subkey_lt.demo_fx.demo_q.QQ;

public class Q5 {
    public static class Test {

        boolean method(boolean ans) {
            return ans;
        }

        boolean method(String ans) {
            return Boolean.valueOf(ans);
        }

        public static void main(String[] args) {
            Test test = new Test();
            System.out.print(test.method("true"));
        }
    }
}
