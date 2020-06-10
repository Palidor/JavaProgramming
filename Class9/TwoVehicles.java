package Class9;

/**
 * The class declares an object of type Vehicle.
 */
public class TwoVehicles {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle(); // Remember! minivan and sportcar refer
                                           // to two separate objects

        int range1, range2;

        // assign values to fields in the minivans
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // assign values to fields in the sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        // compute the range, assuming a full tank of gas
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println("Minivan can carry " + minivan.passengers +
                " with a range of " + range1);
        System.out.println("Sportscar can carry " + sportscar.passengers +
                " with a range of " + range2);
    }
}

class Vehicle {
    int passengers;     // number of passengers
    int fuelcap;        // fuel capacity in gallons
    int mpg;            // fuel consumption in miles per gallon
}