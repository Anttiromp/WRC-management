package main;

public abstract class Rallycar {

    protected String make;
    protected String model;
    protected int horsePower;

    public Rallycar(String make, String model, int horsePower) {
        this.make = make;
        this.model = model;
        this.horsePower = horsePower;
    }


    abstract double calculatePerformance();


}
