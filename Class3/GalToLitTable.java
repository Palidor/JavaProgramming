package Class3;

/*
    This program displays a conversion
    table of gallons to liters.

    liters = gallons * 3.7854

    Call this program "GalToLitTable.java".
*/
class GalToLitTable {
    public static void main(String args[]) {
        // Stand-alone for loop
        /*for(int gallons = 1; gallons <= 10; ++gallons) {
            double liters = gallons * 3.7854;
            System.out.println(String.format("%d gallons is %f is liters",
                                             gallons,
                                             liters));
        }*/

        /*System.out.println("====================================================");
        for(int gallons = 1; gallons <= 10; ++gallons) {
            System.out.println(String.format("\t%d gallons is %f is liters",
                                             gallons,
                                             gallonsToLiters(gallons)));
        }
        System.out.println("====================================================");*/

        // Call one function to do the magic!
        printGallonsToLitersTable(100);
    }

    private static double gallonsToLiters(final int gallons) {
        //double liters = gallons * 3.7854;
        //return liters;
        return gallons * 3.7854;
    }

    private static void printGallonsToLitersTable(final int maxGallons) {
        System.out.println("====================================================");
        for(int gallons = 1; gallons <= maxGallons; ++gallons) {
            System.out.println(String.format("\t%d gallons is %f is liters",
                                             gallons,
                                             gallonsToLiters(gallons)));
        }
        System.out.println("====================================================");
    }
}