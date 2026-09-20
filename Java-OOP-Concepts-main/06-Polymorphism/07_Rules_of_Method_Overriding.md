# Rules of Method Overriding in Java

## 1. Definition

* Method overriding occurs when a subclass provides a specific implementation of a method that is already defined in its superclass.
* It allows a subclass to modify or extend the behavior of an inherited method while keeping its signature unchanged.

---

## 2. Main Rules of Method Overriding

* **Rule 1: Same Method Name**
The overriding method in the child class must have the exact same name as the method in the parent class.
* **Rule 2: Same Parameters**
The number, data types, and sequential order of parameters must be exactly the same in both methods.
* **Rule 3: Same or Compatible Return Type**
The return type of the overriding method must be the same as the parent method, or a subtype (known as a *covariant return type*).
* **Rule 4: Access Modifier Should Not Be More Restrictive**
A child class method cannot make the access level more restricted than the parent method.
> **Example:** If the parent method is `public`, the child method *cannot* be marked `private`, `protected`, or package-private.


* **Rule 5: Cannot Throw Broader Checked Exceptions**
The child method can throw fewer or narrower exceptions, but it is strictly forbidden from throwing broader checked exceptions than the parent method.
* **Rule 6: The Method Must Be Inherited**
The method being overridden must be inherited from the parent class. If a method does not exist or isn't accessible in the parent class, overriding cannot occur.
* **Rule 7: Use of @Override Annotation**
The `@Override` annotation is highly recommended. It tells Java explicitly that the method is intended to override a parent method, allowing the compiler to catch mistakes immediately.
* **Rule 8: Static Methods Cannot Be Overridden**
Static methods belong to the class itself rather than individual instances, so they cannot be overridden (redefining them in a subclass results in *method hiding*).
* **Rule 9: Final Methods Cannot Be Overridden**
If a method is declared with the `final` keyword in the parent class, it cannot be overridden by any subclass.
* **Rule 10: Private Methods Cannot Be Overridden**
Private methods are only visible within their own class and are not inherited by subclasses, making overriding impossible.

---

## 3. Why These Rules Are Important

* They ensure compilation safety and consistency across inheritance hierarchies.
* They safeguard the core contract of the parent class, guaranteeing that Java can safely execute **runtime polymorphism** via dynamic method dispatch without unexpected failures.

---

## 4. Scenario 1: Basic Overriding Rules Verification

### Headline:

Enforcing Signature and Access Rule Requirements

### Definition of This Program:

* This program serves as a baseline compilation verification showing a subclass successfully implementing matching signatures and access modifiers to satisfy Java's explicit overriding rules.

### Why This Program is Used:

* To demonstrate a valid implementation of overriding under standard `public` visibility and signature matching constraints.

### How This Helps Java Programming:

* It teaches developers how to structuralize class APIs so they compile without violating inheritance rules, layout safety boundaries, and reference rules.

### Program 1: Standard Rules Verification

#### Code with Comments on Every Line:

```java
class Animal {                                          // Line 1: Declares the parent class
    public void sound() {                               // Line 2: Declares a public method named sound()
        System.out.println("Animal makes a sound");      // Line 3: Prints base behavior
    }                                                   // Line 4: Ends the sound() method
}                                                       // Line 5: Ends the Animal class

class Dog extends Animal {                              // Line 6: Dog inherits Animal
    @Override                                           // Line 7: Indicates method overriding
    public void sound() {                               // Line 8: Same method name and same parameters
        System.out.println("Dog barks");                // Line 9: Prints overridden behavior
    }                                                   // Line 10: Ends the sound() method
}                                                       // Line 11: Ends the Dog class

public class RulesOfMethodOverridingDemo {              // Line 12: Main class declaration
    public static void main(String[] args) {            // Line 13: Main method starts here
        Animal a = new Animal();                        // Line 14: Creates Animal object
        Dog d = new Dog();                              // Line 15: Creates Dog object

        a.sound();                                      // Line 16: Calls parent version
        d.sound();                                      // Line 17: Calls overridden child version
    }                                                   // Line 18: Ends main method
}                                                       // Line 19: Ends class

```

#### Explanation of Every Line:

1. `class Animal {`
Declares the base parent class.
2. `public void sound() {`
Declares a public method accessible across packages, defining the target method signature.
3. `System.out.println("Animal makes a sound");`
Outputs the parent class fallback string literal to the console.
4. `}`
Closes the parent `sound()` method body.
5. `}`
Closes the `Animal` class structure.
6. `class Dog extends Animal {`
Declares the subclass `Dog`, establishing a standard IS-A relationship with `Animal`.
7. `@Override`
Compiler directive verifying that the subsequent method matches a superclass signature precisely.
8. `public void sound() {`
Defines the child implementation matching the `public` modifier, name, and empty parameter list exactly.
9. `System.out.println("Dog barks");`
Outputs the customized subclass string literal behavior.
10. `}`
Closes the child `sound()` method body.
11. `}`
Closes the `Dog` class structure.
12. `public class RulesOfMethodOverridingDemo {`
Declares the entry point class for running the demo application.
13. `public static void main(String[] args) {`
Declares the standard static execution runtime hook.
14. `Animal a = new Animal();`
Instantiates an object specifically mapped to the `Animal` type context on the heap.
15. `Dog d = new Dog();`
Instantiates an object specifically mapped to the `Dog` type context on the heap.
16. `a.sound();`
Executes the parent definition because the backing instance context belongs to `Animal`.
17. `d.sound();`
Executes the child definition because the backing instance context belongs to `Dog`.
18. `}`
Closes the main runtime execution scope block.
19. `}`
Closes the outer application containment wrapper.

#### Pseudocode:

```text
START
    CREATE class Animal
    DEFINE sound() as public

    CREATE class Dog extends Animal
    OVERRIDE sound() as public

    CREATE main method
    CREATE Animal object
    CREATE Dog object
    CALL a.sound()
    CALL d.sound()
END

```

#### Output:

```text
Animal makes a sound
Dog barks

```

#### Summary:

Method overriding is strictly allowed only when the child class method satisfies all foundational constraints including matching names, identical parameter sequences, and equal or wider access modifier assignments.

---

## 5. Important Rules Summary Map

> **Critical Warning:** If you modify a method's name or alter its input parameter configuration, you are **no longer overriding** it. Java treats this action as creating either an entirely new method or a case of *method overloading*.

| Restrictive Rule Target | Can Be Overridden? | Operational Effect if Attempted |
| --- | --- | --- |
| **`final` Methods** | ✗ No | Causes a critical compilation error. |
| **`static` Methods** | ✗ No | Results in *Method Hiding*; polymorphic dispatch is bypassed. |
| **`private` Methods** | ✗ No | Treated as an entirely new, isolated method in the child class. |
