// Program: Single Inheritance

// Base class providing common behavior
class Animal {

    // Parent class method
    public void eat() {
        System.out.println("Animal eats food.");
    }
}

// Derived class inheriting from Animal
class Dog extends Animal {

    // Child class method
    public void bark() {
        System.out.println("Dog barks.");
    }
}

// Main class
public class SingleInheritance {

    // Main method
    public static void main(String[] args) {

        // Creating an object of the child class
        Dog dog = new Dog();

        // Calling inherited method from the parent class
        dog.eat();

        // Calling method of the child class
        dog.bark();
    }
}
