# Most important interview questions and answers on Class and Object in Java

---

## 1) What is a class in Java?
A class is a **blueprint** or template that defines the structure and behavior of objects. It contains:
- data members (fields)
- methods
- constructors

### Example:
```java
class Student {
    String name;
    int age;
}

```

---

## 2) What is an object in Java?

An object is a **real-world entity** created from a class. It holds data and can perform actions.

### Example:

```java
Student s1 = new Student();

```

---

## 3) Difference between class and object

| Class | Object |
| --- | --- |
| Blueprint/template | Instance of a class |
| Does not occupy memory | Occupies memory |
| Declared once | Created many times |

---

## 4) How do you create an object in Java?

Using the `new` keyword.

### Example:

```java
Student s = new Student();

```

---

## 5) What is the role of `new` keyword?

`new` allocates memory for the object and calls the constructor.

---

## 6) What is an instance variable?

An instance variable is declared inside a class but outside methods. Each object gets its own copy.

### Example:

```java
class Student {
    String name; // instance variable
}

```

---

## 7) What is a reference variable?

A reference variable stores the address of an object, not the object itself.

### Example:

```java
Student s = new Student();

```

Here, `s` is a reference variable.

---

## 8) Can a class exist without an object?

Yes. A class is just a definition. It can exist without creating any object.

---

## 9) What is the difference between state and behavior?

* **State** = data/fields of an object
* **Behavior** = methods/functions of an object

### Example:

* State: `name`, `age`
* Behavior: `study()`, `sleep()`

---

## 10) What is a constructor?

A constructor is a special method used to initialize objects. It has the same name as the class and no return type.

### Example:

```java
class Student {
    Student() {
        System.out.println("Object created");
    }
}

```

---

## 11) What is the default constructor?

If no constructor is defined, Java provides a default constructor automatically.

---

## 12) Can a class have multiple constructors?

Yes, this is called **constructor overloading**.

### Example:

```java
class Student {
    Student() {}
    Student(String name) {}
}

```

---

## 13) What is the difference between object and class in terms of memory?

* Class: no memory allocated (except class metadata)
* Object: memory allocated at runtime

---

## 14) How many objects can be created from one class?

Any number of objects can be created from a single class.

### Example:

```java
Student s1 = new Student();
Student s2 = new Student();
Student s3 = new Student();

```

---

## 15) What is the purpose of getters and setters?

They are used to access and update private data safely.

### Example:

```java
public String getName() { return name; }
public void setName(String name) { this.name = name; }

```

---

## 16) What is `this` keyword in class?

`this` refers to the current object.

### Example:

```java
this.name = name;

```

---

## 17) Can an object call a method of another object?

Yes. One object can use another object's methods if the reference is available.

### Example:

```java
s1.display(s2);

```

---

## 18) What happens if you do not initialize an object?

You must initialize object references before using them, otherwise you may get a `NullPointerException`.

### Example:

```java
Student s = null;
s.name = "A";   // error

```

---

## 19) What is object-oriented programming (OOP)?

OOP is a programming style based on objects and classes. Main concepts:

* Class
* Object
* Encapsulation
* Inheritance
* Polymorphism
* Abstraction

---

## 20) Why are classes important in Java?

Classes help in:

* organizing code
* reusability
* modeling real-world entities
* reducing duplication

---

## 21) What is the difference between instance method and static method?

* **Instance method** works on object data
* **Static method** belongs to the class, not object

### Example:

```java
class Test {
    void show() {}      // instance
    static void print() {} // static
}

```

---

## 22) Can we create an object without using `new`?

Technically, yes, by using:

* `clone()`
* serialization/deserialization
* factory methods
But normally objects are created using `new`.

---

## 23) What is object identity?

Every object has a unique identity in memory. Even if two objects have same values, they are different objects.

---

## 24) What is the relation between class and object?

A class is a definition, and an object is a concrete realization of that definition.

---

## 25) Short interview answer for class and object

> A class is a blueprint that defines properties and behaviors, while an object is an instance of that class created in memory.

