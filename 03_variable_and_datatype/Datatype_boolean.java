public class Datatype_boolean {
    public static void main(String[] args) {
        boolean inSuccess = true;
        boolean isTest = false;

        int base = 180;
        int height = 185;
        boolean isTall = height > base;
        if (isTall) {
            System.out.println("Tall."); // Tall.
        }

        int i = 3;
        boolean isOdd = i % 2 == 1;
        System.out.println(isOdd); // true
    }
}
