import java.util.Locale;

public class Datatype_String {
    public static void main(String[] args) {
        // literal
        String a = "Happy Java";
        String b = "a";
        String c = "123";

        // new
        /*
        String a = new String("Happy Java");
        String b = new String("a");
        String c = new String("123");
        */

        // primitive
        boolean result = true;
        char cpaitalC = 'C';
        int i = 100000;

        // equals
        System.out.println(a.equals(b)); // false
        String a2 = new String("Happy Java");
        System.out.println(a.equals(a2)); // true
        System.out.println(a == a2); // false

        // indexOf
        System.out.println(a.indexOf("Java")); // 6

        // contains
        System.out.println(a.contains("Java")); // true

        // charAt
        System.out.println(a.charAt(6)); // J

        // replaceAll
        System.out.println(a.replaceAll("Java", "World")); // Happy World

        // substring
        System.out.println(a.substring(0, 4)); // Happ

        // toUpperCase
        System.out.println(a.toUpperCase()); // HAPPY JAVA

        // split
        String result1 = "a:b:c:d";
        String[] result2 = result1.split(":"); // {a, b, c, d}
        System.out.println(result2[0]); // a

        // formatting
        System.out.println(String.format("I eat %d apples.", 3)); // I eat 3 apples.
        System.out.println(String.format("I eat %s apples.", "five")); // I eat five apples.
        System.out.println(String.format("I ate %d apples. so I was sick for %s days.", 3, "five"));

        // sort, space
        System.out.println(String.format("%10s", "hi")); // "          hi"
        System.out.println(String.format("%-10sjane.", "hi")); // "hi          jane."

        // float
        System.out.println(String.format("%.4f", 3.42134234)); // "3.4213"
        System.out.println(String.format("%10.4f", 3.42134234)); // "    3.4213"

        // System.out.printf (not return method. just print)
        System.out.printf("I eat %d apples.", 3); // I eat 3 apples.
    }
}
