# Class and Object Diagrams in Java

## Definition

This document provides diagram-based explanations of Class and Object in Java. It uses simple illustrations, real-world examples, memory representations, and analogies to help understand how classes create objects and how objects store their own data.

## 1. Simple Diagram

Class (Blueprint)
      |
      | creates
      |
      v
Object (Real Item)

### Explanation:

A class is the design or template.
An object is the actual thing created from that design.

## 2. Real-Life Example Diagram

Class: Car
----------------
Properties:
- color
- brand
- speed

Methods:
- start()
- stop()
Object 1: car1

----------------

color = Red
brand = Toyota
speed = 80
Object 2: car2

----------------

color = Blue
brand = Honda
speed = 60

### Explanation:

Both objects are created from the same class Car, but each object stores different values.

## 3. Java Diagram

```java
class Student
{
    String name;
    int age;

    void display() { }
}

```

```
  new Student()
        |
        v
   s1 (object)

```

name = "Amit"
age  = 21
new Student()
|
v
s2 (object)

name = "Riya"
age  = 22

## 4. Memory Diagram

Class Student

---

name
age
display()
Object s1

---

name -> "Amit"
age  -> 21
Object s2

---

name -> "Riya"
age  -> 22

### Explanation:

Every object gets its own copy of instance variables.

## 5. Cookie Cutter Analogy

Class = Cookie Cutter
Object = Cookie
Cookie Cutter
|
| used to create
|
v

Cookie 1
Cookie 2
Cookie 3

### Explanation:

One class can create multiple objects.

## 6. Short Revision Diagram

Blueprint (Class)
|
| creates
|
v
Actual Thing (Object)

## 8. Another Example

Class: Dog

---

color
breed
bark()
Object: d1

---

color = Brown
breed = Labrador
Object: d2

---

color = White
breed = Pug

## Summary

Class is a blueprint.
Object is an instance of a class.
One class can create many objects.
Every object stores its own data independently.
Objects share the same methods defined in the class.

```
