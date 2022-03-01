import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Datatype_Map {
    public static void main(String[] args) {
        // HashMap, Generics
        HashMap<String, String> map = new HashMap<>();

        // put
        map.put("people", "man");
        map.put("baseball", "sports");

        // get
        System.out.println(map.get("people")); // man
        System.out.println(map.get("java")); // null
        System.out.println(map.getOrDefault("java", "language")); // language

        // containsKey
        System.out.println(map.containsKey("people")); // true

        // remove
        System.out.println(map.remove("people")); // man
        System.out.println(map); // {baseball=sports}

        // size
        System.out.println(map.size()); // 1

        // keySet
        HashMap<String, String> map2 = new HashMap<>();
        map.put("people", "man");
        map.put("baseball", "sports");
        System.out.println(map.keySet()); // [baseball, people]
        List<String> keyList = new ArrayList<>(map.keySet());
        System.out.println(keyList); // [baseball, people]
    }
}
