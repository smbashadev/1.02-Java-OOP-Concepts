# Definition

This program demonstrates how to create multiple objects of the same class, assign different values to their instance variables, access their properties, and invoke their methods independently.

The example uses a Car class to show that each object maintains its own state while sharing the same behavior defined by the class.

Java Program with comments on each step

```java
// Main class of the program
public class CarApp {

    // Main method where program execution begins
    public static void main(String[] args) {

        // Step 1: Create first object of the Car class
        Car c1 = new Car();

        // Step 2: Assign values to first car's attributes
        c1.brand = "Maruthi";
        c1.color = "red";
        c1.price = 987654;

        // Step 3: Print first car details
        System.out.println("First Car Details:");
        System.out.println("Brand: " + c1.brand);
        System.out.println("Color: " + c1.color);
        System.out.println("Price: " + c1.price);

        // Step 4: Call the accelerate() method for first car
        c1.accelerate();

        // Step 5: Create second object of the Car class
        Car c2 = new Car();

        // Step 6: Assign values to second car's attributes
        c2.brand = "Audi";
        c2.color = "Blue";
        c2.price = 10646464;

        // Step 7: Print second car details
        System.out.println("\nSecond Car Details:");
        System.out.println("Brand: " + c2.brand);
        System.out.println("Color: " + c2.color);
        System.out.println("Price: " + c2.price);

        // Step 8: Call the accelerate() method for second car
        c2.accelerate();
    }
}

// Car class with instance variables and methods
class Car {

    // Step 9: Declare instance variables
    String brand;
    String color;
    double price;

    // Step 10: Method to show acceleration behavior
    public void accelerate() {
        System.out.println("The car is accelerating.");
    }
}

```

## Output:

First Car Details:
Brand: Maruthi
Color: red
Price: 987654.0
The car is accelerating.

Second Car Details:
Brand: Audi
Color: Blue
Price: 10646464.0
The car is accelerating.

## Explanation

### - `Car c1 = new Car();` creates the first object.

### - `Car c2 = new Car();` creates the second object.

### - `brand`, `color`, and `price` store the car details.

### - `accelerate()` prints the action of the car.

## Pseudocode

START
create object c1 of Car
set c1.brand = "Maruthi"
set c1.color = "red"
set c1.price = 987654
print c1 details
call c1.accelerate()

```
create object c2 of Car
set c2.brand = "Audi"
set c2.color = "Blue"
set c2.price = 10646464
print c2 details
call c2.accelerate()

```

END

## Code Explanation

### - `public class CarApp` is the main class.

### - `main()` is the starting point of the program.

### - `Car` is a user-defined class.

### - Instance variables store the object data.

### - Methods define object behavior.

## Important Points

### - Each object has its own copy of instance variables.

### - `double` is used for price values that may have decimals.

### - Methods are called using the object name.

## Summary

This program demonstrates how to create multiple objects of a class,
assign values to their fields, print them, and call methods.

```
