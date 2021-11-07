package demo_chanhtran.ss6_ke_thua;

public  class Employee  extends Person{
    double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, String address, double salary) {
        super(id, name, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
