package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class RallyRaceResult implements RaceResult {
    private String raceName;
    private String location;
    private Map<Driver, Integer> raceResults = new HashMap<>();

    public RallyRaceResult (String raceName, String location) {
        this.raceName = raceName;
        this.location = location;
    }

    public String getRaceName() {
        return this.raceName;
    }
    public String getLocation() {
        return this.location;
    }


    @Override
    public void recordResult(Driver driver, int position, int points) {
        driver.addPoints(points);
        raceResults.put(driver, points);
    }


    @Override
    public int getDriverPoints(Driver driver) {
        return this.raceResults.get(driver);
    }

    @Override
    public List<Driver> getResults() {
        return new ArrayList<Driver>(raceResults.keySet());
    }


}
