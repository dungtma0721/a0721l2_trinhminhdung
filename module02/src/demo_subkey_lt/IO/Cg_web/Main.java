package demo_subkey_lt.IO.Cg_web;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("nam", 20);
        File file = new File("src/demo_subkey_lt/IO/Cg_web/Object.dat");
        try {
            if (!file.exists()) {
                if (file.createNewFile()) {
                    FileOutputStream fos = new FileOutputStream(file);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(person);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
