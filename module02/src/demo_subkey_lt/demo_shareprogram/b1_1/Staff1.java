package demo_subkey_lt.demo_shareprogram.b1_1;

public class Staff1 extends Officer1{
    private String task;
    public Staff1(String name, int age, String gender, String address, String task) {
        super(name, age, gender, address);
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "Staff1{" +
                "task='" + task + '\'' +
                "} " + super.toString();
    }
}
