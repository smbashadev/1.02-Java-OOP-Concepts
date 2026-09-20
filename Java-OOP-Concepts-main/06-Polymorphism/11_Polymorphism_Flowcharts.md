# Polymorphism Flowcharts in Java

## 1. Definition

* **Primary Definition:** A flowchart is a step-by-step visual representation of a program's execution logic and decision paths. For polymorphism, flowcharts illustrate exactly how the Java compiler and the JVM select the correct method implementation from multiple available forms.
* **One-Line Definition:** Polymorphism flowcharts turn complex execution routing rules into a clean, scannable step-by-step process map.

---

## 2. Compile-Time vs. Runtime Flowcharts

### Flowchart A: Compile-Time Polymorphism Routing (Static Binding)

Tracks how the compiler evaluates method signatures at compile time before any objects are instantiated.

```text
       [ START ]
           │
           ▼
   ┌────────────────────────────────┐
   │  User calls a specific method  │  --> e.g., math.add(5, 10)
   └────────────────────────────────┘
           │
           ▼
   ┌────────────────────────────────┐
   │  Compiler checks arguments and │  --> Matches parameter counts, types,
   │       method signature         │      and ordering rules exactly
   └────────────────────────────────┘
           │
           ▼
   ┌────────────────────────────────┐
   │ Compiler binds call to the     │  --> Static binding decision
   │ correct overloaded method definition
   └────────────────────────────────┘
           │
           ▼
   ┌────────────────────────────────┐
   │ Program executes chosen method │
   └────────────────────────────────┘
           │
           ▼
        [ END ]

```

---

### Flowchart B: Runtime Polymorphism Resolution (Dynamic Binding)

Tracks how the JVM inspects the heap memory at runtime to execute the correct overridden method.

```text
       [ START ]
           │
           ▼
   ┌────────────────────────────────┐
   │ Create Parent Class Reference  │  --> Animal a;
   │       Variable on Stack        │
   └────────────────────────────────┘
           │
           ▼
   ┌────────────────────────────────┐
   │   Assign a Subclass Object     │  --> a = new Dog();
   │         to the Heap            │
   └────────────────────────────────┘
           │
           ▼
   ┌────────────────────────────────┐
   │  Call Overridden Method via    │  --> a.sound();
   │        Parent Reference        │
   └────────────────────────────────┘
           │
           ▼
   ┌────────────────────────────────┐
   │  JVM Checks Actual Object Type │  --> Resolves concrete type residing
   │      on Heap at Runtime        │      on the heap memory space
   └────────────────────────────────┘
           │
           ▼
   ┌────────────────────────────────┐
   │  Executes Subclass Overridden  │  --> Triggers Dog-specific code
   │            Method              │
   └────────────────────────────────┘
           │
           ▼
        [ END ]

```

---

## 3. Decision-Based Architecture Flowcharts

### Concept 1: Method Overloading Signature Parsing

Illustrates how the exact parameter configurations split execution into independent methods.

```text
             [ START ]
                 │
                 ▼
          ┌─────────────┐
          │ Call add()  │
          └─────────────┘
                 │
                 ▼
      /─────────────────────\
     <  Check Argument Type  >
      \─────────────────────/
         /       │       \
        /        │        \
  [2 Integers] [2 Doubles] [3 Integers]
      /          │          \
     ▼           ▼           ▼
┌───────────┐ ┌─────────────┐ ┌───────────────┐
│  Execute  │ │   Execute   │ │    Execute    │
│add(int,int│ │add(double,d)│ │add(int,int,int│
└───────────┘ └─────────────┘ └───────────────┘
     \           │           /
      \          │          /
       ──────►[ END ]◄──────

```

---

### Concept 2: Method Overriding Timeline

Tracks how an explicit modification in a child class supersedes structural parent declarations.

```text
       [ START ]
           │
           ▼
   ┌────────────────────────────────┐
   │ Parent Class defines a method  │  --> Base capability configuration
   └────────────────────────────────┘
           │
           ▼
   ┌────────────────────────────────┐
   │ Child Class re-declares identical│ --> Matches name, parameters,
   │       method signature         │      and return profiles explicitly
   └────────────────────────────────┘
           │
           ▼
   ┌────────────────────────────────┐
   │ Subclass method overrides basic│ --> Overrides baseline definition
   │      parent implementation     │
   └────────────────────────────────┘
           │
           ▼
   ┌────────────────────────────────┐
   │ Subclass object instantiation  │  --> Allocated on heap
   └────────────────────────────────┘
           │
           ▼
   ┌────────────────────────────────┐
   │      Method call triggered     │
   └────────────────────────────────┘
           │
           ▼
   ┌────────────────────────────────┐
   │ Specific Child implementation   │  --> Tailored action occurs
   │          executed              │
   └────────────────────────────────┘
           │
           ▼
        [ END ]

```

---

### Concept 3: Dynamic Method Dispatch Execution Pipeline

A chronological view of a single reference variable switching its execution context continuously.

```text
       [ START ]
           │
           ▼
   ┌────────────────────────────────┐
   │  Declare Animal reference 'a'  │
   └────────────────────────────────┘
           │
           ▼
   ┌────────────────────────────────┐
   │     Assign Animal instance     │ ──► a.sound() ──► Runs Animal.sound()
   └────────────────────────────────┘
           │
           ▼
   ┌────────────────────────────────┐
   │       Assign Dog instance      │ ──► a.sound() ──► Runs Dog.sound()
   └────────────────────────────────┘
           │
           ▼
   ┌────────────────────────────────┐
   │       Assign Cat instance      │ ──► a.sound() ──► Runs Cat.sound()
   └────────────────────────────────┘
           │
           ▼
        [ END ]

```

---

## 4. Program 1: Flowchart Evaluation Playground

### Headline:

Verifying Sequential Object Target Allocation and Dynamic Execution Realignment

### Definition of Each Method in the Scope:

* `Animal.sound()`: Core fallback method.
* `Dog.sound()`: Overridden alternative for dog barking behaviors.
* `Cat.sound()`: Overridden alternative for cat meowing behaviors.
* `main()`: Instantiation engine processing parent reference data assignment pipelines.

### Why This Program is Used:

* It serves as a playground to match text code directly against execution flowcharts, clarifying variable data adjustments.

### How This Program Helps Java Learning:

* Provides clear evidence of how Java updates behavior based on heap layout shifts.
* Helps developers retain and master OOP concepts for complex technical interviews.

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

public class PolymorphismFlowchartDemo {
    public static void main(String[] args) {
        Animal a; // Stack declaration allocation

        a = new Animal(); // Assigns Animal object instance
        a.sound();        // Triggers parent action path

        a = new Dog();    // Assigns Dog object instance
        a.sound();        // Triggers overridden child path 1

        a = new Cat();    // Assigns Cat object instance
        a.sound();        // Triggers overridden child path 2
    }
}

```

#### Output:

```text
Animal makes a sound
Dog barks
Cat meows

```

#### Output Processing Analysis:

* `a = new Animal()` references point to base blocks, outputting base strings.
* `a = new Dog()` switches pointers, causing the JVM to bypass parent logic and execute the overridden `Dog` version.
* `a = new Cat()` shifts pointers again, resolving to the overridden `Cat` version.

---

## 5. Document Application Metrics

> **Why Flowcharts are Essential:** Flowcharts reduce code abstraction by framing execution loops visually. They clarify execution order, map branching points, and simplify review cycles during study sessions, corporate onboarding, and clean code optimization workflows.

---

## 6. Short Summary Note

A flowchart converts a multi-tiered object-oriented hierarchy into a clear, scannable, step-by-step sequential blueprint that is easy to follow.
