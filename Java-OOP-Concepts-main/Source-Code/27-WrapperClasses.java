// Program: Wrapper Classes

// Main class
public class WrapperClasses {

    // Main method
    public static void main(String[] args) {

        // Primitive data type
        int number = 100;

        // Displaying primitive value
        System.out.println("Primitive Value : " + number);

        // -------------------- Boxing --------------------

        // Converting primitive to Wrapper object
        Integer boxedNumber = Integer.valueOf(number);

        // Displaying boxed object
        System.out.println("Boxing : " + boxedNumber);

        // -------------------- Unboxing --------------------

        // Converting Wrapper object to primitive
        int unboxedNumber = boxedNumber.intValue();

        // Displaying unboxed value
        System.out.println("Unboxing : " + unboxedNumber);

        // -------------------- Autoboxing --------------------

        // Automatic conversion from primitive to Wrapper object
        Integer autoBox = number;

        // Displaying autoboxed object
        System.out.println("Autoboxing : " + autoBox);

        // -------------------- Auto-unboxing --------------------

        // Automatic conversion from Wrapper object to primitive
        int autoUnbox = autoBox;

        // Displaying auto-unboxed value
        System.out.println("Auto-Unboxing : " + autoUnbox);

        // -------------------- Wrapper Utility Methods --------------------

        // Creating String value
        String value = "250";

        // Converting String to int
        int convertedNumber = Integer.parseInt(value);

        // Displaying converted integer
        System.out.println("String to Integer : " + convertedNumber);

        // Converting integer to String
        String stringValue = Integer.toString(number);

        // Displaying converted String
        System.out.println("Integer to String : " + stringValue);

        // Finding maximum value of Integer
        System.out.println("Integer Maximum Value : " + Integer.MAX_VALUE);

        // Finding minimum value of Integer
        System.out.println("Integer Minimum Value : " + Integer.MIN_VALUE);
    }
}
