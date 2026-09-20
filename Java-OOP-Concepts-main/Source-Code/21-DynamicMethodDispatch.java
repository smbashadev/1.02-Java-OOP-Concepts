// Program: Dynamic Method Dispatch

// Parent class
class SecurityForces {

    // Parent class attack method
    public void attack() {
        System.out.println("Security Forces attack the enemy.");
    }

    // Parent class defend method
    public void defend() {
        System.out.println("Security Forces defend the nation.");
    }
}

// Army class inherits SecurityForces
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

// Main class
public class DynamicMethodDispatch {

    // Main method
    public static void main(String[] args) {

        // Parent class reference
        SecurityForces force;

        // Parent reference referring to Army object (Upcasting)
        force = new Army();

        // JVM calls Army's attack() method at runtime
        force.attack();

        // JVM calls Army's defend() method at runtime
        force.defend();
    }
}
