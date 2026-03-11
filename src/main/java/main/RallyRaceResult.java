package main;

import java.util.Map;

public class RallyRaceResult implements RaceResult {
    private String raceName;
    private String location;
    private Map<Driver, Integer> results;

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

}
