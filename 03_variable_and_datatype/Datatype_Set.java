import java.util.Arrays;
import java.util.HashSet;

public class Datatype_Set {
    public static void main(String[] args) {
        // character of Set
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
        System.out.println(set); // [e, H, l, o]

        // operate Set
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));

        HashSet<Integer> intersection = new HashSet<>(s1); // s1 intersection copy
        intersection.retainAll(s2);
        System.out.println(intersection); // [4, 5, 6]

        HashSet<Integer> union = new HashSet<>(s1); // s1 union copy
        union.addAll(s2);
        System.out.println(union); // [1, 2, 3, 4, 5, 6, 7, 8, 9]

        HashSet<Integer> substract = new HashSet<>(s1); // s1 substract copy
        substract.removeAll(s2);
        System.out.println(substract); // [1, 2, 3]

        // add
        HashSet<String> set2 = new HashSet<>();
        set2.add("Jump");
        set2.add("To");
        set2.add("Java");
        System.out.println(set2); // [Java, To, Jump]

        // addAll
        HashSet<String> set3 = new HashSet<>();
        set3.addAll(Arrays.asList("Jump", "To", "Java"));
        System.out.println(set3); // [Java, To, Jump]

        // remove
        set3.remove("To");
        System.out.println(set3); // [Java, Jump]
    }
}
