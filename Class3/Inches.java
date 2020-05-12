package Class3;

/*
    Compute the number of cubic inches
    in 1 cubic mile.
*/
class Inches {
    public static void main(String args[]) {
        long foot = 12;                         // 1 foot = 12 inches
        long mile = 5280 * foot;               // 1 mile = 5,280 feet
        long cubicInches = mile * mile * mile;  // cubic = mile * mile * mile (mile ^3)
        System.out.println(String.format("There are %d cubic inches in a cubic mile.",
                                         cubicInches));
    }
}