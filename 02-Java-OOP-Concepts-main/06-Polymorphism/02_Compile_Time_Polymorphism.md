# Compile-Time Polymorphism in Java

## 1. Introduction to Compile-Time Polymorphism

Definition:

* Compile-time polymorphism is a type of polymorphism in which the method to be executed is decided during compilation time.
* It is also known as static polymorphism.
* The most common way to achieve compile-time polymorphism in Java is method overloading.

Professional definition:

* Compile-time polymorphism allows the same method name to perform different tasks based on the number, order, or type of arguments passed to it.
* Since the compiler identifies the correct method before the program runs, this type of polymorphism is called compile-time polymorphism.

Why compile-time polymorphism is important:

* It improves code readability.
* It reduces duplicate method names for similar operations.
* It allows one method name to handle different inputs.
* It makes code clean, organized, and easier to use.

How compile-time polymorphism helps Java:

* It lets Java developers write flexible methods.
* It makes code reusable for multiple situations.
* It helps the compiler detect correct method calls earlier.
* It improves performance because method resolution happens early.

Real-world example:

* A single action like "add" can add two integers, three integers, or two decimal numbers.
* The same method name is used, but the behavior changes based on the arguments.

Important note:

* Compile-time polymorphism is achieved mainly by method overloading.
* Method overloading happens in the same class.

---

## 2. What is Method Overloading?

Definition:

* Method overloading means creating multiple methods in the same class with the same name but different parameters.

Rules of method overloading:

* Same method name
* Different number of parameters, or
* Different types of parameters, or
* Different order of parameters

Important point:

* Return type alone cannot be used to overload a method.

Example:

* add(int, int)
* add(int, int, int)
* add(double, double)

---

## 3. Scenario 1: Overloading by Number of Parameters

### Headline:

Overloading Methods by Different Number of Arguments

Definition of this program:

* This program demonstrates compile-time polymorphism by using the same method name with different numbers of parameters.

Why this program is used:

* To show that Java can choose the correct method based on how many arguments are passed.
* To understand how method overloading improves code simplicity.

How this helps Java:

* It allows developers to write methods that perform similar tasks with different input sizes.
* It avoids creating different method names for the same type of operation.

Program 1: Method Overloading by Number of Parameters

Code with comments on every line:

```java
class Calculator {                                           // Line 1: Declares class Calculator
    int add(int a, int b) {                                  // Line 2: Declares add() with two integer parameters
        return a + b;                                        // Line 3: Returns the sum of a and b
    }                                                        // Line 4: Ends first add() method

    int add(int a, int b, int c) {                           // Line 5: Declares add() with three integer parameters
        return a + b + c;                                    // Line 6: Returns sum of a, b, and c
    }                                                        // Line 7: Ends second add() method
}

public class CompileTimeDemo1 {                               // Line 8: Declares the public class
    public static void main(String[] args) {                  // Line 9: Declares main method
        Calculator calc = new Calculator();                   // Line 10: Creates Calculator object

        System.out.println(calc.add(5, 3));                  // Line 11: Calls add(int, int)
        System.out.println(calc.add(5, 3, 2));               // Line 12: Calls add(int, int, int)
    }                                                          // Line 13: Ends main method
}                                                              // Line 14: Ends class

```

Explanation of every line:

1. `class Calculator {`
Declares a class named `Calculator`.
2. `int add(int a, int b) {`
Declares a method named `add` that takes two integers.
3. `return a + b;`
Returns the sum of the two values.
4. `}`
Ends the first `add` method.
5. `int add(int a, int b, int c) {`
Declares another `add` method with three integer parameters.
6. `return a + b + c;`
Returns the sum of three values.
7. `}`
Ends the second `add` method.
8. `public class CompileTimeDemo1 {`
Declares the class that contains the program.
9. `public static void main(String[] args) {`
Starts the main method.
10. `Calculator calc = new Calculator();`
Creates an object of `Calculator`.
11. `System.out.println(calc.add(5, 3));`
Calls the two-parameter version of `add`.
12. `System.out.println(calc.add(5, 3, 2));`
Calls the three-parameter version of `add`.
13. `}`
Ends main method.
14. `}`
Ends the class.

Pseudocode:
START
CREATE Calculator class
DEFINE add(int, int)
DEFINE add(int, int, int)

```
CREATE object calc
CALL add(5, 3)
CALL add(5, 3, 2)

```

END

Output:
8
10

Summary:

* This program shows compile-time polymorphism.
* The same method name `add` works with different numbers of arguments.
* Java chooses the correct method during compilation.

---

## 4. Scenario 2: Overloading by Data Type of Parameters

### Headline:

Overloading Methods by Different Parameter Types

Definition of this program:

* This program demonstrates compile-time polymorphism by using multiple methods with the same name but different parameter data types.

Why this program is used:

* To show that Java can choose the correct overloaded method based on argument type.
* To explain how one method name can handle integers and floating-point values.

How this helps Java:

* It allows code to remain simple while supporting different kinds of data.
* It improves consistency and readability.

Program 2: Method Overloading by Data Type

Code with comments on every line:

```java
class PrintDemo {                                            // Line 1: Declares class PrintDemo
    void show(int x) {                                       // Line 2: Declares show() with int parameter
        System.out.println("Integer value: " + x);           // Line 3: Prints integer number
    }                                                         // Line 4: Ends show(int)

    void show(double x) {                                    // Line 5: Declares show() with double parameter
        System.out.println("Double value: " + x);            // Line 6: Prints double number
    }                                                         // Line 7: Ends show(double)
}

public class CompileTimeDemo2 {                               // Line 8: Declares public class
    public static void main(String[] args) {                  // Line 9: Declares main method
        PrintDemo obj = new PrintDemo();                     // Line 10: Creates object of PrintDemo

        obj.show(10);                                        // Line 11: Calls show(int)
        obj.show(10.5);                                      // Line 12: Calls show(double)
    }                                                         // Line 13: Ends main method
}                                                              // Line 14: Ends class

```

Explanation of every line:

1. `class PrintDemo {`
Declares the class.
2. `void show(int x) {`
Declares `show` for integer input.
3. `System.out.println("Integer value: " + x);`
Prints the integer value.
4. `}`
Ends the integer version.
5. `void show(double x) {`
Declares `show` for double input.
6. `System.out.println("Double value: " + x);`
Prints the double value.
7. `}`
Ends the double version.
8. `public class CompileTimeDemo2 {`
Declares the main class.
9. `public static void main(String[] args) {`
Main method starts.
10. `PrintDemo obj = new PrintDemo();`
Creates object.
11. `obj.show(10);`
Calls the integer version.
12. `obj.show(10.5);`
Calls the double version.
13. `}`
Ends main method.
14. `}`
Ends the class.

Pseudocode:
START
CREATE PrintDemo class
DEFINE show(int)
DEFINE show(double)

```
CREATE obj
CALL show(10)
CALL show(10.5)

```

END

Output:
Integer value: 10
Double value: 10.5

Summary:

* This program shows compile-time polymorphism by data type.
* Java chooses the correct method based on argument type.

---

## 5. Scenario 3: Overloading by Order of Parameters

### Headline:

Overloading Methods by Parameter Order

Definition of this program:

* This program demonstrates compile-time polymorphism by changing the order of parameter types.

Why this program is used:

* To show that Java can differentiate methods when the parameter order is different.
* To explain how overloaded methods can handle multiple input patterns.

How this helps Java:

* It helps in writing flexible methods for different input combinations.
* It makes API design easier and cleaner.

Program 3: Method Overloading by Parameter Order

Code with comments on every line:

```java
class Test {                                                  // Line 1: Declares class Test
    void display(int a, double b) {                           // Line 2: Declares display with int and double
        System.out.println("int then double");               // Line 3: Prints message
    }                                                         // Line 4: Ends first display()

    void display(double a, int b) {                           // Line 5: Declares display with double and int
        System.out.println("double then int");               // Line 6: Prints message
    }                                                         // Line 7: Ends second display()
}

public class CompileTimeDemo3 {                                // Line 8: Declares public class
    public static void main(String[] args) {                   // Line 9: Declares main method
        Test obj = new Test();                                // Line 10: Creates Test object

        obj.display(5, 2.5);                                   // Line 11: Calls display(int, double)
        obj.display(2.5, 5);                                   // Line 12: Calls display(double, int)
    }                                                         // Line 13: Ends main method
}                                                              // Line 14: Ends class

```

Explanation of every line:

1. `class Test {`
Declares the class.
2. `void display(int a, double b) {`
Declares first overloaded method.
3. `System.out.println("int then double");`
Prints message.
4. `}`
Ends first method.
5. `void display(double a, int b) {`
Declares second overloaded method.
6. `System.out.println("double then int");`
Prints message.
7. `}`
Ends second method.
8. `public class CompileTimeDemo3 {`
Declares class.
9. `public static void main(String[] args) {`
Starts main method.
10. `Test obj = new Test();`
Creates object.
11. `obj.display(5, 2.5);`
Calls the first overloaded method.
12. `obj.display(2.5, 5);`
Calls the second overloaded method.
13. `}`
Ends main method.
14. `}`
Ends class.

Pseudocode:
START
CREATE Test class
DEFINE display(int, double)
DEFINE display(double, int)

```
CREATE obj
CALL display(5, 2.5)
CALL display(2.5, 5)

```

END

Output:
int then double
double then int

Summary:

* This program shows compile-time polymorphism by parameter order.
* Java decides the correct method before the program runs.

---

## 6. Difference Between Compile-Time and Runtime Polymorphism

Compile-Time Polymorphism:

* Achieved by method overloading
* Decision is made at compile time
* Faster method resolution
* Example: add(int, int), add(double, double)

Runtime Polymorphism:

* Achieved by method overriding
* Decision is made at runtime
* Example: parent reference pointing to child object

---

## 7. Advantages of Compile-Time Polymorphism

* Improves readability
* Makes code simpler
* Reduces method naming confusion
* Helps developers write flexible programs
* Increases code reusability

---

## 8. Important Interview Questions

1. What is compile-time polymorphism?
2. What is method overloading?
3. How is compile-time polymorphism different from runtime polymorphism?
4. Can return type alone be used for overloading?
5. Why is compile-time polymorphism called static polymorphism?

---

## 9. Final Conclusion

Compile-time polymorphism is one of the most important features of Java.
It allows one method name to perform different tasks based on the arguments passed.
This is mainly achieved through method overloading.

In simple words:

* the compiler decides which method to call before the program runs.
* this makes Java programs more flexible and efficient.
