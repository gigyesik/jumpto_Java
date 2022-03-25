public class num_digit {
    static int getDigitCount(int n) {
        int count = 0;
        while (true) {
            if (n == 0) {
                break;
            }
            n = n / 10;
            count++;
        }
        return count;
    }

    static int getDigitCount2(int n) {
        String s = "" + n;
        return s.length();
    }

    public static void main(String[] args) {
        System.out.println(getDigitCount(3)); // 1
        System.out.println(getDigitCount(25)); // 2
        System.out.println(getDigitCount(333)); // 3
        System.out.println(getDigitCount(7876)); // 4

        System.out.println(getDigitCount2(3)); // 1
        System.out.println(getDigitCount2(25)); // 2
        System.out.println(getDigitCount2(333)); // 3
        System.out.println(getDigitCount2(7876)); // 4
    }
}
