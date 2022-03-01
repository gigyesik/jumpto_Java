import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Datatype_List {
    public static void main(String[] args) {
        // add
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");

        // get
        System.out.println(pitches.get(1)); // 129

        // size
        System.out.println(pitches.size()); // 3

        // contains
        System.out.println(pitches.contains("142")); // true

        // remove
        System.out.println(pitches.remove("129")); // true
        System.out.println(pitches.remove(0)); // 138 (return remains)

        // Generics
        ArrayList<String> pitches2 = new ArrayList<>();
        pitches2.add("138");
        pitches2.add("129");
        String one = pitches2.get(0);
        System.out.println(one); // 138
        System.out.println(pitches2); // [138, 129]

        // Arrays
        String[] data = {"138", "129", "142"};
        ArrayList<String> pitches3 = new ArrayList<>(Arrays.asList(data));
        System.out.println(pitches3); // [138, 129, 142]
        ArrayList<String> pitches4 = new ArrayList<>(Arrays.asList("138", "129", "142"));
        System.out.println(pitches4); // [138, 129, 142]

        // String.join
        String result = "";
        for (int i = 0; i < pitches4.size(); i++) {
            result += pitches4.get(i);
            result += ",";
        }
        result = result.substring(0, result.length() - 1);
        System.out.println(result); // 138,129,142
        String result2 = String.join(",", pitches4);
        System.out.println(result2); // 138,129,142

        // sort
        pitches4.sort(Comparator.naturalOrder());
        System.out.println(pitches4); // [129, 138, 142]
    }
}
