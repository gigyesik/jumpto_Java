// Inheritance

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal { // inheritance
    void sleep() {
        System.out.println(this.name + " zzz");
    }
}

class HouseDog extends Dog { // inheritance
    void sleep() { // method overriding
        System.out.println(this.name + " zzz in a house");
    }

    void sleep(int hour) { // method overloading
        System.out.println(this.name + " zzz in a house for " + hour + " hours");
    }
} 

public class Sample5 {
    public static void main(String[] args) {
        // IS-A
        Dog dog = new Dog(); // Dog ia a Dog
        /*
        Dog dog = new Animal(); // Animal is Dog (Compile Error)
        Animal dog = new Dog(); // Dog is a Animal, but dog only can use Animal's method
        */
        dog.setName("poppy");
        System.out.println(dog.name); // poppy
        dog.sleep(); // poppy zzz

        HouseDog houseDog = new HouseDog();
        houseDog.setName("happy");
        houseDog.sleep(); // happy zzz in a house
        houseDog.sleep(3); // happy zzz in a house for 3 hours
    }
}
