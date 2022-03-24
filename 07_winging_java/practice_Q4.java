import java.util.ArrayList;
import java.util.Arrays;

public class practice_Q4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        ArrayList<Integer> temp = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 1) {
                temp.add(num * 2);
            }
        }

        int[] result = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            result[i] = temp.get(i);
        }

        int[] result1 = Arrays.stream(numbers)
                        .boxed()
                        .filter((a) -> a % 2 == 1)
                        .mapToInt(Integer::intValue)
                        .map((a) -> a * 2)
                        .toArray()
                ;
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result1));
    }
}
