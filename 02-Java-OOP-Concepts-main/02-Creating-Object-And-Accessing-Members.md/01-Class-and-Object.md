# Class and Object in Java

## Definition

A class is a blueprint or template used to create objects. It defines the data (variables) and behavior (methods) that an object will have.

An object is a real instance of a class. It represents a real-world entity and contains its own data and behavior defined by the class.

---

## What is a Class?

A class is like a blueprint for creating objects.

A class defines:

* Data (variables or fields)
* Behavior (methods)

### Example:

```

class Car {
String color;
int speed;

void drive() {
System.out.println("Car is moving");
}

}

```

In this example:

* color and speed are data members.
* drive() is a behavior.

---

## What is an Object?

An object is an instance of a class.

### Example:

Car c1 = new Car();

Here:

* Car is the class.
* c1 is the object.
* new Car() creates a new object.

---

## Class vs Object

| Class                 | Object                   |
| --------------------- | ------------------------ |
| Blueprint or template | Real instance of a class |
| Defines structure     | Uses the structure       |
| Example: Car          | Example: c1              |

---

## Simple Example

```

class Student {

String name;
int age;

void display() {
System.out.println("Name: " + name);
System.out.println("Age: " + age);
}

}

public class Main {

public static void main(String[] args) {

Student s1 = new Student();

s1.name = "Rahul";
s1.age = 20;

s1.display();

}

}

```

### Output

Name: Rahul
Age: 20

---

## How Objects Access Class Members

Objects access variables and methods using the dot operator (.).

### Example:

s1.name = "Rahul";
s1.display();

Here:

* s1 is the object.
* name is an instance variable.
* display() is a method.

---

## Real-Life Analogy

Class : Cookie Cutter

Object : Cookie

A class is used to create multiple objects, just as a cookie cutter is used to create many cookies.

---

## Multiple Objects Example

Student s1 = new Student();
Student s2 = new Student();
Student s3 = new Student();

All objects belong to the same class but store different values independently.

---

## Example with Two Objects

Student s1 = new Student();
Student s2 = new Student();

s1.name = "Amit";
s1.age = 21;

s2.name = "Riya";
s2.age = 22;

s1.display();
s2.display();

### Output

Name: Amit
Age: 21

Name: Riya
Age: 22

---

## Important Points

* A class is a blueprint for objects.
* An object is an instance of a class.
* Multiple objects can be created from the same class.
* Each object has its own copy of instance variables.
* Methods define object behavior.
* Objects access members using the dot operator (.).

---

## Summary

A class defines what an object should be, and an object is the actual instance created from that class. Classes and objects are the foundation of Object Oriented Programming in Java.

```

---

