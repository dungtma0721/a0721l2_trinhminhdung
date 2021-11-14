package demo_subkey_lt.IO.copy_file_viettuts.a1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileCharacter {
    public static void main(String [] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("src/demo_subkey_lt/IO/copy_file_viettuts/a1/input.txt");
            out = new FileWriter("src/demo_subkey_lt/IO/copy_file_viettuts/a1/output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
