package demo_subkey_lt.demo_shareprogram.b1_1;

public class Worker1 extends Officer1 {
    private int level;

    public Worker1(String name, int age, String gender, String address, int level) {
        super(name, age, gender, address);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Worker1{" +
                "level=" + level +
                "} " + super.toString();
    }


}
