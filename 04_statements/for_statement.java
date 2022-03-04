public class for_statement {
    public static void main(String[] args) {
        // example 1
        String[] numbers = {"one", "two", "three"};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // example 2
        int[] marks = {90, 25, 67, 45, 80};
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 60) {
                System.out.println(i + " pass");
            } else {
                System.out.println(i + " fail");
            }
        }
        
        // continue
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 60) {
                continue;
            }
            System.out.println(i + " pass. congratulation");
        }
    
        // for for
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i*j + " "); // space
            }
            System.out.println(""); // enter
        }
    }
}
