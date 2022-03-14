// Constructor

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal { // inheritance
    Dog() { // default constructor

    }

    void sleep() {
        System.out.println(this.name + " zzz");
    }
}

class HouseDog extends Dog { // inheritance
    HouseDog(String name) { // constructor
        this.setName(name);
    }

    HouseDog(int type) { // constructor overloading
        if (type == 1) {
            this.setName("yorkshire");
        } else if (type == 2) {
            this.setName("bulldog");
        }
    }

    void sleep() { // method overriding
        System.out.println(this.name + " zzz in a house");
    }

    void sleep(int hour) { // method overloading
        System.out.println(this.name + " zzz in a house for " + hour + " hours");
    }
} 


public class Sample6 {
    public static void main(String[] args) {
        /*
        HouseDog dog = new HouseDog();
        System.out.println(dog.name); // null
        */

        HouseDog happy = new HouseDog("happy");
        System.out.println(happy.name); // happy

        HouseDog yorkshire = new HouseDog(1);
        System.out.println(yorkshire.name); // yorkshire
    }    
}
