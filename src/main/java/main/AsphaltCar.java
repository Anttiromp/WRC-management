package main;

public class AsphaltCar extends RallyCar {

    public AsphaltCar(String make, String model, int horsePower) {
        super(make, model, horsePower);
    }

    @Override
    public double calculatePerformance() {
        // Tähän pitää keksiä joku hieno laskelma miten se voitaisiin toteuttaa
        return 0.0;
    }

}
