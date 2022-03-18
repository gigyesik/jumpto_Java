interface Predator {
}

class Animal {
}

class Dog extends Animal {
}

class Lion extends Animal implements Predator {
}

public class practice_Q8 {
    public static void main(String[] args) {
        Animal a = new Animal();  // Animal a is Animal
        Animal b = new Dog();  // Dog b is Animal
        Animal c = new Lion();  // Lion c is Animal
        // Dog d = new Animal();  // Animal d is Dog (error)
        Predator e = new Lion();  // Lion e is Predator
    }
}
