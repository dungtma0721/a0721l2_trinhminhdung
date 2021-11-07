package demo_chanhtran.lecture_ss4;

public class Student {
    int id;
    String name;
    String address;
    static String school;
    static {
        school = "CodeGym";
        System.out.println(" Day la khoi static");
    }

    public Student() {
    }
    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Student(int id, String name, String address, String school) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.school = school;
    }
    // phuong thuc static
    public static void registerSubject(){
        System.out.println("Dang mon hoc");
        // tao doi tuong de vafo non static
        Student student = new Student();
        student.login();
    }
    public void login(){
        System.out.println("login");
    }



}
