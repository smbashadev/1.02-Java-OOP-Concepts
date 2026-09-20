# Default-Methods-in-Interface

---

## 1. What is a Default Method in an Interface?

A default method is a method inside an interface that has a body.
It is declared using the default keyword.

### Important idea:

* Default methods are not abstract.
* They provide a default implementation.
* A class implementing the interface may use the default method without overriding it.
* If needed, the class can override the default method.

---

## 2. Why were Default Methods Introduced?

Before Java 8, interfaces could only contain abstract methods.
That created a problem because adding a new method to an interface forced all implementing classes to change.
Default methods solved this problem.

### Benefits:

* Backward compatibility
* Avoids breaking existing code
* Lets interfaces evolve safely
* Reduces code duplication
* Gives flexibility to implementers

---

## 3. Rules of Default Methods in Interfaces

1. A default method must use the default keyword.
2. It must have a body.
3. It is not necessary to override it in the implementing class.
4. The implementing class can override it if needed.
5. Default methods help in interface evolution.
6. A class can still implement multiple interfaces.

---

## 4. Program 1: Default Method in Interface

**Headline:** Demonstrating how an interface can provide a shared method implementation.

### Why this program is used:

This program shows that an interface is not only for abstract methods.
It can also provide a ready-made method that all implementing classes can use.
This makes the code more flexible and easier to maintain.

### Program Code:

```java
interface Animal {
    void sound();

    default void info() {
        System.out.println("This is an animal");
    }
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class DefaultMethodDemo {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.sound();
        d.info();

        Animal c = new Cat();
        c.sound();
        c.info();
    }
}

```

### Detailed line-by-line explanation:

1. `interface Animal {` -> creates an interface named Animal.
2. `void sound();` -> declares abstract method sound().
3. `default void info() {` -> defines a default method with body.
4. `System.out.println("This is an animal");` -> prints a common message.
5. `}`
6. `}`
7. `class Dog implements Animal {` -> Dog implements Animal.
8. `public void sound() {` -> defines Dog's sound behavior.
9. `System.out.println("Dog barks");` -> prints dog's sound.
10. `}`
11. `}`
12. `class Cat implements Animal {` -> Cat implements Animal.
13. `public void sound() {` -> defines Cat's sound behavior.
14. `System.out.println("Cat meows");` -> prints cat's sound.
15. `}`
16. `}`
17. `public class DefaultMethodDemo {` -> main class.
18. `public static void main(String[] args) {` -> program starts here.
19. `Animal d = new Dog();` -> creates Dog object using Animal reference.
20. `d.sound();` -> calls Dog's sound() method.
21. `d.info();` -> calls default info() method.
22. `Animal c = new Cat();` -> creates Cat object using Animal reference.
23. `c.sound();` -> calls Cat's sound() method.
24. `c.info();` -> calls default info() method.
25. `}`
26. `}`

### Method definitions:

* **sound():** abstract method that must be implemented.
* **info():** default method already implemented in the interface.
* **main():** starts program execution.

### Pseudocode:

1. Create interface Animal with sound() and default info().
2. Create Dog class implementing Animal.
3. Create Cat class implementing Animal.
4. In main, create Dog and Cat objects.
5. Call sound() and info() for each object.
6. End the program.

### Output:

```text
Dog barks
This is an animal
Cat meows
This is an animal

```

### Summary:

This program shows that default methods give a common implementation to all classes that implement the interface.

---

## 5. Program 2: Overriding a Default Method

**Headline:** Demonstrating how a class can change the behavior of a default method.

### Why this program is used:

This program explains that even though the interface provides a default method, the implementing class has the freedom to override it.
This is useful when a class needs a different behavior.

### Program Code:

```java
interface Greeting {
    default void welcome() {
        System.out.println("Welcome to Java");
    }
}

class Student implements Greeting {
    public void welcome() {
        System.out.println("Welcome to the student portal");
    }
}

public class OverrideDefaultDemo {
    public static void main(String[] args) {
        Greeting g = new Student();
        g.welcome();
    }
}

```

### Detailed explanation:

* Greeting is an interface with a default method welcome().
* Student overrides welcome() with its own message.
* The object calls the overridden method.

### Pseudocode:

1. Create interface Greeting with default welcome().
2. Create class Student implementing Greeting.
3. Override welcome() in Student.
4. In main, create Student object using Greeting reference.
5. Call welcome().
6. End the program.

### Output:

```text
Welcome to the student portal

```

### Summary:

This program demonstrates that overriding a default method allows classes to customize shared behavior.

---

## 6. Final Conclusion

Default methods in interfaces are very useful because they allow interfaces to evolve without breaking older implementations.
They provide a balance between abstraction and flexibility.
Understanding default methods is important for writing professional Java code.
