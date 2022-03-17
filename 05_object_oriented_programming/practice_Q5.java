import java.util.ArrayList;
import java.util.Arrays;

public class practice_Q5 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> b = a; // shallow copy (not new)
        a.add(4);
        System.out.println(b.size()); // 4
        System.out.println(a == b); // true 
    }    
}
