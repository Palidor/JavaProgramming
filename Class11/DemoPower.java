package Class11;

public class DemoPower {
    public static void main(String args[]) {
        Power x = new Power(4.0, 2);
        Power y = new Power(2.5, 1);
        Power z = new Power(5.7, 0);

        System.out.println(x.b + " raise to the " + x.e + " power is " + x.getPower());
        System.out.println(y.b + " raise to the " + y.e + " power is " + y.getPower());
        System.out.println(z.b + " raise to the " + z.e + " power is " + z.getPower());
    }
}

public class Power {
    double b;
    int e;
    double val;

    public Power(double base, int exponent) {
        this.b = base;
        this.e = exponent;

        this.val = 1;
        if (exponent == 0) {
            return;
        }

        for(; exponent > 0; exponent--) {
            this.val = this.val * this.b;
        }
    }

    public double getPower() {
        return this.val;
    }
}