OOPs Interview Questions and Answers in Java
===========================================

1. What is OOPs? 

OOPs stands for Object-Oriented Programming. It is a programming style based on objects and classes.

2. What is a class in Java?

A class is a blueprint or template that defines the properties and behavior of objects.

3. What is an object in Java?

An object is an instance of a class. It represents a real-world entity and occupies memory.

4. What is the difference between class and object?

- Class is a blueprint.
- Object is a real instance created from the class.

5. What are the main principles of OOPs?

The four main principles are:
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction

6. What is encapsulation?

Encapsulation is the process of wrapping data (variables) and methods into a single unit called class.
It hides the internal details and protects data.

7. What is data hiding?

Data hiding means restricting direct access to some data using access modifiers like private.

8. What is inheritance?

Inheritance allows one class to acquire properties and methods of another class.

9. What is the syntax for inheritance in Java?

class Child extends Parent {
}

10. What is the difference between superclass and subclass?

- Superclass is the parent class.
- Subclass is the child class that inherits from the parent.

11. What is polymorphism?

Polymorphism means one thing taking many forms.
In Java, it is achieved by method overloading and method overriding.

12. What is method overloading?

Method overloading means having multiple methods with the same name but different parameters.

13. What is method overriding?

Method overriding means redefining a method in the child class that already exists in the parent class.

14. What is abstraction?

Abstraction means hiding implementation details and showing only the essential functionality.

15. What is the difference between abstraction and encapsulation?

- Abstraction hides complexity.
- Encapsulation hides data and protects it.

16. What is an abstract class?

An abstract class is a class that cannot be instantiated directly and may contain abstract methods.

17. What is an abstract method?

An abstract method has no body and must be implemented by subclasses.

18. What is an interface?

An interface is a blueprint of a class that contains abstract methods and constants.
A class implements an interface.

19. Difference between abstract class and interface.

- Abstract class can have constructors and normal methods.
- Interface cannot have constructors.
- A class can extend only one abstract class but implement many interfaces.

20. What is a constructor?

A constructor is a special method used to initialize objects.
It has the same name as the class and no return type.

21. What is the default constructor?

If no constructor is defined, Java automatically provides a default constructor.

22. What is constructor overloading?

Constructor overloading means creating multiple constructors with different parameter lists.

23. What is the this keyword?

this refers to the current object.

24. What is the super keyword?

super refers to the parent class object and is used to access parent class members.

25. What is method overloading and method overriding with example?

Method overloading:
class Demo {
    void add(int a, int b) {}
    void add(double a, double b) {}
}

Method overriding:
class Animal {
    void sound() { System.out.println("Animal"); }
}
class Dog extends Animal {
    void sound() { System.out.println("Dog"); }
}

26. Why is OOPs useful?

It improves code reusability, maintainability, flexibility, and readability.

27. What is association in OOPs?

Association means one object uses or interacts with another object.

28. What is aggregation?

Aggregation is a weak form of association where one object owns another object but can exist independently.

29. What is composition?

Composition is a strong form of association where one object is a part of another object and cannot exist independently.

30. What is a package in Java?

A package is a group of related classes and interfaces.

31. What is the difference between public, private, protected, and default access modifiers?

- public: accessible everywhere
- private: accessible only inside the same class
- protected: accessible in same package and subclasses
- default: accessible only within the same package

32. What is a static variable?

A static variable belongs to the class, not to individual objects.

33. What is a static method?

A static method belongs to the class and can be called without creating an object.

34. Difference between static and instance members.

- Static members belong to the class.
- Instance members belong to each object.

35. What is a final keyword?

final is used to restrict modification.
It can be used with variables, methods, and classes.

36. What is the use of final class?

A final class cannot be inherited.

37. What is the use of final method?

A final method cannot be overridden.

38. What is the use of final variable?

A final variable cannot be changed once assigned.

39. Can we overload a static method?

Yes, we can overload static methods.

40. Can we override a static method?

No, static methods cannot be overridden because they are resolved at compile time.

41. What is the difference between compile-time and runtime polymorphism?

- Compile-time polymorphism is method overloading.
- Runtime polymorphism is method overriding.

42. What is object initialization?

Object initialization means assigning values to the object using constructors or setter methods.

43. What is the significance of access modifiers in OOPs?

They control visibility and protect data from unauthorized access.

44. What is a real-world example of OOPs?

A Car class can have properties like color, speed, and methods like start(), stop().

45. Can one class inherit from multiple classes in Java?

No, Java does not support multiple inheritance using classes, but it supports multiple inheritance through interfaces.

46. Why do we use interfaces in Java?

To achieve abstraction and support multiple inheritance.

47. Explain the concept of IS-A and HAS-A relationships.

- IS-A: inheritance relationship
- HAS-A: composition/aggregation relationship

48. What is the difference between inheritance and composition?

- Inheritance represents IS-A relationship.
- Composition represents HAS-A relationship.

49. What is a nested class?

A nested class is a class declared inside another class.

50. Why is OOPs preferred over procedural programming?

OOPs provides modularity, code reuse, security, and easier maintenance.

51. What is a model class?

A model class is used to represent data in the application, usually with variables and getters/setters.

52. What is the role of getters and setters?

They provide controlled access to private data.

53. What is the difference between == and equals() in Java?

- == compares references (memory addresses)
- equals() compares values (if overridden)

54. What is object cloning?

Object cloning creates a copy of an existing object.

55. What is the purpose of the toString() method?

toString() returns a string representation of the object.

56. Why is the main() method static in Java?

Because it can be called without creating an object.

57. What is the difference between a class and a record in Java?

A class is a general-purpose blueprint, while a record is a compact way to model immutable data.

58. What is a constructor chain?

Constructor chaining means calling one constructor from another using this() or super().

59. What is the difference between this() and super()?

- this() calls another constructor in the same class.
- super() calls the parent class constructor.

60. Short answer: What is OOPs in Java?

OOPs in Java is a programming approach where data and behavior are grouped into objects and classes to make programs reusable, organized, and secure.

Conclusion
----------

OOPs is one of the most important topics in Java interviews. Understanding classes, objects, inheritance, abstraction, encapsulation, and polymorphism is essential for writing good Java programs.
