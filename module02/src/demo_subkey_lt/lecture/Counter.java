package demo_subkey_lt.lecture;

public class Counter {
    int count = 0;// thu them static ?? se khac..
    /*se lay bo nho (memory) khi bien instance duoc tao*/

    /*Ket qua thuc hien chuong trinh hien ra 3 so 1 o 3 dong*/
    Counter() {
        count++;
        System.out.println(count);
    }

//    public Counter() {
//        //count++;
//
//        System.out.println(count);
//    }


//    public static void in(){
//        count++;
//        System.out.println(count);
//    }

    public static void main(String args[]) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
//        in();
//        in();
//        in();
    }
}
