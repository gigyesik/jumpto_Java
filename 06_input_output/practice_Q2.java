import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class practice_Q2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String alpha = scanner.nextLine();
            String END = "END";
            if (END.equals(alpha)) break;
            String result = alpha.toUpperCase(Locale.ROOT);
            System.out.println(result);
        }
    }
}
