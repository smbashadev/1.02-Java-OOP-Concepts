# Abstraction Interview Questions in Java

This file contains a complete set of interview questions related to abstraction in Java, along with short, professional answers.

---

## Basic Interview Questions

### 1. What is abstraction in Java?

Abstraction is the process of hiding implementation details and showing only the essential features of an object.

### 2. Why is abstraction important in Java?

It reduces complexity, improves code readability, and helps build flexible and maintainable software.

### 3. What is the difference between abstraction and encapsulation?

Abstraction focuses on hiding implementation details, while encapsulation focuses on hiding data and restricting access to it.

### 4. What is an abstract class in Java?

An abstract class is a class that cannot be instantiated directly and may contain abstract as well as concrete methods.

### 5. What is an abstract method?

An abstract method is a method declared without a body and must be implemented by subclasses.

### 6. Can we create an object of an abstract class?

No, an abstract class cannot be instantiated directly.

### 7. Can an abstract class have a constructor?

Yes, an abstract class can have constructors.

### 8. Can an abstract class have both abstract and concrete methods?

Yes, an abstract class can contain both abstract and fully implemented methods.

### 9. Can an abstract class inherit another abstract class?

Yes, an abstract class can inherit from another abstract class.

### 10. Can a normal class inherit from an abstract class?

Yes, a normal class can inherit from an abstract class, but it must implement all abstract methods.

---

## Intermediate Interview Questions

### 11. What happens if a subclass does not implement all abstract methods?

The subclass must also be declared abstract.

### 12. Can we declare a class as abstract without having any abstract method?

Yes, a class can be declared abstract even if it has no abstract methods.

### 13. What is the use of the `abstract` keyword?

It is used to declare classes or methods that are incomplete and require implementation in subclasses.

### 14. Can an abstract class have static methods?

Yes, an abstract class can have static methods.

### 15. Can an abstract class have final methods?

Yes, an abstract class can have final methods.

### 16. Can an abstract class have instance variables?

Yes, it can have instance variables.

### 17. Can an abstract class have a `main()` method?

Yes, an abstract class can have a `main()` method.

### 18. What is the difference between abstract class and interface?

An abstract class can have both abstract and concrete methods and fields, while an interface mainly defines a contract with abstract methods (and default/static methods in newer versions).

### 19. When should we use an abstract class?

Use it when multiple classes share common code and behavior but also need some specific implementation.

### 20. When should we use an interface instead of an abstract class?

Use an interface when you want to define a contract without depending on class inheritance.

---

## Coding-Based Interview Questions

### 21. Can an abstract class implement an interface?

Yes, it can implement an interface without implementing all the methods.

### 22. Can an abstract class extend another class and implement an interface together?

Yes, it can do both.

### 23. Can abstract methods be declared private?

No, abstract methods cannot be private.

### 24. Can abstract methods be declared static?

No, abstract methods cannot be static.

### 25. Can abstract methods be declared final?

No, abstract methods cannot be final.

### 26. Can abstract methods have a body?

No, abstract methods do not have a body.

### 27. What is the role of `@Override` in abstract class programs?

It tells the compiler that the method is overriding a parent method.

### 28. What is the difference between abstract method declaration and normal method declaration?

An abstract method is declared without a body, while a normal method includes a body.

### 29. Why do we use `super()` in subclasses of abstract classes?

To call the constructor of the parent abstract class.

### 30. How does abstraction help in polymorphism?

Abstraction allows a base reference type to point to different subclass objects while hiding the internal details.

---

## Conceptual Interview Questions

### 31. What is the relationship between abstraction and inheritance?

Abstraction is often implemented using inheritance, where the parent defines a common structure and child classes provide specific behavior.

### 32. What is the relationship between abstraction and polymorphism?

Abstraction helps define a common contract, and polymorphism allows different objects to be treated using the same reference.

### 33. Why is abstraction called a design principle?

Because it helps define the essential behavior of a system while hiding unnecessary details.

### 34. Can abstraction reduce complexity in large applications?

Yes, it makes large systems easier to understand and maintain.

### 35. How does abstraction improve software design?

It separates what an object does from how it does it.

### 36. Is abstraction only used with classes?

No, abstraction can also be expressed using interfaces and abstract methods.

### 37. What is the difference between hiding details and hiding data?

Hiding details is abstraction; hiding data with access restrictions is encapsulation.

### 38. Why do we say abstraction is a "high-level view"?

Because it focuses on the essential features rather than internal implementation.

### 39. What is a real-world example of abstraction?

A car driver uses the steering wheel, accelerator, and brakes without knowing all internal engine details.

### 40. Why is `processPayment()` a good abstract method example?

Because every payment type performs payment processing, but the internal logic differs.

---

## Advanced Interview Questions

### 41. Can an abstract class contain a `private` method?

Yes, it can contain private methods.

### 42. Can an abstract class contain a `protected` method?

Yes, it can contain protected methods.

### 43. Can we declare an abstract class as `final`?

No, an abstract class cannot be declared `final`.

### 44. Can we declare an abstract method as `private`?

No, abstract methods cannot be private.

### 45. Can an abstract class contain a `main()` method and run successfully?

Yes, it can contain a `main()` method, but the class itself cannot be instantiated.

### 46. Why can’t abstract methods be static or final?

Because static methods are bound at compile time and final methods cannot be overridden, which conflicts with the concept of abstract behavior that must be implemented by subclasses.

### 47. How do you explain abstraction to a beginner?

By saying that abstraction is about focusing on what an object does rather than how it does it.

### 48. Why is abstraction useful in API design?

It lets developers expose only useful operations while hiding internal complexity.

### 49. Can an abstract class have a non-abstract constructor?

Yes, it can have both abstract and non-abstract constructors.

### 50. What is one-line summary of abstraction?

Abstraction hides complexity and exposes only the necessary behavior.

---

## Short Viva Questions

### 51. What keyword is used to declare an abstract class?

`abstract`

### 52. What keyword is used to declare an abstract method?

`abstract`

### 53. Can an abstract class be instantiated?

No

### 54. Can a subclass of an abstract class be abstract?

Yes

### 55. What is the difference between an abstract class and a concrete class?

An abstract class cannot be instantiated directly, while a concrete class can.

### 56. Why do we use `@Override`?

To mark method overriding clearly.

### 57. Can a class implement multiple interfaces?

Yes

### 58. Can a class extend only one abstract class?

Yes, Java supports single inheritance for classes.

### 59. What does `super()` do?

It calls the parent constructor.

### 60. Why is abstraction useful in teamwork?

It allows different developers to work on different parts of the system using a shared contract.

---

## Bonus Interview Tips

* Always explain abstraction using the phrase: "what it does" rather than "how it does it".
* Use examples like `Shape`, `Animal`, `PaymentGateway`, or `Vehicle`.
* Mention the role of abstraction in polymorphism and code organization.
* Be clear that abstraction helps in design, not just syntax.

---

## Final Revision Summary

Abstraction in Java is one of the most important OOP concepts.
It helps us hide complexity, define contracts, promote reusability, and build scalable software.
A good answer in interviews should mention:

* definition,
* abstract class,
* abstract method,
* constructor behavior,
* differences from interface,
* and real-world applications.
