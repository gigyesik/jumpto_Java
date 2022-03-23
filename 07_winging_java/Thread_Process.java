import java.util.ArrayList;

public class Thread_Process extends Thread {
    int seq;

    public Thread_Process(int seq) {
        this.seq = seq;
    }

    public void run() {
        System.out.println(this.seq + " thread start");
        try {
            Thread.sleep(1000); // 1 second
        } catch (Exception e) {
        }
        System.out.println(this.seq + " thread end");
    }

    public static void main(String[] args) {
        /*
        Thread_Process thread_process = new Thread_Process();
        thread_process.start();
        */

        /*
        // Thread
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread_Process(i);
            t.start();
        }
        System.out.println("main end");
        */

        // Join
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread_Process(i);
            t.start();
            threads.add(t);
        }

        for (int i = 0; i < threads.size(); i++) {
            Thread t = threads.get(i);
            try {
                t.join(); // waiting t thread end
            } catch (Exception e) {
            }
        }
        System.out.println("main end");
    }
}


