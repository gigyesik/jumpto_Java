import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.*;

@FunctionalInterface
interface Calculator {
    int sum(int a, int b);
    // int mul(int a, int b); // error
}

class MyCalculator implements Calculator {
    public int sum(int a, int b) {
        return a + b;
    }
}

public class Lambda_Stream {
    public static void main(String[] args) {
        // Standard code
        MyCalculator mc = new MyCalculator();
        int result = mc.sum(3, 4);
        System.out.println(result); // 7

        // Lambda
        Calculator mc2 = (int a, int b) -> a + b;
        int result2 = mc2.sum(3, 4);
        System.out.println(result2); // 7
        Calculator mc3 = (a, b) -> a + b;
        int result3 = mc3.sum(3, 4);
        System.out.println(result3); // 7
        Calculator mc4 = Integer::sum;
        int result4 = mc4.sum(3, 4);
        System.out.println(result4); // 7

        BiFunction<Integer, Integer, Integer> mc5 = (a, b) -> a + b;
        int result5 = mc5.apply(3, 4);
        System.out.println(result5); // 7

        BinaryOperator<Integer> mc6 = (a, b) -> a + b;
        int result6 = mc6.apply(3, 4);
        System.out.println(result6); // 7

        // if not use Stream
        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};
        ArrayList<Integer> datalist = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                datalist.add(data[i]);
            }
        }

        HashSet<Integer> dataset = new HashSet<>(datalist);
        ArrayList<Integer> distinctlist = new ArrayList<>(dataset);
        distinctlist.sort(Comparator.reverseOrder());

        int[] result7 = new int[distinctlist.size()];
        for(int i = 0; i < distinctlist.size(); i++) {
            result7[i] = distinctlist.get(i);
        }
        System.out.println(Arrays.toString(result7)); // [8, 6, 4, 2]

        // Stream
        int[] result8 = Arrays.stream(data) // make IntStream
                .boxed() // Stream<Integer>
                .filter((a) -> a % 2 == 0) // del odds
                .distinct() // distinct
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue) // IntStream
                .toArray() // int[]
        ;
        System.out.println(Arrays.toString(result8)); // [8, 6, 4, 2]
    }
}
