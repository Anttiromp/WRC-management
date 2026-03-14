package main;

import java.util.HashMap;
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

    /**
     * Tässä haetaan avaimella kuskia ja sit palautetaan ne pisteet mitä sil oli
     * TODO muokkaa siten et jos ei löydy kuskia niin sit palautetaan DNF tai nolla
     */
    @Override
    public int getDriverPoints(Driver driver) {
        return this.raceResults.get(driver);
    }

}
