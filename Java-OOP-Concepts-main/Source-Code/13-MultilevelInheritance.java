// Program: Multilevel Inheritance

// Base class
class Animal {

    // Parent class method
    public void eat() {
        System.out.println("Animal eats food.");
    }
}

// Derived class inheriting Animal
class Dog extends Animal {

    // Child class method
    public void bark() {
        System.out.println("Dog barks.");
    }
}

// Derived class inheriting Dog
class Puppy extends Dog {

    // Grandchild class method
    public void weep() {
        System.out.println("Puppy weeps.");
    }
}

// Main class
public class MultilevelInheritance {

    // Main method
    public static void main(String[] args) {

        // Creating an object of the grandchild class
        Puppy puppy = new Puppy();

        // Calling inherited method from Animal class
        puppy.eat();

        // Calling inherited method from Dog class
        puppy.bark();

        // Calling Puppy class method
        puppy.weep();
    }
}
