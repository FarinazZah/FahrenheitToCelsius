public class FahrenheitToCelsiusNOTES_L1_L2 { // identifier, can contain letters, digits, _, and $,but can't start w digit

    public static void main(String[] args) { // Main method, typically, we have to call methods
        //example from L2, Fahrenheit to celsius converter
        int saturdayFahrenheit = 78; // intializing int variable, setting it to 78
        int sundayFahrenheit = 81;
        double saturdayCelsius = (5.0/9) * (saturdayFahrenheit-32); // Could have also done (5D/9), to interpret 5 as a double
        // not as an integer
        double sundayCelsius = (5.0/9) * (sundayFahrenheit -32);
        System.out.println("Weekend Averages");
        System.out.println("Saturday:" + saturdayCelsius);
        System.out.println("Sunday:" + sundayCelsius);
    }
}
//L1, L2, & L3 Notes
// Variable is a place in memory that stores some value
// Variable name always starts with lower case and written in camel case
// define type before we define the variable name
// byte --> 8 bits
// short --> 16 bits
// primitive types, built into java (byte, short, int, & long)
//Most basic type
// byte short int long (integer type)
// float double (real number types) char boolean
// int --> 32 bits
// long --> 64 bits --> -(2^64) --> 2^63
// Literal = constant --> specific value of some type
// 5.0/9 --> prevents us from getting inaccurate answer, if we use integers, (5),
// we won't get the decimal answer
// A house contains so many things, fridge, AC, toilet, microwave, firealarm
// If a garage door opens, a garage light turns on
// This is what object-oriented programming is. Attributes represent state,
// Behavior - what actions they can perform
// Stove can be a different brand, can be gas or electric, it can be varying amounts of heat
// Class blueprint of objects
// Variables are the attributes and methods are the behavior: like with cars, vars would be color, make, model, year
// methods would be startEngine, brake, accelerate
// Typically start variables with lowercase, but can be uppercase
// Short stores a lower value than byte
// WhiteSpace Notes: Represents blank, tabs, and newline characters
// Error Notes: Compiler (syntax errors), runtime (program quits) and logical (mistake in semantics)
// Syntax: each programming language has rules you need to follow in your code
// Semantics: meaning of our statement
// boolean headToPark = saturdayFahrenheit > 69 ? true : false;
// CODE THAT IS SYNTACTICALLY CORRECT IS NOT ALWAYS SEMNATICALLY CORRECT.
/*
block comment (probably useful for right now)
- If we want to assign a constant value to a variable, and prevent any change to that variable
  we must do final <type> = value
- This just doesn't let you reassign the value
- A variable's scope is the part of the program that we can call the variable in
- One method cannot see the variables declared in another method
- A variable's scope is within the closest set of curly braces
- Double is default value of a floating point number
- can overwrite it by doing float var1 = 7777889.777F
- Do the same for Long
- Java uses a superset of ASCII
- Chars are enclosed in single quotes
- what if we wanted to represent a single quote?
- \' --> backslash is interpreted as ', to officially make it '\''
- \t --> tab (whitespace)
- \n --> new line (whitespace)
- \r --> carriage return (white space)
- \\ --> backslash (when we want an actual backslash
- \" --> double quote (for string literals)
- Division:
    - 9/2 = 4--> no rounding, it is truncated
- Promotion: changing one data type to another
- Assignment conversion: int average = 4; double gpa = average; --> just changing GPA to be 4.0
- what if order was switched? You can go from int to double but not double to int with this method
- Alternative method: Casting -->
    - (target type) placed in front of value we want to convert
    - (double)5/9 --> tells 5 to act like a double
    - Cast operator has highest precedence except for ()
    - but (double)(5/9) gives us 0.0

 */
/**
 * javadoc comment formatting required for assignments
 */
