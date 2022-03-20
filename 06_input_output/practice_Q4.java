import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class practice_Q4 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:/Code_ing/jumpto_java/06_input_output/sample.txt", true);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        fw.write(input);
        fw.close();
    }
}
