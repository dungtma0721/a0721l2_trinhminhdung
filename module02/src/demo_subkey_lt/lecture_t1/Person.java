package demo_subkey_lt.lecture_t1;

public class Person {
    protected int id;
    protected String name;
    protected String address;

    public Person() {
    }

    public Person(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void goToBy(){
        System.out.println("Di bo hoac use phuong tien");
    }
// TODO: 10/14/2021
@Override
public String toString() {
    return "Person{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", address='" + address + '\'' +
            '}';
}
}
