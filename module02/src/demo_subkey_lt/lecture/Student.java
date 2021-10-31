package demo_subkey_lt.lecture;

public class Student {
    int rollno;
    String name;
    static String college = "BachKhoa";
    String address = "114";

    static void change() {
        college = "QuocGia";
    }

    Student(int r, String n) { //constructor
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college + " " + address);
    }

    public static void main(String args[]) {
        Student.change(); // ????CLASS GOI PHUONG THUC
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Thanh");
        Student s3 = new Student(333, "Nam");
        s1.display();
        s2.display();
        s3.display();
    }
}
