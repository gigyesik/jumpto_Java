class Animal {
    String name; 

    public void setName(String name) {
        this.name = name;
    }
}

public class Sample2 {
    public static void main(String[] args) {
        Animal cat = new Animal(); 
        // cat is object
        // cat is also instance of Animal
        cat.setName("boby");

        System.out.println(cat.name); // boby (instance vaiable)

        Animal dog = new Animal();
        dog.setName("happy");
        System.out.println(dog.name); // happy
    }
}
