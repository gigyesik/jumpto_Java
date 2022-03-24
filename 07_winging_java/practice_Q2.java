import java.util.ArrayList;
import java.util.Arrays;

public class practice_Q2 {
    public static void main(String[] args) {
        int result = 0;
        try {
            int[] a = {1, 2, 3};
            int b = a[3]; // index error
            ArrayList c = new ArrayList(Arrays.asList("3")); // c = [3]
            int d = (int) c.get(0); // string to int (class cast)
            int e = 4 / 0; // zero division error (arithmetic)
        } catch (ClassCastException e) {
            result += 1; // error but not in
        } catch (ArithmeticException e) {
            result += 2; // error but not in
        } catch (ArrayIndexOutOfBoundsException e) {
            result += 3; // in
        } finally {
            result += 4; // in
        }
        System.out.println(result); // 7
    }
}
