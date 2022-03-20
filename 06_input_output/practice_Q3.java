import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class practice_Q3 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:/Code_ing/jumpto_java/06_input_output/sample.txt");
        fw.write("Write once, run anywhere");
        fw.close();

        BufferedReader br = new BufferedReader(new FileReader("C:/Code_ing/jumpto_java/06_input_output/sample.txt"));
        String line = br.readLine();
        System.out.println(line);  // null
        br.close();
    }
}
