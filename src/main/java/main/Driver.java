package main;

public class Driver {
    private String name;
    private String country;
    private int totalPoints;
    private RallyCar car;

    public Driver(String name, String country, RallyCar car) {
        this.name = name;
        this.country = country;
        this.car = car;
        this.totalPoints = 0;
    }

    public String getName() {
        return this.name;
    }
    public String getCountry() {
        return this.country;
    }

    public int getTotalPoints() {
        return this.totalPoints;
    }

    public RallyCar getCar() {
        return this.car;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCar(RallyCar car) {
        this.car = car;
    }
    
    public void addPoints(int racePoints) {
        this.totalPoints += racePoints;
    }

}
