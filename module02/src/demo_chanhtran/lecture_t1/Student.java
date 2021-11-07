package demo_chanhtran.lecture_t1;

public class Student extends Person {
    String subject;

    public Student(String subject) {
        this.subject = subject;
    }

    public Student() {
    }

    public Student(int id, String name, String address) {
        super(id, name, address);
    }

    public Student(int id, String name, String address, String subject) {
        super(id, name, address);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void study(){
        System.out.println("Dang hoc mon" + this.subject);
    }
    public void registerSubject(){
        System.out.println("Da dk mon hoc");
    }
    public void registerSubject(String subject){
        System.out.println("Da dk mon hoc: "+ subject);
    }

    @Override
    public void goToBy() {
        //super.goToBy();
        System.out.println("Di lai bang xe may");
    }
    @Override
    public String toString() {
        return "Sinh vien{ id =" +this.id+ "- name: "+ this.name+ "- address: "+ this.address+ "- subject: "+ this.subject+"}";
    }

}
