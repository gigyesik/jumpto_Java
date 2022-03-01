public class Datatype_Array {
    public static void main(String[] args) {
        int[] odds = {1, 3, 5, 7, 9};
        String[] weeks = {"mon", "tue", "wed"};

        String[] weeks2 = new String[3];
        weeks2[0] = "mon";
        weeks2[1] = "tue";
        weeks2[2] = "wed";
        // String[] weeks3 = new String[]; // error

        System.out.println(weeks2[2]); // wed
        System.out.println(weeks.length); // 3
    }
}
