package main;

public class GravelCar extends RallyCar {

    public GravelCar(String make, String model, int horsePower) {
        super(make, model, horsePower);
    }

    @Override
    public double calculatePerformance() {
        // Keksitään tännekkin joku
        return 0.0;
    }

}
