# Object Oriented Programming (OOP)

## 1. Definition

* Object Oriented Programming (OOP) is a programming approach that solves real-world problems using objects.
* In this approach, real-world entities are represented as objects in code.
* Objects are programming representations of real-world things.

Examples:

* Chair
* Pen
* Table
* Book
* Glass

---

## 2. Object Components

Every object has two main parts:

1. State
2. Behaviour

### State

* State refers to the properties or attributes of an object.
* It tells what the object has.

Examples:

* name
* age
* gender
* color
* price
* brand

### Behaviour

* Behaviour refers to the actions performed by an object.
* It tells what the object does.

Examples:

* eating
* reading
* rotating
* giving air

---

## 3. Real World Examples

### Student

State:

* name
* age
* gender

Behaviour:

* eating
* reading
* sleeping

### Fan

State:

* color
* price
* brand

Behaviour:

* rotating
* giving air

---

## 4. Important Note

* Object: A real-world entity.
* Class: A blueprint or template used to create objects.

---

## 5. Class and Object Relationship

* All information needed to create an object is written inside a class.
* A class acts as a blueprint for an object.
* JVM creates objects using the class definition.
* Data types represent object state.
* Methods represent object behaviour.

---

## 6. Features of OOP in Java

### Class and Object

* Class is a blueprint.
* Object is an instance of a class.

Example:

Car is a class.

myCar is an object.

### Encapsulation

* Wrapping data and methods together inside a class.
* Provides data hiding.
* Achieved using access modifiers.

### Abstraction

* Showing essential features and hiding implementation details.
* Achieved using abstract classes and interfaces.

### Inheritance

* One class acquires properties and methods of another class.
* Supports code reusability.

### Polymorphism

* One thing can take many forms.
* Achieved through:

  * Method Overloading
  * Method Overriding

---

## 7. Advantages of OOP

* Code Reusability
* Easy Maintenance
* Data Security
* Modularity
* Easy Debugging
* Real World Modeling
* Flexibility
* Scalability
* Better Team Work
* Improved Productivity

---

## 8. Procedural Programming vs OOP

| Procedural Programming          | Object Oriented Programming   |
| ------------------------------- | ----------------------------- |
| Focuses on functions            | Focuses on objects            |
| Data and functions are separate | Data and methods are together |
| Less secure                     | More secure                   |
| Limited code reuse              | High code reuse               |
| Hard to maintain                | Easy to maintain              |
| Suitable for small programs     | Suitable for large programs   |
| Example: C                      | Example: Java                 |

---

## 9. Memory Segments

### Stack Segment

* Stores local variables.
* No default values.

### Heap Segment

* Stores objects.
* Objects get default values.

---

## 10. Object Creation in Java

1. Use the `new` keyword to create an object.
2. JVM allocates memory in heap memory.
3. Memory stores object states and behaviours.
4. The object address is stored in a reference variable.
5. The reference variable type must match the class type.
6. Objects without references become garbage objects.
7. Garbage Collector removes garbage objects.
8. Instance variables receive default values.

---

## 11. Conclusion

Object Oriented Programming helps organize programs efficiently by using:

* Objects
* Classes
* Encapsulation
* Abstraction
* Inheritance
* Polymorphism

These concepts make Java programs reusable, secure, maintainable, and easy to understand.
