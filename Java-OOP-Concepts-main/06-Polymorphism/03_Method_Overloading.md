# Method Overloading in Java

## 1. Introduction to Method Overloading

Definition:

* Method overloading is a feature in Java that allows a class to have multiple methods with the same name but different parameters.
* It is one of the ways Java implements compile-time polymorphism.

Professional definition:

* Method overloading means defining several methods with the same name in the same class, where each method differs in the number, type, or order of parameters.

Why method overloading is important:

* It improves readability of code.
* It allows one method name to handle different kinds of data.
* It reduces the need for multiple different names for similar operations.
* It makes programs cleaner and easier to maintain.

How method overloading helps Java:

* It gives flexibility to developers.
* It allows the same operation to work with different inputs.
* It supports clean object-oriented programming design.

Real-world example:

* A printer can print text, print an integer, or print a decimal value.
* The action is the same, but the input format is different.

Important note:

* Method overloading is decided by the compiler.
* The compiler checks the method signature before the program runs.

---

## 2. Rules of Method Overloading

1. Methods must have the same name.
2. Methods must differ in parameter list.
3. Different number of parameters is allowed.
4. Different data types are allowed.
5. Different order of parameters is allowed.
6. Return type alone cannot be used to overload a method.

Example:

* add(int a, int b)
* add(double a, double b)
* add(int a, int b, int c)

---

## 3. Scenario 1: Overloading by Number of Parameters

### Headline:

Using the Same Method Name with Different Number of Arguments

Definition of this program:

* This program shows method overloading by defining multiple versions of the same method with different numbers of parameters.

Why this program is used:

* To explain how Java selects the correct method when the number of arguments differs.
* To understand how similar tasks can be written using one method name.

How this helps Java:

* It makes code shorter and easier to understand.
* It avoids creating unnecessary different method names.

Program 1: Method Overloading by Number of Parameters

Code with comments on every line:

```java
class MathHelper {                                            // Line 1: Declares class MathHelper
    int add(int a, int b) {                                   // Line 2: Declares add() with two integer parameters
        return a + b;                                         // Line 3: Returns the sum of two integers
    }                                                         // Line 4: Ends first add() method

    int add(int a, int b, int c) {                            // Line 5: Declares add() with three integer parameters
        return a + b + c;                                     // Line 6: Returns the sum of three integers
    }                                                         // Line 7: Ends second add() method
}

public class OverloadingDemo1 {                               // Line 8: Declares public class
    public static void main(String[] args) {                  // Line 9: Declares main method
        MathHelper helper = new MathHelper();                 // Line 10: Creates object of MathHelper

        System.out.println(helper.add(4, 5));                // Line 11: Calls add(int, int)
        System.out.println(helper.add(2, 3, 4));             // Line 12: Calls add(int, int, int)
    }                                                         // Line 13: Ends main method
}                                                             // Line 14: Ends class

```

Explanation of every line:

1. `class MathHelper {`
Declares a class named `MathHelper`.
2. `int add(int a, int b) {`
Declares a method named `add` that accepts two integers.
3. `return a + b;`
Returns the result of adding the two values.
4. `}`
Ends the first `add` method.
5. `int add(int a, int b, int c) {`
Declares another `add` method with three integer parameters.
6. `return a + b + c;`
Returns the sum of three values.
7. `}`
Ends the second `add` method.
8. `public class OverloadingDemo1 {`
Declares the main class.
9. `public static void main(String[] args) {`
Starts the main method.
10. `MathHelper helper = new MathHelper();`
Creates an object of `MathHelper`.
11. `System.out.println(helper.add(4, 5));`
Calls the two-argument version of `add`.
12. `System.out.println(helper.add(2, 3, 4));`
Calls the three-argument version of `add`.
13. `}`
Ends the main method.
14. `}`
Ends the class.

Pseudocode:
START
CREATE MathHelper class
DEFINE add(int, int)
DEFINE add(int, int, int)

```
CREATE helper object
CALL helper.add(4, 5)
CALL helper.add(2, 3, 4)

```

END

Output:
9
9

Summary:

* This program shows method overloading by number of parameters.
* Same method name used for different inputs.
* Java chooses the correct method based on the arguments provided.

---

## 4. Scenario 2: Overloading by Data Type of Parameters

### Headline:

Using the Same Method Name with Different Data Types

Definition of this program:

* This program demonstrates method overloading by defining methods with the same name but different parameter types.

Why this program is used:

* To show that Java can select the appropriate method based on argument type.
* To explain how the same method name can work with integers and decimal values.

How this helps Java:

* It improves flexibility and code readability.
* It allows the same logical task to be performed for multiple data types.

Program 2: Method Overloading by Data Type

Code with comments on every line:

```java
class Display {                                                // Line 1: Declares class Display
    void show(int value) {                                      // Line 2: Declares show() with int parameter
        System.out.println("Integer: " + value);              // Line 3: Prints integer output
    }                                                           // Line 4: Ends show(int)

    void show(double value) {                                   // Line 5: Declares show() with double parameter
        System.out.println("Double: " + value);               // Line 6: Prints double output
    }                                                           // Line 7: Ends show(double)
}

public class OverloadingDemo2 {                                 // Line 8: Declares public class
    public static void main(String[] args) {                    // Line 9: Declares main method
        Display obj = new Display();                           // Line 10: Creates Display object

        obj.show(10);                                           // Line 11: Calls show(int)
        obj.show(10.5);                                         // Line 12: Calls show(double)
    }                                                           // Line 13: Ends main method
}                                                               // Line 14: Ends class

```

Explanation of every line:

1. `class Display {`
Declares the class.
2. `void show(int value) {`
Declares `show` with an integer parameter.
3. `System.out.println("Integer: " + value);`
Prints the integer value.
4. `}`
Ends the integer version.
5. `void show(double value) {`
Declares `show` with a double parameter.
6. `System.out.println("Double: " + value);`
Prints the double value.
7. `}`
Ends the double version.
8. `public class OverloadingDemo2 {`
Declares the public class.
9. `public static void main(String[] args) {`
Declares the main method.
10. `Display obj = new Display();`
Creates `Display` object.
11. `obj.show(10);`
Calls integer version.
12. `obj.show(10.5);`
Calls double version.
13. `}`
Ends main method.
14. `}`
Ends class.

Pseudocode:
START
CREATE Display class
DEFINE show(int)
DEFINE show(double)

```
CREATE obj
CALL obj.show(10)
CALL obj.show(10.5)

```

END

Output:
Integer: 10
Double: 10.5

Summary:

* This example shows method overloading by data type.
* Java picks the correct method depending on the type of argument.

---

## 5. Scenario 3: Overloading by Parameter Order

### Headline:

Using the Same Method Name with Different Parameter Order

Definition of this program:

* This program demonstrates method overloading by changing the order of parameter types.

Why this program is used:

* To show that Java can distinguish methods by parameter sequence.
* To explain the importance of the exact method signature.

How this helps Java:

* It allows developers to design flexible methods for different argument arrangements.
* It reduces confusion while keeping code neat.

Program 3: Method Overloading by Parameter Order

Code with comments on every line:

```java
class Sample {                                                  // Line 1: Declares class Sample
    void display(int a, double b) {                              // Line 2: Declares display(int, double)
        System.out.println("int then double");                // Line 3: Prints first message
    }                                                           // Line 4: Ends first display()

    void display(double a, int b) {                              // Line 5: Declares display(double, int)
        System.out.println("double then int");                // Line 6: Prints second message
    }                                                           // Line 7: Ends second display()
}

public class OverloadingDemo3 {                                  // Line 8: Declares public class
    public static void main(String[] args) {                    // Line 9: Declares main method
        Sample obj = new Sample();                              // Line 10: Creates object

        obj.display(5, 2.5);                                    // Line 11: Calls display(int, double)
        obj.display(2.5, 5);                                    // Line 12: Calls display(double, int)
    }                                                           // Line 13: Ends main method
}                                                               // Line 14: Ends class

```

Explanation of every line:

1. `class Sample {`
Declares the class.
2. `void display(int a, double b) {`
Declares the first overloaded method.
3. `System.out.println("int then double");`
Prints the message for this signature.
4. `}`
Ends the first method.
5. `void display(double a, int b) {`
Declares the second overloaded method.
6. `System.out.println("double then int");`
Prints the message for this signature.
7. `}`
Ends the second method.
8. `public class OverloadingDemo3 {`
Declares the public class.
9. `public static void main(String[] args) {`
Starts execution.
10. `Sample obj = new Sample();`
Creates an object.
11. `obj.display(5, 2.5);`
Calls the first overloaded version.
12. `obj.display(2.5, 5);`
Calls the second overloaded version.
13. `}`
Ends main method.
14. `}`
Ends class.

Pseudocode:
START
CREATE Sample class
DEFINE display(int, double)
DEFINE display(double, int)

```
CREATE obj
CALL obj.display(5, 2.5)
CALL obj.display(2.5, 5)

```

END

Output:
int then double
double then int

Summary:

* This program shows method overloading by parameter order.
* The compiler recognizes the correct method signature.

---

## 6. Advantages of Method Overloading

* Improves code readability
* Reduces duplicate code
* Makes programs easier to understand
* Allows the same method name to handle multiple inputs
* Supports cleaner software design

---

## 7. Common Interview Questions

1. What is method overloading in Java?
2. What are the rules of method overloading?
3. Can the return type alone differentiate overloaded methods?
4. What is compile-time polymorphism?
5. Give an example of method overloading.

---

## 8. Final Conclusion

Method overloading is a powerful idea in Java that allows multiple methods with the same name to exist in the same class.
It helps developers write clean, flexible, and reusable code.
In simple words, method overloading means:

* same name
* different parameters
* different behavior based on input
