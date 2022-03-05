public class Sample3 {
    int sum(int a, int b) {
        return a + b;
    }    

    String say() { // no input
        return "Hi";
    }

    void sum2(int a, int b) { // no return
        System.out.println(a + "+" + b + "=" + (a+b));
    }

    void say2() { // no input, no return
        System.out.println("Hi");
    }

    void sayNick(String nick) {
        if ("fool".equals(nick)) {
            return; // only void
        }
        System.out.println("my nick is " + nick);
    }

    int varTest(int a) {
        a++;
        return a;
    }

    int a; // object variable
    void varTest2(Sample3 sample) {
        sample.a++;
    }

    void varTest3() {
        this.a++;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        Sample3 sample = new Sample3();
        int c = sample.sum(a, b);

        System.out.println(c); // 7
        String d = sample.say();
        System.out.println(d); // Hi
        sample.sum2(3, 4); // 3+4=7
        sample.say2(); // Hi

        sample.sayNick("angel"); // my nick is angel
        sample.sayNick("fool"); // nothing

        sample.varTest(a);
        System.out.println(a); // 3
        a = sample.varTest(a);
        System.out.println(a); // 4

        sample.a = 1;
        sample.varTest2(sample);
        System.out.println(sample.a); // 2
    
        sample.a = 1;
        sample.varTest3();
        System.out.println(sample.a); // 2
    }
}
