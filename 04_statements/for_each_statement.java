import java.util.ArrayList;
import java.util.Arrays;

public class for_each_statement {
    public static void main(String[] args) {
        // example 1
        String[] numbers = {"one", "two", "three"};
        for (String number: numbers) {
            System.out.println(number);
        }

        // example 2
        ArrayList<String> numbers2 = new ArrayList<>(Arrays.asList("one", "two", "three"));
        for (String number : numbers2) {
            System.out.println(number);
        }
    }
}
