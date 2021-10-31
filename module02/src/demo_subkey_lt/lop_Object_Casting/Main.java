package demo_subkey_lt.lop_Object_Casting;

public class Main extends Object{
    public static void main(String[] args) {
        Object obj = new Main();
        System.out.println( obj instanceof Main );
        System.out.println( obj instanceof Object );
        Object a = obj;
        System.out.println( a instanceof Main );
        System.out.println( a instanceof Object );


    }
}
