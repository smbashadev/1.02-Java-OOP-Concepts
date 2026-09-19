// Program: Dynamic Method Dispatch

// Parent class
class Animal {

    // Parent class method
    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

// Child class inheriting Animal
class Dog extends Animal {

    // Overriding the parent class method
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}

// Main class
public class DynamicMethodDispatch {

    // Main method
    public static void main(String[] args) {

        // Parent class reference holding child class object
        Animal animal = new Dog();

        // Method call resolved at runtime
        animal.sound();
    }
}
