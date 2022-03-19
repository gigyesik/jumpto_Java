import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class File {
    public static void main(String[] args) throws IOException {
        /*
        // File write
        FileOutputStream output = new FileOutputStream("C:/Code_ing/jumpto_java/06_input_output/out.txt");

        // FileOutputStream
        for (int i = 1; i < 11; i++) {
            String data = i + " line. \r\n"; // 1 ~ 10 line.
            output.write(data.getBytes());
        }
        output.close();
        */

        /*
        // FileWriter
        FileWriter fw = new FileWriter("C:/Code_ing/jumpto_java/06_input_output/out.txt");
        for(int i = 1; i < 11; i++) {
            String data = i + " line. \r\n";
            fw.write(data);
        }
        fw.close();
        */

        /*
        // PrintWriter
        PrintWriter pw = new PrintWriter("C:/Code_ing/jumpto_java/06_input_output/out.txt");
        for(int i = 1; i < 11; i++) {
            String data = i + " line.";
            pw.println(data);
        }
        pw.close();

        // plus contents
        FileWriter fw2 = new FileWriter("C:/Code_ing/jumpto_java/06_input_output/out.txt", true);
        // PrintWriter pw2 = new PrintWriter(new FileWriter(""C:/Code_ing/jumpto_java/06_input_output/out.txt", true"));
        for(int i = 11; i < 21; i++) {
            String data = i + " line. \r\n";
            fw2.write(data);
        }
        fw2.close();
        */

        /*
        // file read
        byte[] b = new byte[1024];
        FileInputStream input = new FileInputStream("C:/Code_ing/jumpto_java/06_input_output/out.txt");
        input.read(b);
        System.out.println(new String(b)); // change byte to String
        input.close();
        */

        // BufferedReader
        BufferedReader br = new BufferedReader(new FileReader("C:/Code_ing/jumpto_java/06_input_output/out.txt"));
        while (true) {
            String line = br.readLine();
            if (line == null) break;
            System.out.println(line);
        }
        br.close();
    }
}