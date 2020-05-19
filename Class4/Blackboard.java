package Class4;

public class Blackboard {
    public static void main(String args[]) {
        // Character:   8-bit (unsigned 16-bit)
        // This is ASCII characters!

        char myChar = 'X';
        System.out.println("This is myChar: " + myChar);

        // Boolean:     (google how man bits are a boolean in Java!)
        // Can be either true or false!
        boolean myBoolean = false; // or true

        // Literals!
        // Commonly referred to as constants.
        // Example: 100 is a literal
        //          15.4 is a literal
        //          '2' is a literal
        //          "This is a string!" is a literal
        //

        // Additional literals:
        // Hexadecimal: Values 0 - F (or 0 - 9, A, B, C, D, E, F)

        //  (binary)    0000 = 0x0 (hex)
        //              0001 = 0x1
        //              0010 = 0x2
        //              0011 = 0x3
        //              0100 = 0x4
        //              0101 = 0x5
        //              0110 = 0x6
        //              0111 = 0x7
        //              1000 = 0x8
        //              1001 = 0x9
        //              1010 = 0xA
        //              1011 = 0xB
        //              1100 = 0xC
        //              1101 = 0xD
        //              1110 = 0xE
        //              1111 = 0xF
        //
        // myChar = 90 - hex value is 0x5A. or 01011010
        //------------------------------------------------------

        // Octal: Value of 0 - 7
        //   (binary)   000 = 0
        //              001 = 1
        //              010 = 2
        //              011 = 3
        //              100 = 4
        //              101 = 5
        //              110 = 6
        //              111 = 7
        //------------------------------------------------------

        // Binary: Values of 0 - 1
        //  (binary)    0 = 0
        //              1 = 1

        // Character escape sequences!
        //
        //      \'      = single quote
        //      \"      = double quote
        //      \\      = backslash
        //      \r      = carriage return
        //      \n      = new line
        //      \f      = form feed
        //      \t      = horizontal tab
        //      \b      = backspace
        //      \ddd    = Octal constant (where ddd is an octal constant)
        //      \ uxxxx (no space!)  = Hexadecimal constant (where xxxx is a hexadecimal constant)
        System.out.println("This is a single quote: \'");
        System.out.println("This is a double quote: \"");
        System.out.println("This is a backslash: \\");
        System.out.println("This is a \r carriage return!");
        System.out.println("This is a \n new line!");
        System.out.println("This is a form feed: \f"); // Research this!
        System.out.println("This is a horizontal tab: \tTab is done!");
        System.out.println("This is a backspace:\b"); // Research this!
        System.out.println("This is a hex value: \u005A");
        System.out.println("This is a hex value: \165");

        char myTabDelimiter = '\t';
        System.out.println("This is a horizontal tab: " +
                            myTabDelimiter +
                            "NewTab is done!");

        int a, b = 8, c = 19, d; // b and c have initializations!
    }
}