// Program: Runtime Polymorphism

// Parent class
class SecurityForces {

    // Method to perform attack operation
    public void attack() {
        System.out.println("Security Forces attack the enemy.");
    }

    // Method to perform defense operation
    public void defend() {
        System.out.println("Security Forces defend the nation.");
    }
}

// Army class inherits SecurityForces class
class Army extends SecurityForces {

    // Overriding attack() method
    @Override
    public void attack() {
        System.out.println("Army attacks using tanks.");
    }

    // Overriding defend() method
    @Override
    public void defend() {
        System.out.println("Army defends from land.");
    }
}

// Navy class inherits SecurityForces class
class Navy extends SecurityForces {

    // Overriding attack() method
    @Override
    public void attack() {
        System.out.println("Navy attacks using warships.");
    }

    // Overriding defend() method
    @Override
    public void defend() {
        System.out.println("Navy defends from water.");
    }
}

// AirForce class inherits SecurityForces class
class AirForce extends SecurityForces {

    // Overriding attack() method
    @Override
    public void attack() {
        System.out.println("Air Force attacks using fighter jets.");
    }

    // Overriding defend() method
    @Override
    public void defend() {
        System.out.println("Air Force defends from air.");
    }
}

// Main class
public class RuntimePolymorphism {

    // Main method
    public static void main(String[] args) {

        // Creating Army object
        Army army = new Army();

        // Creating Navy object
        Navy navy = new Navy();

        // Creating AirForce object
        AirForce airForce = new AirForce();

        // Calling common method using Army object
        performOperation(army);

        // Displaying separator
        System.out.println();

        // Calling common method using Navy object
        performOperation(navy);

        // Displaying separator
        System.out.println();

        // Calling common method using AirForce object
        performOperation(airForce);
    }

    // Common method accepting parent class reference
    public static void performOperation(SecurityForces force) {

        // Runtime decides which attack() method to execute
        force.attack();

        // Runtime decides which defend() method to execute
        force.defend();
    }
}
