interface Predator {
    String bark();
}

abstract class Animal {
    public String hello() {
        return "hello";
    }
}

class Dog extends Animal {
}

class Lion extends Animal implements Predator {
    public String bark() {
        return "Bark bark!!";
    }
}

public class practice_Q9 {
    public static void main(String[] args) {
        Animal a = new Lion(); // Lion a is Animal
        Lion b = new Lion(); // Lion b is Lion
        Predator c = new Lion(); // Lion c is predator

        System.out.println(a.hello());  // Hello
        // System.out.println(a.bark());   // error
        System.out.println(b.hello());  // Hello
        System.out.println(b.bark());   // Bark bark!!
        // System.out.println(c.hello());  // error
        System.out.println(c.bark());   // Bark bark!!
    }
}
