package demo_subkey_lt.IO.Cg_web;
import java.io.Serializable;

public class Person implements Serializable {
    //private static final long serialVersionUID = L;
    private String name;
    private Integer age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}