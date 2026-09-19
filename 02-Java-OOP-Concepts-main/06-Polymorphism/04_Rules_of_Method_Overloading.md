Rules of Method Overloading
===========================

1. Same method name
- All overloaded methods must have the same name.

2. Different parameter list
- The number of parameters can be different.
- The data types of parameters can be different.
- The order of parameter types can be different.

3. Return type alone is not enough
- Changing only the return type does not overload a method.

4. Compile-time polymorphism
- Java decides which method to call at compile time based on the arguments passed.

Example:
- add(int a, int b)
- add(double a, double b)
- add(int a, int b, int c)

Important note:
- The method signature (method name + parameter list) must be different.
- Method overloading improves readability and makes code easier to use.
