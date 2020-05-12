public class VariableExamples {
    public static void main(String[] args) {
        int value1 = 10;
        int value2 = 20;
        int result = value1 + value2;

        // Prints each variable
        System.out.println(value1);
        System.out.println(value2);

        // Prints the result variable
        System.out.println(result);

        // Prints the additions of the variables inline
        System.out.println(value1 + value2);

        // Prints out the entire equation inefficiently.
        System.out.println("The result of " + value1 + " and " + value2 + " is " + result);

        // Prints out the entire equation efficiently.
        // NOTE:
        //   %s - String
        //   %f - float
        //   %b - boolean
        System.out.println(String.format("The result of %d and %d is %d.", value1, value2, result));

        // Addition
        System.out.println("Addition of 10 + 10 = " + (10 + 10));

        // Subtraction
        System.out.println("Subtraction of 10 - 10 = " + (10 - 10));

        // Multiplication
        System.out.println("Multiplication of 10 * 10 = " + (10 * 10));

        // Division
        System.out.println("Division of 10 / 10 = " + (10 / 10));

        // Division of int by an int - you get an int
        System.out.println("Division of 10 / 3 = " + (10 / 3));

        // Division of decimal by an int - you get an decimal
        System.out.println("Division of 10.0 / 3 = " + (10.0 / 3));
        System.out.println("Division of 10.0 / 3 = " + (10 / 3.0));

        System.out.println("2 gallons is this many liters: " + gallonsToLiters(2));

        // Two if's in a row
        if (5 > 2) {
            System.out.println("5 is greater than 2!");
        }
        if (5 < 2) {
            System.out.println("5 is less than 2!");
        }

        // If/else
        if (5 > 2) {
            System.out.println("5 is greater than 2!");
        } else {
            System.out.println("5 is NOT greater than 2!");
        }

        // If/else if/else
        if (1 > 2) {
            System.out.println("1 is greater than 2!");
        } else if (5 > 2) {
            System.out.println("5 is greater than 2!");
        } else {
            System.out.println("5 is NOT greater than 2!");
        }

        // If/else is/else with function call as a variable
        if (gallonsToLiters(1) < 3) {
            System.out.println("1 gallon is less than 3 liters");
        } else if (gallonsToLiters(2) > 3) {
            System.out.println("2 gallons is greater than 3 liters");
        } else {
            System.out.println("Nothing!");
        }

        // Logical Operators
        // <, <=, >, >=, == (equals), != (not equals)
        // && (and two logical operators)
        // || (or's two logical operators)

        System.out.println("Program finished!!");
    }

    public static float gallonsToLiters(float gallons) {
        return gallons * 3.7854f;
    }
}