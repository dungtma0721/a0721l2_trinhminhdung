package ss5_Acmodifier_static_method_pro_Encapsulation.thuc_hanh.static_method;

public class Student {
    private int rollno;
    private String name;
    public static String college = "BBDIT";// thu khac private ?? ok

    //constructor to initialize the variable

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    //static method to change the value of static variable
    static void change() {
        college = "CODEGYM";
    }
    //method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }


}
