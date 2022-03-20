import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class practice_Q5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:/Code_ing/jumpto_java/06_input_output/sample.txt"));

        ArrayList<String> wordlist = new ArrayList<>();
        while (true) {
            String line = br.readLine();
            wordlist.add(line);
            if (line == null) break;
        }
        br.close();

        FileWriter fw = new FileWriter("C:/Code_ing/jumpto_java/06_input_output/sample.txt");
        for (int i = 0; i < wordlist.size() - 1; i++) {
            String word = wordlist.get(i);
            if (word.contains("python")) {
                word = word.replaceAll("python", "java");
            }
            fw.write(word + "\r\n");
        }
        fw.close();
    }
}
