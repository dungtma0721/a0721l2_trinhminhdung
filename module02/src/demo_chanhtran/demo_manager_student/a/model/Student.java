package demo_chanhtran.demo_manager_student.a.model;

public class Student extends Person{
    private int point;
    private String subject;

    public Student() {
    }

    public Student(int point, String subject) {
        this.point = point;
        this.subject = subject;
    }

    public Student(int id, String name, int age, String address, int point, String subject) {
        super(id, name, age, address);
        this.point = point;
        this.subject = subject;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", point=" + point +
                ", subject='" + subject + '\'' +
                '}';
    }

    @Override
    public void goToBy() {

    }
    public void study(){
        System.out.println("sinh viên đang học");
    }

    @Override
    public boolean equals(Object o) {

        return ((Student)o).getName().equals(this.getName())&&((Student)o).getId()==(this.getId());
    }

    @Override
    public int hashCode() {
        return 12;
    }
}
