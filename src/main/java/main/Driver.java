package main;

public class Driver {
    private String name;
    private String country;
    private int totalPoints;

    public Driver(String name, String country, int totalPoints) {
        this.name = name;
        this.country = country;
        this.totalPoints = totalPoints;
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

        // I think it's valid argument to have setters for all of the values, because a driver can change his/her name, points and country
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
