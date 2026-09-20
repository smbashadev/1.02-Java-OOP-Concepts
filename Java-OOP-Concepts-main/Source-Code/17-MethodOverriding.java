// Program: Method Overriding

// Parent class
class Animal {

    // Parent class method
    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

// Child class overriding the parent class method
class Dog extends Animal {

    // Overriding sound() method
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}

// Main class
public class MethodOverriding {

    // Main method
    public static void main(String[] args) {

        // Creating object of Dog class
        Dog dog = new Dog();

        // Calling overridden method
        dog.sound();
    }
}
