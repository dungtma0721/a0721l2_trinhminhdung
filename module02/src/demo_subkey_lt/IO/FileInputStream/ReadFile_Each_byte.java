package demo_subkey_lt.IO.FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile_Each_byte {
    public static void main(String[] args) {
        File file = new File("src/demo_subkey_lt/IO/FileInputStream/abc_FX.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int data = fileInputStream.read();
            while (data>-1){
                System.out.println(data);
                data = fileInputStream.read();
            }
            System.out.println(data);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
