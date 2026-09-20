// Program: Multiple Inheritance Using Interface

// First interface
interface Father {

    // Abstract method
    void house();
}

// Second interface
interface Mother {

    // Abstract method
    void car();
}

// Child class implementing multiple interfaces
class Son implements Father, Mother {

    // Providing implementation for Father interface method
    public void house() {
        System.out.println("House inherited from Father.");
    }

    // Providing implementation for Mother interface method
    public void car() {
        System.out.println("Car inherited from Mother.");
    }
}

// Main class
public class MultipleInheritanceUsingInterface {

    // Main method
    public static void main(String[] args) {

        // Creating object of Son class
        Son son = new Son();

        // Calling methods inherited through interfaces
        son.house();
        son.car();
    }
}
