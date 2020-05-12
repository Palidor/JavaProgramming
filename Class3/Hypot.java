package Class3
        ;

/*
    Use the Pythagorean theorem to
    find the length of the hypotenuse
    given the lengths of the two opposing
    sides.

    hypotenuse = sqrt ( (x * x) + (y * y) )
*/
class Hypot {
    public static void main(String args[]) {
        printHypotenuseTable(10.0);
    }

    private static double calculateHypotenuse(final double x, final double y) {
        return Math.sqrt((x * x) + (y * y));
    }

    private static void printHypotenuseTable(final double maxSideLength) {
        System.out.println("====================================================");
        for(double sideLength = 1.0; sideLength <= maxSideLength; ++sideLength) {
            System.out.println(String.format("\t%f side has a hypotenuse of %f.",
                                     sideLength,
                                     calculateHypotenuse(sideLength, sideLength)));
        }
        System.out.println("====================================================");
    }
}