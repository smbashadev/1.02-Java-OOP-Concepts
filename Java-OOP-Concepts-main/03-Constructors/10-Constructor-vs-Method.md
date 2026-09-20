# Constructor vs Method in Java

## Definition

A **constructor** is a special member of a class that is used to initialize objects. It is automatically executed when an object is created.

A **method** is a block of code that performs a specific task and is executed only when it is explicitly called.

---

## Why this Topic is Important

* Helps understand object initialization and object behavior.
* Explains the difference between setup logic and operational logic.
* Important for Java interviews and object-oriented programming concepts.
* Makes class design easier to understand.

---

## Constructor

A constructor:

* Has the same name as the class.
* Does not have any return type.
* Is called automatically during object creation.
* Is mainly used to initialize object variables.

### Example

```java
class Student {

    String name;

    Student() {

        name = "Unknown";
    }
}
```

---

## Method

A method:

* Can have any valid name.
* May return a value or use void.
* Is called explicitly using an object.
* Is used to perform a specific operation.

### Example

```java
class Student {

    void display() {

        System.out.println("Display Method");
    }
}
```

---

# Program 1

## Headline

Understanding Constructor and Method Execution

### Why this Program is Used

This program demonstrates that constructors execute automatically, whereas methods execute only when called.

### Java Program with Comments on Each Step

```java
class Student {

    String name;

    int age;

    Student() {

        name = "Unknown";

        age = 0;

        System.out.println("Constructor called");
    }

    void display() {

        System.out.println("Name: " + name);

        System.out.println("Age: " + age);
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.display();
    }
}
```

### Output

```text
Constructor called
Name: Unknown
Age: 0
```

### Pseudocode

```text
START

CREATE Student class

DECLARE name

DECLARE age

DEFINE constructor

INITIALIZE values

PRINT constructor message

DEFINE display()

PRINT name

PRINT age

CREATE object

CALL display()

END
```

### Code Explanation

* `Student()` is the constructor.
* It executes automatically when the object is created.
* `display()` is a method.
* It executes only when explicitly called.
* Constructors initialize objects, whereas methods perform operations.

### Summary

This program proves that constructors are automatically executed during object creation and methods are executed only when invoked.

---

# Program 2

## Headline

Constructor Initializes Object and Method Performs Operation

### Why this Program is Used

This program shows that constructors prepare an object and methods use that object.

### Java Program with Comments on Each Step

```java
class Book {

    String title;

    int pages;

    Book(String t, int p) {

        title = t;

        pages = p;
    }

    void printBookDetails() {

        System.out.println("Title: " + title);

        System.out.println("Pages: " + pages);
    }
}

public class Main {

    public static void main(String[] args) {

        Book b1 = new Book("Java Basics", 250);

        b1.printBookDetails();
    }
}
```

### Output

```text
Title: Java Basics
Pages: 250
```

### Explanation

* `Book()` initializes the object.
* `printBookDetails()` performs the display operation.
* Constructors prepare the object before methods are used.

### Summary

Constructors initialize data, while methods perform actions using that data.

---

# Differences Between Constructor and Method

| Feature           | Constructor                   | Method                       |
| ----------------- | ----------------------------- | ---------------------------- |
| Name              | Same as class name            | Any valid name               |
| Return Type       | No return type                | Can have return type or void |
| Invocation        | Automatically called          | Explicitly called            |
| Purpose           | Initializes object            | Performs operations          |
| Execution         | Runs once per object creation | Runs whenever called         |
| Can Return Value  | No                            | Yes                          |
| Can be Overloaded | Yes                           | Yes                          |

---

# Constructor vs Method Example

```java
class Demo {

    Demo() {

        System.out.println("Constructor");
    }

    void show() {

        System.out.println("Method");
    }
}

public class Main {

    public static void main(String[] args) {

        Demo d = new Demo();

        d.show();
    }
}
```

### Output

```text
Constructor
Method
```

---

# Important Interview Points

* Constructor name must be the same as the class name.
* Constructors do not have a return type.
* Methods can have any valid name.
* Constructors are called automatically.
* Methods are called explicitly.
* Constructors initialize objects.
* Methods define object behavior.
* Both constructors and methods can be overloaded.
* Constructors cannot be inherited.
* Methods can be inherited.

---

# Advantages of Constructors

* Initializes objects automatically.
* Reduces repetitive code.
* Makes objects ready to use.
* Supports constructor overloading.

---

# Advantages of Methods

* Improves code reusability.
* Makes programs modular.
* Reduces code duplication.
* Improves maintainability.

---

# Short Revision Notes

```text
Constructor

- Same name as class
- No return type
- Called automatically
- Initializes object

Method

- Any valid name
- Can return values
- Called explicitly
- Performs operations
```

---

# One Line Summary

A constructor is used to initialize an object when it is created, whereas a method is used to perform operations after the object is created.
