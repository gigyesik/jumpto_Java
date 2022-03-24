class HeavyWork extends Thread {
    String name;

    public HeavyWork(String name) {
        this.name = name;
    }

    public void work() {
        try {
            Thread.sleep(100);
        } catch (Exception e) {

        }
        System.out.printf("%s done \n", this.name);
    }
}
public class practice_Q3 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 1; i < 5; i++) {
            HeavyWork w = new HeavyWork("w" + i);
            w.work();
        }
        long end = System.currentTimeMillis();
        System.out.printf("elapsed time: %s ms\n", end - start);
    }
}
