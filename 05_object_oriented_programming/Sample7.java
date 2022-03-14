// Interface

interface Predator {
    String getFood();

    default void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }

    int LEG_COUNT = 4; // interface constant

    static int speed() {
        return LEG_COUNT * 30;
    }
}

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal implements Predator {
    public String getFood() {
        return "apple";
    }
}

class Lion extends Animal implements Predator {
    public String getFood() {
        return "banana";
    }
}

class ZooKeeper { // method overloading
    void feed(Predator predator) {
        System.out.println("feed " + predator.getFood());
    }
    /*
    void feed(Tiger tiger) { // if tiger coming, feed apple
        System.out.println("feed apple");
    }

    void feed(Lion lion) { // if lion coming, feed banana
        System.out.println("feed banana");
    }
    */

    /*
    public void feed(Crocodile crocodile) {
        System.out.println("feed strawberry")
    }

    public void feed(Leopard leopard) {
        System.out.println("feed orange")
    }
    */
}

public class Sample7 {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger); // feed apple
        zooKeeper.feed(lion); // feed banana
    }
}
