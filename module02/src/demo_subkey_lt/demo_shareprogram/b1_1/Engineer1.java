package demo_subkey_lt.demo_shareprogram.b1_1;

public class Engineer1 extends Officer1{
    private String branch;
    public Engineer1(String name, int age, String gender, String address) {
        super(name, age, gender, address);
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Engineer1{" +
                "branch='" + branch + '\'' +
                "} " + super.toString();
    }

}
