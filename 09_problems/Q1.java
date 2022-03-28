import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        String s = "a:b:c:d";
        String[] s2 = s.split(":");
        System.out.println(Arrays.toString(s2));
        String result = String.join("#", s2);
        System.out.println(result);
    }
}
