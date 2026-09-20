# Inheritance Introduction in Java

## Definition

**Inheritance** is one of the core concepts of Object-Oriented Programming (OOP).  
It allows one class to acquire the properties and behaviors of another class.

### Why inheritance is important
- Promotes **code reusability**
- Reduces duplicate code
- Saves development time
- Makes code easier to maintain
- Helps build a clear class hierarchy

### How inheritance helps Java
- Lets a child class reuse code from a parent class
- Makes the program more organized
- Helps model real-world relationships like:
  - Animal → Dog
  - Vehicle → Car
  - Robot → FighterRobot

---

## Important Theory

### Parent class / Superclass
The class whose features are inherited.

### Child class / Subclass
The class that inherits from another class.

### Keyword used
Java uses the `extends` keyword for inheritance.

### Example syntax
```java
class Parent {
    // parent code
}

class Child extends Parent {
    // child code
}
```

### Important note
Inheritance helps when multiple classes share the same behavior.

---

# Scenario 1: Without Inheritance

## Headline
Demonstrating Code Duplication Without Inheritance

## Why this program is used
This program is used to show how the same methods are written repeatedly in multiple classes when inheritance is not used.

## How this helps Java
This helps learners understand:
- why duplicate code is a problem
- why inheritance is useful
- how reusability improves software design

---

## Program 1: Without Inheritance

### Corrected Code (with comments on every line)
```java
class FighterRobot {                                      // Line 1: Declares class FighterRobot
    public void move() {                                  // Line 2: Declares move() method
        System.out.println("Robot Moves Fast");           // Line 3: Prints move message
    }                                                     // Line 4: Ends move() method

    public void learn() {                                 // Line 5: Declares learn() method
        System.out.println("Robot self learns");          // Line 6: Prints learn message
    }                                                     // Line 7: Ends learn() method

    public void recharge() {                              // Line 8: Declares recharge() method
        System.out.println("Robot Plug to recharge");     // Line 9: Prints recharge message
    }                                                     // Line 10: Ends recharge() method

    public void interact() {                              // Line 11: Declares interact() method
        System.out.println("Robot Interacts");            // Line 12: Prints interact message
    }                                                     // Line 13: Ends interact() method

    public void fight() {                                 // Line 14: Declares fight() method
        System.out.println("Robot Fights");               // Line 15: Prints fight message
    }                                                     // Line 16: Ends fight() method
}                                                         // Line 17: Ends FighterRobot class


class PlayerRobot {                                       // Line 18: Declares class PlayerRobot
    public void move() {                                  // Line 19: Declares move() method
        System.out.println("Robot Moves Fast");           // Line 20: Prints move message
    }                                                     // Line 21: Ends move() method

    public void learn() {                                 // Line 22: Declares learn() method
        System.out.println("Robot self learns");          // Line 23: Prints learn message
    }                                                     // Line 24: Ends learn() method

    public void recharge() {                              // Line 25: Declares recharge() method
        System.out.println("Robot Plug to recharge");     // Line 26: Prints recharge message
    }                                                     // Line 27: Ends recharge() method

    public void interact() {                              // Line 28: Declares interact() method
        System.out.println("Robot Interacts");            // Line 29: Prints interact message
    }                                                     // Line 30: Ends interact() method

    public void fight() {                                 // Line 31: Declares fight() method
        System.out.println("Robot Fights");               // Line 32: Prints fight message
    }                                                     // Line 33: Ends fight() method
}                                                         // Line 34: Ends PlayerRobot class


class TeacherRobot {                                      // Line 35: Declares class TeacherRobot
    public void move() {                                  // Line 36: Declares move() method
        System.out.println("Robot Moves Fast");           // Line 37: Prints move message
    }                                                     // Line 38: Ends move() method

    public void learn() {                                 // Line 39: Declares learn() method
        System.out.println("Robot self learns");          // Line 40: Prints learn message
    }                                                     // Line 41: Ends learn() method

    public void recharge() {                              // Line 42: Declares recharge() method
        System.out.println("Robot Plug to recharge");     // Line 43: Prints recharge message
    }                                                     // Line 44: Ends recharge() method

    public void interact() {                              // Line 45: Declares interact() method
        System.out.println("Robot Interacts");            // Line 46: Prints interact message
    }                                                     // Line 47: Ends interact() method

    public void fight() {                                 // Line 48: Declares fight() method
        System.out.println("Robot Fights");               // Line 49: Prints fight message
    }                                                     // Line 50: Ends fight() method
}                                                         // Line 51: Ends TeacherRobot class


public class RoboApp {                                    // Line 52: Declares public class RoboApp
    public static void main(String[] args) {              // Line 53: Declares main method
        FighterRobot fr = new FighterRobot();            // Line 54: Creates object of FighterRobot
        System.out.println("Fighter Robot");              // Line 55: Prints label
        fr.move();                                        // Line 56: Calls move()
        fr.learn();                                       // Line 57: Calls learn()
        fr.recharge();                                    // Line 58: Calls recharge()
        fr.interact();                                    // Line 59: Calls interact()
        fr.fight();                                       // Line 60: Calls fight()

        System.out.println("-------------------------------------------"); // Line 61: Prints separator

        PlayerRobot pr = new PlayerRobot();              // Line 62: Creates object of PlayerRobot
        System.out.println("Player Robot");               // Line 63: Prints label
        pr.move();                                        // Line 64: Calls move()
        pr.learn();                                       // Line 65: Calls learn()
        pr.recharge();                                    // Line 66: Calls recharge()
        pr.interact();                                    // Line 67: Calls interact()
        pr.fight();                                       // Line 68: Calls fight()

        System.out.println("-------------------------------------------"); // Line 69: Prints separator

        TeacherRobot tr = new TeacherRobot();            // Line 70: Creates object of TeacherRobot
        System.out.println("Teacher Robot");              // Line 71: Prints label
        tr.move();                                        // Line 72: Calls move()
        tr.learn();                                       // Line 73: Calls learn()
        tr.recharge();                                    // Line 74: Calls recharge()
        tr.interact();                                    // Line 75: Calls interact()
        tr.fight();                                       // Line 76: Calls fight()

        System.out.println("-------------------------------------------"); // Line 77: Prints separator
    }                                                     // Line 78: Ends main method
}                                                         // Line 79: Ends RoboApp class
```

### Explanation of every line
1. `class FighterRobot {`  
   Declares the class for the fighter robot.

2. `public void move() {`  
   Declares the `move()` method.

3. `System.out.println("Robot Moves Fast");`  
   Prints the movement behavior.

4. `}`  
   Ends the `move()` method.

5. `public void learn() {`  
   Declares the `learn()` method.

6. `System.out.println("Robot self learns");`  
   Prints the learning behavior.

7. `}`  
   Ends the `learn()` method.

8. `public void recharge() {`  
   Declares the recharge behavior.

9. `System.out.println("Robot Plug to recharge");`  
   Prints the recharge message.

10. `}`  
   Ends recharge method.

11. `public void interact() {`  
   Declares the interaction method.

12. `System.out.println("Robot Interacts");`  
   Prints the interaction message.

13. `}`  
   Ends interact method.

14. `public void fight() {`  
   Declares the fight method.

15. `System.out.println("Robot Fights");`  
   Prints the fight message.

16. `}`  
   Ends fight method.

17. `}`  
   Ends FighterRobot class.

18. `class PlayerRobot {`  
   Declares PlayerRobot class.

19–33  
   Same logic as FighterRobot, but for PlayerRobot.

34. `}`  
   Ends PlayerRobot class.

35. `class TeacherRobot {`  
   Declares TeacherRobot class.

36–50  
   Same logic for TeacherRobot.

51. `}`  
   Ends TeacherRobot class.

52. `public class RoboApp {`  
   Declares main program class.

53. `public static void main(String[] args) {`  
   Starts program execution.

54. `FighterRobot fr = new FighterRobot();`  
   Creates object of FighterRobot.

55. `System.out.println("Fighter Robot");`  
   Prints robot type.

56–60  
   Calls all methods on FighterRobot.

61. Separator line.

62. `PlayerRobot pr = new PlayerRobot();`  
   Creates PlayerRobot object.

63. `System.out.println("Player Robot");`  
   Prints label.

64–68  
   Call methods on PlayerRobot.

69. Separator line.

70. `TeacherRobot tr = new TeacherRobot();`  
   Creates TeacherRobot object.

71. `System.out.println("Teacher Robot");`  
   Prints label.

72–76  
   Call methods on TeacherRobot.

77. Separator line.

78. `}`  
   Ends main method.

79. `}`  
   Ends RoboApp class.

### Output
```text
Fighter Robot
Robot Moves Fast
Robot self learns
Robot Plug to recharge
Robot Interacts
Robot Fights
-------------------------------------------
Player Robot
Robot Moves Fast
Robot self learns
Robot Plug to recharge
Robot Interacts
Robot Fights
-------------------------------------------
Teacher Robot
Robot Moves Fast
Robot self learns
Robot Plug to recharge
Robot Interacts
Robot Fights
-------------------------------------------
```

### Pseudocode
```text
START
    CREATE FighterRobot class
    DEFINE move(), learn(), recharge(), interact(), fight()

    CREATE PlayerRobot class
    DEFINE move(), learn(), recharge(), interact(), fight()

    CREATE TeacherRobot class
    DEFINE move(), learn(), recharge(), interact(), fight()

    CREATE main method
        CREATE FighterRobot object
        CALL all methods
        PRINT separator

        CREATE PlayerRobot object
        CALL all methods
        PRINT separator

        CREATE TeacherRobot object
        CALL all methods
        PRINT separator
END
```

### Summary
This program shows the problem of duplicate code.  
Each robot class writes the same methods separately, which is not efficient.

---

# Scenario 2: With Inheritance

## Headline
Using Inheritance to Reuse Common Behavior

## Why this program is used
This program is used to show how common methods can be written once in a parent class and reused by multiple child classes.

## How this helps Java
This helps learners understand:
- how inheritance reduces repetition
- how the `extends` keyword works
- why inheritance improves maintainability

---

## Program 2: With Inheritance

### Corrected Code (with comments on every line)
```java
class Robot {                                               // Line 1: Declares base class Robot
    public void move() {                                    // Line 2: Declares move() method
        System.out.println("Robot Moves Fast");             // Line 3: Prints move message
    }                                                       // Line 4: Ends move() method

    public void learn() {                                   // Line 5: Declares learn() method
        System.out.println("Robot self learns");            // Line 6: Prints learn message
    }                                                       // Line 7: Ends learn() method

    public void recharge() {                                // Line 8: Declares recharge() method
        System.out.println("Robot Plug to recharge");       // Line 9: Prints recharge message
    }                                                       // Line 10: Ends recharge() method

    public void interact() {                                // Line 11: Declares interact() method
        System.out.println("Robot Interacts");              // Line 12: Prints interact message
    }                                                       // Line 13: Ends interact() method

    public void fight() {                                   // Line 14: Declares fight() method
        System.out.println("Robot Fights");                 // Line 15: Prints fight message
    }                                                       // Line 16: Ends fight() method
}                                                           // Line 17: Ends Robot class


class FighterRobot extends Robot {                          // Line 18: Declares FighterRobot inheriting Robot
}                                                           // Line 19: Ends FighterRobot class


class PlayerRobot extends Robot {                            // Line 20: Declares PlayerRobot inheriting Robot
}                                                           // Line 21: Ends PlayerRobot class


class TeacherRobot extends Robot {                           // Line 22: Declares TeacherRobot inheriting Robot
}                                                           // Line 23: Ends TeacherRobot class


public class RoboApps {                                     // Line 24: Declares public class RoboApps
    public static void main(String[] args) {                // Line 25: Declares main method
        FighterRobot fr = new FighterRobot();              // Line 26: Creates FighterRobot object
        System.out.println("Fighter Robot");                // Line 27: Prints label
        fr.move();                                          // Line 28: Calls inherited move()
        fr.learn();                                         // Line 29: Calls inherited learn()
        fr.recharge();                                      // Line 30: Calls inherited recharge()
        fr.interact();                                      // Line 31: Calls inherited interact()
        fr.fight();                                         // Line 32: Calls inherited fight()

        System.out.println("-------------------------------------------"); // Line 33: Prints separator

        PlayerRobot pr = new PlayerRobot();                // Line 34: Creates PlayerRobot object
        System.out.println("Player Robot");                 // Line 35: Prints label
        pr.move();                                          // Line 36: Calls inherited move()
        pr.learn();                                         // Line 37: Calls inherited learn()
        pr.recharge();                                      // Line 38: Calls inherited recharge()
        pr.interact();                                      // Line 39: Calls inherited interact()
        pr.fight();                                         // Line 40: Calls inherited fight()

        System.out.println("-------------------------------------------"); // Line 41: Prints separator

        TeacherRobot tr = new TeacherRobot();              // Line 42: Creates TeacherRobot object
        System.out.println("Teacher Robot");                // Line 43: Prints label
        tr.move();                                          // Line 44: Calls inherited move()
        tr.learn();                                         // Line 45: Calls inherited learn()
        tr.recharge();                                      // Line 46: Calls inherited recharge()
        tr.interact();                                      // Line 47: Calls inherited interact()
        tr.fight();                                         // Line 48: Calls inherited fight()

        System.out.println("-------------------------------------------"); // Line 49: Prints separator
    }                                                       // Line 50: Ends main method
}                                                           // Line 51: Ends RoboApps class
```

### Explanation of every line
1. `class Robot {`  
   Declares the parent class.

2. `public void move() {`  
   Declares move method.

3. `System.out.println("Robot Moves Fast");`  
   Prints move message.

4. `}`  
   Ends move method.

5. `public void learn() {`  
   Declares learn method.

6. `System.out.println("Robot self learns");`  
   Prints learning behavior.

7. `}`  
   Ends learn method.

8. `public void recharge() {`  
   Declares recharge method.

9. `System.out.println("Robot Plug to recharge");`  
   Prints recharge message.

10. `}`  
   Ends recharge method.

11. `public void interact() {`  
   Declares interact method.

12. `System.out.println("Robot Interacts");`  
   Prints interaction message.

13. `}`  
   Ends interact method.

14. `public void fight() {`  
   Declares fight method.

15. `System.out.println("Robot Fights");`  
   Prints fight message.

16. `}`  
   Ends fight method.

17. `}`  
   Ends Robot class.

18. `class FighterRobot extends Robot {`  
   Child class inherits Robot.

19. `}`  
   Ends FighterRobot class.

20. `class PlayerRobot extends Robot {`  
   Another child class.

21. `}`  
   Ends PlayerRobot class.

22. `class TeacherRobot extends Robot {`  
   Another child class.

23. `}`  
   Ends TeacherRobot class.

24. `public class RoboApps {`  
   Main class starts.

25. `public static void main(String[] args) {`  
   Main method starts.

26. `FighterRobot fr = new FighterRobot();`  
   Creates FighterRobot object.

27. `System.out.println("Fighter Robot");`  
   Prints label.

28–32  
   Calls inherited methods.

33. Separator.

34. `PlayerRobot pr = new PlayerRobot();`  
   Creates PlayerRobot object.

35. `System.out.println("Player Robot");`  
   Prints label.

36–40  
   Calls inherited methods.

41. Separator.

42. `TeacherRobot tr = new TeacherRobot();`  
   Creates TeacherRobot object.

43. `System.out.println("Teacher Robot");`  
   Prints label.

44–48  
   Calls inherited methods.

49. Separator.

50. `}`  
   Ends main method.

51. `}`  
   Ends RoboApps class.

### Output
```text
Fighter Robot
Robot Moves Fast
Robot self learns
Robot Plug to recharge
Robot Interacts
Robot Fights
-------------------------------------------
Player Robot
Robot Moves Fast
Robot self learns
Robot Plug to recharge
Robot Interacts
Robot Fights
-------------------------------------------
Teacher Robot
Robot Moves Fast
Robot self learns
Robot Plug to recharge
Robot Interacts
Robot Fights
-------------------------------------------
```

### Pseudocode
```text
START
    CREATE class Robot
    DEFINE move(), learn(), recharge(), interact(), fight()

    CREATE class FighterRobot extends Robot
    CREATE class PlayerRobot extends Robot
    CREATE class TeacherRobot extends Robot

    CREATE main method
        CREATE FighterRobot object
        CALL inherited methods
        PRINT separator

        CREATE PlayerRobot object
        CALL inherited methods
        PRINT separator

        CREATE TeacherRobot object
        CALL inherited methods
        PRINT separator
END
```

### Summary
This program demonstrates inheritance clearly.  
The child classes reuse the same code from the parent class instead of writing it again.

---

# Final Professional Summary

## Definition
Inheritance is a way in which one class can use the features of another class.

## Benefits
- Reuses code
- Avoids duplication
- Saves time
- Makes programs easier to maintain

## Key point
> Inheritance allows a child class to inherit behavior from a parent class using the `extends` keyword.

---

# One-Line Revision Note

```text
Inheritance is the OOP concept that allows one class to reuse the features of another class.
```

---

