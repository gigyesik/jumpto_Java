// Abstract Class

abstract class Predator extends Animal {
    abstract String getFood();

    void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }

    static int LEG_COUNT = 4; // interface constant

    static int speed() {
        return LEG_COUNT * 30;
    }
}

interface Barkable {
    void bark();
}

/*
interface BarkablePredator extends Predator, Barkable {

}
*/
class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Predator implements Barkable {
    public String getFood() {
        return "apple";
    }

    public void bark() {
        System.out.println("Aheung");
    }
}

class Lion extends Predator implements Barkable {
    public String getFood() {
        return "banana";
    }

    public void bark() {
        System.out.println("Gruee");
    }
}

class ZooKeeper { // method overloading
    void feed(Predator predator) {
        System.out.println("feed " + predator.getFood());
    }
}

class Bouncer {
    void barkAnimal(Barkable animal) {
        animal.bark();
    }
    /*
    void barkAnimal(Animal animal) {
        if (animal instanceof Tiger) {
            System.out.println("Aheung");
        } else if (animal instanceof Lion) {
            System.out.println("Gruee");
        }
        
        else if (animal instanecof Crocodile) {
            System.out.println("Zup")
        } else if (animal instanceof Leopard) {
            System.out.println("Kiyao")
        }   
    }
    */
}

public class Sample9 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        
        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger); // Aheung
        bouncer.barkAnimal(lion); // Gruee
    }
}
