# Abstraction vs Encapsulation in Java

---

## 1. Definition of Abstraction

Abstraction means hiding the implementation details and showing only the essential behavior.
It focuses on what an object does.

## 2. Definition of Encapsulation

Encapsulation means wrapping data and methods into a single unit and restricting direct access to the data.
It focuses on how the data is protected.

## 3. Main difference

* Abstraction hides complexity.
* Encapsulation hides data.

## 4. Real-world analogy

* Abstraction is like using a car dashboard.
You press buttons and drive the car without knowing all internal engine details.
* Encapsulation is like keeping the engine parts inside a closed hood.
You cannot directly access them without proper controls.

## 5. Abstraction example

```java
abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
    }
}

```

## 6. Encapsulation example

```java
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        System.out.println(account.getBalance());
    }
}

```

## 7. Why abstraction is used

* To hide implementation complexity
* To show only important features
* To support polymorphism

## 8. Why encapsulation is used

* To protect data
* To control access
* To prevent invalid modifications

## 9. Comparison table

| Concept | Main Purpose | What is hidden | Main Mechanism |
| --- | --- | --- | --- |
| **Abstraction** | Hide complexity | Internal working | Abstract classes / interfaces |
| **Encapsulation** | Protect data | Data from direct access | private fields + getters/setters |

## 10. Important note

Abstraction is about behavior.
Encapsulation is about data protection.

## 11. Example explanation

In abstraction:

* You know that a vehicle can start.
* You do not need to know how the engine works.

In encapsulation:

* The balance field is hidden.
* You can only update it using methods.

## 12. Output of abstraction example

```text
Car started

```

## 13. Output of encapsulation example

```text
1500.0

```

## 14. Summary

Abstraction focuses on hiding complexity.
Encapsulation focuses on hiding data.
Both are important pillars of object-oriented programming.

## 15. One-line difference

Abstraction shows what an object does; encapsulation protects how data is accessed.
