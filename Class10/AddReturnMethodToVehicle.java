package Class10;

/**
 * Add a method that returns a value to the Vehicle class.
 */
public class AddReturnMethodToVehicle {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        // Assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        // Get the ranges
        range1 = minivan.range();
        range2 = minivan.range();

        System.out.println("Minivan can carry " + minivan.passengers + " with a range" +
                " of " + range1 + ". ");

        System.out.println("Sportscar can carry " + sportscar.passengers + " with a range" +
                " of " + range2 + ". ");
    }
}

class Vehicle {
    int passengers;     // number of passengers
    int fuelcap;        // fuel capacity in gallons
    int mpg;            // fuel consumption in miles per gallon

    int range() {
        // NOTE: This is more code
        // int range = this.fuelcap * this.mpg;
        // return range;

        // Let's do this instead!
        return this.fuelcap * this.mpg;
    }
}