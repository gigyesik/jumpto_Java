import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Datatype_modify_final {
    public static void main(String[] args) {
        // Wrapper class Integer
        String num = "123";
        int n = Integer.parseInt(num);
        System.out.println(n); // 123

        // Integer to String
        int n2 = 123;
        String num2 = "" + n2;
        System.out.println(num2); // 123

        // valueOf, toString
        String num3 = String.valueOf(n2);
        String num4 = Integer.toString(n2);
        System.out.println(num3); // 123
        System.out.println(num4); // 123

        // double, float
        String num5 = "123.456";
        double d = Double.parseDouble(num5);
        System.out.println(d); // 123.456
        double d1 = n2; // not need casting
        System.out.println(d1); // 123.0
        int n3 = (int) d1; // need casting
        System.out.println(n3); // 123
        /*
        // NumberFormatException
        int n4 = Integer.parseInt(num5);
        System.out.println(n4);
        */

        // final
        final int n4 = 123; // can't change value
        // n4 = 456; // compile error
        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
        // a = new ArrayList<>(Arrays.asList("c", "d")); // compile error

        // Unmodifiable List
        final List<String> a1 = List.of("a", "b");
        // a1.add("c"); // UnsupportedOperationException
    }
}
