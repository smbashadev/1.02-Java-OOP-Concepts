// Program: Abstraction

// Abstract class representing Security Forces
abstract class SecurityForces {

    // Abstract method for attack operation
    abstract public void attack();

    // Abstract method for defense operation
    abstract public void defend();
}

// Army class extends the abstract class
class Army extends SecurityForces {

    // Providing implementation for attack() method
    @Override
    public void attack() {
        System.out.println("Attack using Tanks.");
    }

    // Providing implementation for defend() method
    @Override
    public void defend() {
        System.out.println("Defend from Land.");
    }
}

// Navy class extends the abstract class
class Navy extends SecurityForces {

    // Providing implementation for attack() method
    @Override
    public void attack() {
        System.out.println("Attack using Ships.");
    }

    // Providing implementation for defend() method
    @Override
    public void defend() {
        System.out.println("Defend from Water.");
    }
}

// AirForce class extends the abstract class
class AirForce extends SecurityForces {

    // Providing implementation for attack() method
    @Override
    public void attack() {
        System.out.println("Attack using Fighter Jets.");
    }

    // Providing implementation for defend() method
    @Override
    public void defend() {
        System.out.println("Defend from Air.");
    }
}

// Main class
public class Abstraction {

    // Main method
    public static void main(String[] args) {

        // Creating Army object
        Army army = new Army();

        // Creating Navy object
        Navy navy = new Navy();

        // Creating AirForce object
        AirForce airForce = new AirForce();

        // Calling common method using Army object
        protect(army);

        // Displaying separator
        System.out.println();

        // Calling common method using Navy object
        protect(navy);

        // Displaying separator
        System.out.println();

        // Calling common method using AirForce object
        protect(airForce);
    }

    // Common method accepting abstract class reference
    public static void protect(SecurityForces securityForce) {

        // Calling attack() method
        securityForce.attack();

        // Calling defend() method
        securityForce.defend();
    }
}
