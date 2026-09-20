// Program: Encapsulation

// BankAccount class demonstrates encapsulation
class BankAccount {

    // Private data members
    // These variables cannot be accessed directly from outside the class
    private int balance = 5000;
    private int pin = 1234;

    // Setter method to update account balance
    // Balance can be updated only if the entered PIN is correct
    public void setBalance(int enteredPin, int newBalance) {

        if (enteredPin == pin) {

            balance = newBalance;
            System.out.println("Balance updated successfully.");

        } else {

            System.out.println("Invalid PIN. Balance cannot be updated.");
        }
    }

    // Getter method to access account balance
    // Balance can be viewed only if the entered PIN is correct
    public int getBalance(int enteredPin) {

        if (enteredPin == pin) {

            return balance;

        } else {

            System.out.println("Invalid PIN. Access denied.");
            return 0;
        }
    }
}

// Main class
public class Encapsulation {

    // Main method
    public static void main(String[] args) {

        // Creating BankAccount object
        BankAccount account = new BankAccount();

        System.out.println("------ Valid User ------");

        // Updating balance using correct PIN
        account.setBalance(1234, 8000);

        // Displaying updated balance
        System.out.println("Available Balance : ₹" + account.getBalance(1234));

        System.out.println();

        System.out.println("------ Invalid User ------");

        // Trying to update balance using incorrect PIN
        account.setBalance(1111, 9000);

        // Trying to access balance using incorrect PIN
        System.out.println("Available Balance : ₹" + account.getBalance(1111));
    }
}
