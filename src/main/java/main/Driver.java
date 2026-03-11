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

    public void setName(String name) {
        this.name = name;
    } 
    public void setCountry(String country) {
        this.country = country;
    }
    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public void addPoints(int points) {
        this.totalPoints += points;
    }

}
