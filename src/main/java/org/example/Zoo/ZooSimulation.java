interface AnimalBehavior {
    void eat();
    void sleep();
    void makeSound();
}

abstract class Animal implements AnimalBehavior {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    abstract void displayInformation();
}

// Part 2: Creating Specific Animal Classes
class Mammal extends Animal {
    public Mammal(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(name + " the Mammal is eating.");
    }

    public void makeSound() {
        System.out.println(name + " the Mammal makes a sound.");
    }

    void displayInformation() {
        System.out.println("Mammal Name: " + name + ", Age: " + age);
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(name + " the Bird is eating.");
    }

    public void makeSound() {
        System.out.println(name + " the Bird chirps.");
    }

    void displayInformation() {
        System.out.println("Bird Name: " + name + ", Age: " + age);
    }
}

// Further Specialization
class Lion extends Mammal {
    public Lion(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(name + " the Lion roars.");
    }
}

class Parrot extends Bird {
    public Parrot(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(name + " the Parrot talks.");
    }
}

// Part 3: Testing Your Implementation
public class ZooSimulation {
    public static void main(String[] args) {
        Animal lion = new Lion("Leo", 5);
        Animal parrot = new Parrot("Polly", 2);

        lion.eat();
        lion.makeSound();
        lion.displayInformation();

        parrot.eat();
        parrot.makeSound();
        parrot.displayInformation();
    }
}

