package Class10;

/**
 * Add a parameterized method that computes the
 * fueld required for a given distance.
 */
public class AddParameterMethodToVehicle {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        double gallons;
        int distance = 243;

        // Assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // Assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        gallons = minivan.fuelNeeded(distance);

        System.out.println("To go " + distance + " miles, minivan need " +
                gallons + " gallons of fuel.");

        gallons = sportscar.fuelNeeded(distance);

        System.out.println("To go " + distance + " miles, sportscar need " +
                gallons + " gallons of fuel.");
    }
}

class Vehicle {
    int passengers;     // number of passengers
    int fuelcap;        // fuel capacity in gallons
    int mpg;            // fuel consumption in miles per gallon

    // Returns the range.
    int range() {
        return this.fuelcap * this.mpg;
    }

    // Compute fuel needed for a given distance.
    double fuelNeeded(int miles) {
        return (double) miles / this.mpg;
    }
}