public class practice_question {
    public static void main(String[] args) {
        // Q1
        String a = "write once, run anywhere";
        if (a.contains("wife")) {
            System.out.println("wife");
        } else if (a.contains("once") && !a.contains("run")) {
            System.out.println("once");
        } else if (!a.contains("everywhere")) {
            System.out.println("everywhere");
        } else if (a.contains("anywhere")) {
            System.out.println("anywhere");
        } else {
            System.out.println("none");
        } // everywhere

        // Q2
        int sumofthree = 0;
        int counter = 1;
        while (true) {
            if (counter % 3 == 0) {
                sumofthree += counter;
            }
            counter++;
            if (counter == 1001) {
                break;
            }
        }
        System.out.println(sumofthree); // 166833

        // Q3
        String star = "*";
        int counter2 = 1;
        int counter3 = 5;
        for (int i = 1; i < counter3 + 1; i++) {
            for (int j = 1; j < counter2 + 1; j++) {
                System.out.print(star);
            }
            System.out.println("");
            counter2++;
        }
        
        // Q4
        for (int i = 1; i < 101; i++) {
            System.out.println(i);
        }

        // Q5
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int sumofmid = 0;
        for (int i : marks) {
            sumofmid += i;
        }
        System.out.println(sumofmid / marks.length);
        
    }
}
