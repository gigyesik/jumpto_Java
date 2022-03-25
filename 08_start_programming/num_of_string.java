public class num_of_string {
    static int getExcludeSpaceCount(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                result++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String a = "num of strings except of space";
        System.out.println("[" + a.charAt(0) + "]"); // [n]
        System.out.println("[" + a.charAt(3) + "]"); // [ ]

        System.out.println(getExcludeSpaceCount("num of strings except of space")); // 25
        System.out.println(getExcludeSpaceCount("solving problem in jump to java")); // 26
    }
}
