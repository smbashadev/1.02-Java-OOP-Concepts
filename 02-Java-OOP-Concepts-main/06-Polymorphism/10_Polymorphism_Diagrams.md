# Polymorphism Diagrams in Java

## 1. Definition

* **Primary Definition:** Polymorphism means "many forms" (poly = many, morphs = forms). In Java, it is a core object-oriented principle that allows the exact same method call signature to behave completely differently depending on the underlying object type executing it.
* **One-Line Definition:** Polymorphism is the ability of an object or reference to take on multiple forms and execute contextual behaviors dynamically.

---

## 2. Types of Polymorphism

### A. Compile-Time Polymorphism (Static Binding)

* **Mechanism:** Achieved via **Method Overloading** (same method name, different parameter lists within the same class context).
* **Resolution:** The Java compiler resolves exactly which method to execute during the compilation phase based on argument types.

### B. Runtime Polymorphism (Dynamic Binding)

* **Mechanism:** Achieved via **Method Overriding** (subclass provides a specific implementation of a method declared in its parent class).
* **Resolution:** The Java Virtual Machine (JVM) resolves the method call at runtime based on the actual object instantiated on the heap.

---

## 3. Structural Diagrams for Polymorphism

### Concept 1: Reference vs. Object Memory Binding Map

This map visualizes how a single parent reference variable on the stack can point to various distinct heap objects over its lifecycle.

```text
       [ Stack ]                            [ Heap Objects ]
  Parent Reference Variable               Valid Target Instances
  
       ┌──────────┐                     ┌───────────────────────┐
       │ Animal a │ ──────────────────► │    new Animal()       │ (Base Object)
       └──────────┘                     └───────────────────────┘
            │
            │ (re-assigned)             ┌───────────────────────┐
            ├─────────────────────────► │      new Dog()        │ (Subclass Object)
            │                           └───────────────────────┘
            │
            │ (re-assigned)             ┌───────────────────────┐
            └─────────────────────────► │      new Cat()        │ (Subclass Object)
                                        └───────────────────────┘

```

---

### Concept 2: Method Overloading Compilation Routing

This diagram traces how the compiler binds distinct signatures of an overloaded method name to separate matching implementation definitions.

```text
      Source Code Method Call                 Resolved Target Definition
      
        add(10, 20)           ──────────►   add(int a, int b)
        
        add(10.5, 20.5)       ──────────►   add(double a, double b)
        
        add(10, 20, 30)       ──────────►   add(int a, int b, int c)

```

---

### Concept 3: Inheritance Hierarchy and Method Overriding Map

This map layouts structural method inheritance and highlights how child classes override the behavior of the parent contract.

```text
                         ┌───────────────────────────┐
                         │          Animal           │
                         ├───────────────────────────┤
                         │ + sound(): Base Behavior  │
                         └───────────────────────────┘
                                       ▲
                                       │
                    ┌──────────────────┴──────────────────┐
                    │                                     │
      ┌───────────────────────────┐         ┌───────────────────────────┐
      │            Dog            │         │            Cat            │
      ├───────────────────────────┤         ├───────────────────────────┤
      │ @Override                 │         │ @Override                 │
      │ + sound(): "Dog barks"    │         │ + sound(): "Cat meows"    │
      └───────────────────────────┘         └───────────────────────────┘

```

---

## 4. Flow Diagram: Runtime Polymorphism Execution

The following flow sequence highlights exactly how Java evaluates object targets and overrides actions sequentially from program start to end.

```text
    [ START ]
        │
        ▼
   ┌────────────────────────────────────────┐
   │ Declare Parent Reference Variable      │  --> Animal a;
   └────────────────────────────────────────┘
        │
        ▼
   ┌────────────────────────────────────────┐
   │ Instantiate Subclass Object on Heap   │  --> a = new Dog();
   └────────────────────────────────────────┘
        │
        ▼
   ┌────────────────────────────────────────┐
   │ Invoke Overridden Method on Reference  │  --> a.sound();
   └────────────────────────────────────────┘
        │
        ▼
   ┌────────────────────────────────────────┐
   │ JVM Checks Actual Object Type on Heap  │  --> Detects "Dog" instance
   └────────────────────────────────────────┘
        │
        ▼
   ┌────────────────────────────────────────┐
   │ Executes Target Subclass Version       │  --> Prints "Dog barks"
   └────────────────────────────────────────┘
        │
        ▼
     [ END ]

```

---

## 5. Program 1: Polymorphism Demonstration

### Headline:

Executing Contextual Method Overriding via Dynamic Polymorphic Binding

### Definition of Each Method in the Scope:

* `Animal.sound()`: Parent fallback method defining default sounds.
* `Dog.sound()`: Specialized subclass method overriding parent sound with dog barks.
* `Cat.sound()`: Specialized subclass method overriding parent sound with cat meows.
* `main()`: Driver execution thread processing reference switching commands.

### Why This Program is Used:

* This code showcases how the exact same method execution command (`a.sound()`) modifies its output natively based on the type of instance assigned to `a`.

### How This Program Helps Java Learning:

* Bridges structural architectural diagrams directly to functional production code code blocks.
* Clarifies memory assignments on the heap vs. execution scopes on the stack.

#### Code Block:

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal a; // Parent reference type variable

        a = new Animal();
        a.sound(); // Executes base Animal logic

        a = new Dog();
        a.sound(); // Executes dynamic Dog logic at runtime

        a = new Cat();
        a.sound(); // Executes dynamic Cat logic at runtime
    }
}

```

#### Output:

```text
Animal makes a sound
Dog barks
Cat meows

```

#### Output Explanation:

* **First Execution Loop:** Reference points to a base `Animal` object; the base class implementation runs.
* **Second Execution Loop:** Reference points to a `Dog` subclass object; the overridden `Dog` code block executes.
* **Third Execution Loop:** Reference points to a `Cat` subclass object; the overridden `Cat` code block executes.

---

## 6. Document Application Metrics

> **Why These Diagrams Matter:** Visualizing dynamic structures helps engineers instantly track class hierarchies, trace variable pointer transformations, and simplify complex runtime memory swaps. These structural architecture layouts are ideal for professional documentation, repository readmes, technical white papers, and engineering slide decks.

---

## 7. Short Summary Note

A structural mapping diagram remains the single most efficient way to master how reference variables interact with diverse heap-allocated objects during modern Java programming execution.
