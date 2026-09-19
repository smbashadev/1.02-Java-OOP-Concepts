// Program: Hierarchical Inheritance

// Base class
class Animal {

    // Parent class method
    public void eat() {
        System.out.println("Animal eats food.");
    }
}

// First derived class inheriting Animal
class Dog extends Animal {

    // Dog class method
    public void bark() {
        System.out.println("Dog barks.");
    }
}

// Second derived class inheriting Animal
class Cat extends Animal {

    // Cat class method
    public void meow() {
        System.out.println("Cat meows.");
    }
}

// Main class
public class HierarchicalInheritance {

    // Main method
    public static void main(String[] args) {

        // Creating object of Dog class
        Dog dog = new Dog();

        // Calling inherited and own methods
        dog.eat();
        dog.bark();

        System.out.println();

        // Creating object of Cat class
        Cat cat = new Cat();

        // Calling inherited and own methods
        cat.eat();
        cat.meow();
    }
}
