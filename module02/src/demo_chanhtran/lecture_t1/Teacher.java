package demo_chanhtran.lecture_t1;

public class Teacher extends Employee{

    public Teacher(double salary) {
        super(salary);
    }

    public Teacher(int id, String name, String address, double salary) {
        super(id, name, address, salary);
    }
    public void teach(){
        System.out.println("Co the day hoc");
    }

    @Override
    public void goToBy() {
        System.out.println("Teacher di lai bang xe dap");
    }
}
