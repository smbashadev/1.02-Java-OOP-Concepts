# Interface-Interview-Questions

---

## 1. Core Interface Concepts

### Q1: What is an interface in Java?

**Answer:** An interface in Java is a blueprint of a class. It defines a contract that classes must follow. It contains abstract methods, default methods, static methods, and constants. An interface is used to achieve abstraction and multiple inheritance of type.

### Q2: Why do we use interfaces in Java?

**Answer:** We use interfaces to:

* Achieve abstraction
* Define a common contract
* Support multiple inheritance
* Reduce coupling
* Make code flexible and maintainable

### Q3: What is the difference between an interface and a class?

**Answer:** A class can have both state and behavior, while an interface mainly defines behavior. A class can be instantiated, but an interface cannot be instantiated directly. A class can extend only one class, but can implement many interfaces.

### Q4: Can an interface have variables?

**Answer:** Yes. Variables in an interface are implicitly `public static final`. They are constants by default.

### Q5: Can an interface have constructors?

**Answer:** No. Interfaces cannot have constructors because they are not instantiated directly.

---

## 2. Interface Methods & Changes in Java 8+

### Q6: Can an interface have methods with bodies?

**Answer:** Yes. Since Java 8, interfaces can have:

* Default methods with bodies
* Static methods with bodies

Before Java 8, methods in interfaces were abstract only.

### Q7: What is the difference between default and abstract methods in an interface?

**Answer:**

* **Abstract methods:** Have no body and must be implemented by the class.
* **Default methods:** Have a body and need not be overridden by the class unless customized behavior is needed.

### Q8: Can a default method be overridden?

**Answer:** Yes. A class can override a default method if it wants different behavior.

### Q9: Can a static method in an interface be overridden?

**Answer:** No. Static methods cannot be overridden because they belong to the interface itself, not to the implementing objects.

### Q10: Can we declare private methods inside an interface?

**Answer:** Yes. Since Java 9, interfaces can have private methods. These are used to share common code between default or static methods within the same interface.

### Q11: What happens if a class implements two interfaces having the same default method?

**Answer:** The class must override the conflicting default method explicitly to resolve ambiguity. Otherwise, the compiler will throw an ambiguity error.

---

## 11. Real-World Applications & OOP Design

### Q12: What is the difference between an abstract class and an interface?

**Answer:**

| Feature | Interface | Abstract Class |
| --- | --- | --- |
| **Methods** | Can contain abstract, default, static, and private methods. | Can contain abstract and concrete methods. |
| **Fields** | Only `public static final` constants. | Can have instance variables with any access modifier. |
| **Constructors** | Cannot have constructors. | Can have constructors. |
| **Inheritance** | A class can implement multiple interfaces. | A class can extend only one abstract class. |

### Q13: Can a class implement multiple interfaces?

**Answer:** Yes. A class can implement multiple interfaces. This is one of the main benefits of interfaces in Java.

### Q14: Can one interface extend another interface?

**Answer:** Yes. An interface can extend one or more interfaces using the `extends` keyword.

### Q15: Can an interface extend a class?

**Answer:** No. An interface cannot extend a class. It can only extend another interface.

### Q16: Can an interface implement another interface?

**Answer:** No. An interface cannot implement another interface. It can only extend it.

---

## 4. Marker & Functional Interfaces

### Q17: What is a marker interface?

**Answer:** A marker interface is an interface without any methods. It is used to tag or mark classes so that the JVM or a framework can identify special behavior.

* *Example:* `Serializable`, `Cloneable`.

### Q18: What is a functional interface?

**Answer:** A functional interface is an interface that has exactly one abstract method. It can have multiple default or static methods.

* *Example:* `Runnable`, `Callable`.

### Q19: What is the @FunctionalInterface annotation?

**Answer:** It is an optional annotation used to indicate that an interface is intended to be a functional interface. The compiler will generate an error if more than one abstract method is present.

### Q20: What is a lambda expression in relation to interfaces?

**Answer:** A lambda expression is a short way to provide an implementation for a functional interface.

* *Example:* `(a, b) -> a + b;`

---

## 5. Modifiers & Keywords

### Q21: What is the default access modifier for interface methods?

**Answer:** Methods are implicitly `public abstract` by default if they are abstract. Default and static methods are also implicitly `public`.

### Q22: What is the default access modifier for fields in an interface?

**Answer:** Fields are implicitly `public static final` by default.

### Q23: Can an interface have a main method?

**Answer:** Yes. Since an interface can contain static methods, it can also have a `public static void main(String[] args)` method.

### Q24: Can an interface have synchronized methods?

**Answer:** No. Interface method declarations cannot use the `synchronized` modifier because synchronization is an execution implementation detail, not a structural behavior contract.

---

## 6. Inheritance & Polymorphism

### Q22: Why does Java not support multiple inheritance using classes?

**Answer:** Java does not allow a class to extend more than one class to avoid complexity and ambiguity (like the Diamond Problem). Interfaces solve this issue by allowing multiple inheritance of type without sharing a state.

### Q23: What is polymorphism in relation to interfaces?

**Answer:** Polymorphism allows an interface reference variable to point to different implementation objects. This allows the same method call to trigger different behaviors at runtime.

### Q24: What is runtime polymorphism with interfaces?

**Answer:** Runtime polymorphism happens when the actual object type pointing to an interface reference is determined during program execution.

---

## 7. Operational Mechanics

### Q25: Can we create an object of an interface?

**Answer:** No. An interface cannot be instantiated directly using `new`. You must instantiate a class that implements the interface.

### Q26: What is the role of the implements keyword?

**Answer:** The `implements` keyword is used by a class to declare that it will provide concrete logic for the abstract methods defined by the interface.

### Q27: What is the role of the extends keyword with interfaces?

**Answer:** The `extends` keyword is used by an interface to inherit declarations from a parent interface.

### Q28: What is the difference between implements and extends?

**Answer:**

* `extends` is used for inheritance between similar types (class to class, or interface to interface).
* `implements` is used when a class realizes the behavior defined by an interface.

### Q29: Can an interface be nested inside another interface or class?

**Answer:** Yes. Interfaces can be nested inside both classes and other interfaces. They are implicitly static by default.

### Q30: What happens if a class does not implement all abstract methods of an interface?

**Answer:** The implementing class must be declared as an `abstract` class.

### Q31: What is the difference between a class implementing an interface and a subclass extending a class?

**Answer:** Implementing an interface establishes a contract for behavioral capability ("can-do"). Extending a class inherits state and working code implementation ("is-a").

### Q32: Can an interface have method overloading?

**Answer:** Yes. Interface methods can be overloaded just like normal class methods by changing the parameter list.

---

## 8. Built-in Core Java Interfaces

### Q33: What is the use of the Serializable interface?

**Answer:** `Serializable` is a marker interface used to flag a class so that its objects can be flattened into a byte stream for storage or network transfer.

### Q34: What is the use of the Comparable interface?

**Answer:** `Comparable` is used to define the natural ordering of objects of a class by implementing the `compareTo()` method.

### Q35: What is the use of the Runnable interface?

**Answer:** `Runnable` is a functional interface used to represent a task execution block that can be run concurrently by a thread.

### Q36: What is the difference between Comparable and Comparator?

**Answer:**

* `Comparable` defines the internal natural sorting logic for an object via `compareTo()`.
* `Comparator` is a separate external handler used to sort objects in custom configurations via `compare()`.

### Q37: Why is List an interface in Java Collections?

**Answer:** `List` defines the foundational behavior of an ordered sequence collection. This allows developers to use different underlying structures like `ArrayList` (indexed array) or `LinkedList` (linked nodes) interchangeably.

### Q38: What is the main advantage of using interfaces in Java collections?

**Answer:** The framework relies on interfaces like `List`, `Set`, and `Map` to allow multiple data structures to be swapped dynamically without breaking the client-side code logic.

---

## 9. Structural Code Examples

### Q39: Give an example of an interface.

```java
interface Animal {
    void sound();
}

```

### Q40: Give an example of a class implementing an interface.

```java
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

```

---

## 10. Design Architecture & Best Practices

### Q41: Why are interfaces useful in large applications?

**Answer:** They decouple application design from concrete implementations. This improves modularity, maintainability, team parallelization, and component testability.

### Q42: What is the difference between an interface and an abstract class from a design perspective?

**Answer:** Use an interface when defining peripheral features across completely unrelated classes. Use an abstract class when defining an identity framework for closely related components that share structural traits.

### Q43: Can interfaces help in testing?

**Answer:** Yes. Interfaces allow the creation of mock objects and support dependency injection frameworks, making automated unit testing clean and isolated.

### Q44: Can interfaces help in API design?

**Answer:** Yes. They publish exposed interaction contracts for users while completely shielding the proprietary backend engine implementation details.

### Q45: Can we use interfaces for loose coupling?

**Answer:** Yes. Callers bind their workflows to the high-level interface contract rather than direct concrete implementations, keeping components decoupled.

### Q46: Is it possible to use interface references with different implementations?

**Answer:** Yes. This is a common object-oriented design approach where code depends on abstraction rather than implementation.

### Q47: What is the difference between an interface and inheritance?

**Answer:** An interface establishes a contract for behavioral capabilities, while classical inheritance shares implementation details and state definitions.

### Q48: What should you prefer in large applications: an interface or a class?

**Answer:** Prefer interfaces to establish architecture boundaries and system contracts, and use classes for localized implementations.

### Q49: How does an interface help in dependency injection?

**Answer:** It ensures modules interact via abstractions rather than direct class hooks, enabling frameworks to swap engine components dynamically.

---

## 11. Final Summary Definitions

### Q50: What is the best short definition of an interface?

**Answer:** An interface is a contract that specifies what methods a class must provide without dictating how they must behave.

### Q51: What is the best short definition of abstraction?

**Answer:** Abstraction means hiding background implementation details and exposing only essential interface touchpoints.

### Q52: Quick Interview Checklist:

> When answering interface-focused questions, remember to cover these four pillars:
> 1. **Abstraction** (Hiding execution patterns)
> 2. **Contracts** (Enforcing design rules)
> 3. **Multiple Inheritance of Type** (Bypassing single class limits)
> 4. **Polymorphism** (Decoupling execution paths dynamically)
> 
> 

### Q53: Final Summary:

Interfaces are used to define behavior, support abstraction, allow multiple inheritance of type, and help in designing flexible Java applications.
