import java.text.SimpleDateFormat;
import java.util.Date;

class HouseLee {
    String lastname = "lee";
}

class Counter {
    static int count = 0; // static
    Counter() {
        count++;
        System.out.println(count);
    }

    public static int getCount() {
        return count;
    }
}

class Util {
    public static String getCurrentDate(String fmt) {
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }
}

class Singleton { // singleton pattern
    private static Singleton one;
    private Singleton() {

    }

    public static Singleton getInstance() {
        if (one == null) {
            one = new Singleton();
        };
        return one;
    }
}
public class static_method {
    public static void main(String[] args) { // static
        HouseLee lee1 = new HouseLee();
        HouseLee lee2 = new HouseLee();

        Counter c1 = new Counter(); // 1
        Counter c2 = new Counter(); // 2

        System.out.println(Counter.getCount()); // 2

        System.out.println(Util.getCurrentDate("yyyyMMdd")); // 20220323

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2); // true
    }
}
