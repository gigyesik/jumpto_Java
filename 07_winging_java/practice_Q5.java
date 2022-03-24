import java.util.ArrayList;
import java.util.Arrays;

public class practice_Q5 {
    public static void main(String[] args) {
        int[] numbers = {1, -2, 3, -5, 8, -3};

        int[] result = Arrays.stream(numbers)
                .boxed()
                .filter((a) -> a > 0)
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray()
                ;
        System.out.println(Arrays.toString(result));
    }
}
