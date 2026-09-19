# Static-Methods-in-Interface

---

## 1. What is a Static Method in an Interface?

A static method in an interface is a method that belongs to the interface itself.
It is defined using the static keyword and has a complete body.

### Important idea:

* Static methods are called using the interface name.
* They cannot be overridden by implementing classes.
* They are used for utility or helper behavior related to the interface.
* They are not inherited by objects of the implementing class.

---

## 2. Why are Static Methods Used in Interfaces?

Static methods are useful when we want to provide helper logic that belongs to the interface type itself.
For example, an interface may provide a method to validate values or perform conversions.

### Benefits:

* Easy access using the interface name
* No need to create an object
* Useful for utility tasks
* Keeps related helper logic together
* Improves organization of code

---

## 3. Rules of Static Methods in Interfaces

1. A static method must use the static keyword.
2. It must have a body.
3. It is called using the interface name.
4. It cannot be overridden in the implementing class.
5. It is not part of object behavior.
6. It is useful for helper or utility operations.

---

## 4. Program 1: Static Method in Interface

**Headline:** Demonstrating how a static method can be used without creating an object.

### Why this program is used:

This program shows that interfaces can contain utility methods that are accessed directly.
It teaches that static methods are not tied to an object and can be used independently.

### Program Code:

```java
interface MathOperation {
    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }
}

public class StaticMethodDemo {
    public static void main(String[] args) {
        int sum = MathOperation.add(10, 20);
        int diff = MathOperation.subtract(20, 10);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
    }
}

```

### Detailed line-by-line explanation:

1. `interface MathOperation {` -> creates interface named MathOperation.
2. `static int add(int a, int b) {` -> defines a static method add().
3. `return a + b;` -> returns sum of two numbers.
4. `}`
5. `static int subtract(int a, int b) {` -> defines static method subtract().
6. `return a - b;` -> returns difference.
7. `}`
8. `}`
9. `public class StaticMethodDemo {` -> main class.
10. `public static void main(String[] args) {` -> program entry point.
11. `int sum = MathOperation.add(10, 20);` -> calls static method using interface name.
12. `int diff = MathOperation.subtract(20, 10);` -> calls static method using interface name.
13. `System.out.println("Sum: " + sum);` -> prints sum.
14. `System.out.println("Difference: " + diff);` -> prints difference.
15. `}`
16. `}`

### Method definitions:

* **add():** returns the sum of two integers.
* **subtract():** returns the difference of two integers.
* **main():** starts the program.

### Pseudocode:

1. Create interface MathOperation.
2. Define static add() and subtract().
3. In main, call add() and subtract() using the interface name.
4. Print the results.
5. End the program.

### Output:

```text
Sum: 30
Difference: 10

```

### Summary:

This program shows that static methods in interfaces can be called without creating an object.

---

## 5. Program 2: Static Method with Validation Logic

**Headline:** Demonstrating how static methods can be used for reusable validation logic.

### Why this program is used:

This example shows that static methods are helpful for checking conditions or preparing values.
It is useful in real-world code where validation is needed repeatedly.

### Program Code:

```java
interface Validator {
    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    static boolean isPositive(int number) {
        return number > 0;
    }
}

public class StaticValidationDemo {
    public static void main(String[] args) {
        int x = 10;
        int y = -5;

        if (Validator.isEven(x)) {
            System.out.println(x + " is even");
        }

        if (Validator.isPositive(y)) {
            System.out.println(y + " is positive");
        } else {
            System.out.println(y + " is not positive");
        }
    }
}

```

### Detailed explanation:

* Validator is an interface with two static methods.
* isEven() checks whether a number is even.
* isPositive() checks whether a number is positive.
* The main method uses the interface name to call both methods.

### Pseudocode:

1. Create interface Validator.
2. Define static isEven() and isPositive().
3. In main, declare values.
4. Use interface methods to validate values.
5. Print appropriate messages.
6. End the program.

### Output:

```text
10 is even
-5 is not positive

```

### Summary:

This program shows how static methods can support validation logic in a clean and reusable way.

---

## 6. Final Conclusion

Static methods in interfaces are helpful because they allow utility behavior to be grouped with the interface itself.
They are easy to call, do not need an object, and are useful for reusable logic.
Understanding static methods helps in writing clean and professional Java programs.
