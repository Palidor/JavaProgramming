package Class5;

public class Blackboard {
    public static void main(String args[]) {
        // Operator - a symbol that tells compiler to perform
        // a specific mathematical or logical manipulation on data

        // Arithmetic Operators
        //      +       Addition
        //      -       Subtraction
        //      *       Multiplication
        //      /       Division
        //      %       Modulus
        //      ++      Increment
        //      --      Decrement

        // Increment
        // x = x + 1;
        // x++; postfix
        // ++x; prefix

        // Decrement
        // x = x - 1;
        // x--; postfix
        // --x; prefix

        // Prefix example
        int x = 10;
        int y = ++x;
        System.out.println("prefix for y is: " + y);

        // Postfix example
        x = 10;
        y = x++;
        System.out.println("postfix for y is: " + y);
        System.out.println("x is: " + x);

        // Relational Operators
        //      ==      Equal to
        //      !=      Not equal to
        //      >       Greater than
        //      <       Less than
        //      >=      Greater than or equal to
        //      <=      Less than or equal to

        // Logical Operators
        //      &       AND
        //      |       OR
        //      ^       XOR (exclusive OR)
        //      ||      Short-circuit OR
        //      &&      Short-circuit AND
        //      !       NOT

        // p        q       p & q       p | q       p ^ q       !p
        //-------------------------------------------------------------
        // False    False   False       False       False       True
        // True     False   False       True        True        False
        // False    True    False       True        True        True
        // True     True    True        True        False       False
        //
        // Note: ^ means true if the value is true in one operand
        //       but not both.

        // Short-circuit operators
        //
        // Only evaluated when necessary, whereas normal logical operators
        // are always evaluated.

        // Assignment operator
        // x = y;
        // x = 5;
        // x = y = z = 5;

        // Short-hand Assignments
        //
        // Format: <variable> <operator> = <expression
        // Ex: int x;
        //     x += 10 is the same as x = x + 10
        //     x *= 10 is the same as x = x * 10
        //     etc.!
        //--------------------------------------------
        //  +=      -=      *=      /=
        //--------------------------------------------
        //  %=      &=      |=      ^=
        //--------------------------------------------

        // Type Converstion
        //
        // This is automatic if the following is true:
        //      - two types are compatible
        //      - destination type is larger than the source type
        //  This causes a "widening conversion"
        //  Ex. int > byte

        // Casting Incompatible Types
        //
        // Format: (target-type) expression
        // Ex: double x, y;
        //     int z = (int) (x / y)

        // Operator Precedence (PEMDAS of Programming!)
        //------------------------------------------------------------------------------------------------------------
        // Highest
        //------------------------------------------------------------------------------------------------------------
        //  ++ (postfix)    -- (postfix)
        //  ++ (prefix)     -- (prefix)     (type-cast)
        //  *               /               %
        //  +               -
        //  >               >=              <       <=
        //  ==              !=
        //  &
        //  ^
        //  |
        //  &&
        //  ||
        //  =               <operation> = (or, short-hand)
        //------------------------------------------------------------------------------------------------------------
        // Lowest
        //--------------------------------------------

        // Type Conversion in Expressions
        //
        // Evaluated in this order:
        //      If different types of data are mixed, they are are coverted to the same type
        //      Ex: char, byte, and short are promoted to an int behind the scenes
        //      If one operand if a long, the whole expression is promoted to a long
        //      If one operand is a float, the whole expression is promoted to a float
        //      If one operand is a double, the whole expression is promoted to a double
        //
        // Promotions only occur within the expression. They still end up the type of the variable
        //    a.k.a. behind the scenes before variable assignment occurs!
        // E.g. Even if the promotion creates an int in the expression, the value will
        //     still be a byte if the variable byte
        //
        // Example: char ch1, ch2, chFinal;
        //          chFinal = (char) (ch1 + ch2); // ch1 + ch2 results in an int!
    }
}