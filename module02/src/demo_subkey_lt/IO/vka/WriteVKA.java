package demo_subkey_lt.IO.vka;

import java.io.*;

public class WriteVKA {
    public static void main(String[] args) throws IOException {
        String a[] = new String[3];
        a[0] = "Macbook";
        a[1] = "Del";
        a[2] ="HP";
        File file = new File("src/demo_subkey_lt/IO/vka/text_W.txt");
        OutputStream outputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        for (String item: a){
            outputStreamWriter.write(item);
        }
        //outputStreamWriter.flush();
        outputStreamWriter.close();

    }
}
