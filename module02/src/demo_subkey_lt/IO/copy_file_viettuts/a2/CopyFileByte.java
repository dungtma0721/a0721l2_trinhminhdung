package demo_subkey_lt.IO.copy_file_viettuts.a2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileByte {
    public static void main(String [] args) throws IOException {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream("src/demo_subkey_lt/IO/copy_file_viettuts/a2/inStream.txt");
            outputStream = new FileOutputStream("src/demo_subkey_lt/IO/copy_file_viettuts/a2/outStream.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
