public class while_statement {
    public static void main(String[] args) {
        // example 1
        int treeHit = 0;
        while (treeHit < 10) {
            treeHit++;
            System.out.println(("tree" + treeHit + "hit"));
            if (treeHit == 10) {
                System.out.println("tree over");
            }
        }

        // Loop
        /*
        while (true) {
            System.out.println("Ctrl + C");
        }
        */

        // break
        int coffee = 10;
        int money = 300;

        while (money > 0) {
            System.out.println("give coffee");
            coffee--;
            System.out.println("coffee" + coffee + "remain");
            if (coffee == 0) {
                System.out.println("exit sell");
                break;
            }
        }

        // continue
        int a = 0;
        while (a < 10) {
            a++;
            if (a % 2 == 0) {
                continue;
            }
            System.out.println(a);
        }
    }
}
