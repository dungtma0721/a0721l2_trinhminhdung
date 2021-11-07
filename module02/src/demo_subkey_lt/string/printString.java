package demo_subkey_lt.string;

public class printString {
    public static void printStrings(String s, int n){
        String str = "";
        for (int i = 1; i < n; i++) {
            str +=s;
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        String s = "ab";
        printStrings(s, 5);
    }
}
