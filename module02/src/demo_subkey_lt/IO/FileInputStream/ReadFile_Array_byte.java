package demo_subkey_lt.IO.FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile_Array_byte {
    public static void main(String[] args) {
        File file = new File("src/demo_subkey_lt/IO/FileInputStream/abc_FX.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] buff = new byte[1024];
            int length = fileInputStream.read(buff);

            while (length>0){
                String text = new String(buff,2,length-1);//https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#String(byte[],%20int,%20int)
                System.out.println(text);
                length = fileInputStream.read(buff);
            }
            fileInputStream.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
