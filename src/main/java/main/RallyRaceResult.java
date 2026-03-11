package main;

import java.util.ArrayList;
import java.util.List;
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

    @Override
    public void recordResult(Driver driver, int position, int points) {
        // Tässä metodissa siis, järjestetäänkö kuskit ensin pisteiden mukaan suuruusjärjestykseen, ja sen jälkeen laiteta
        // LAitetaan ne tuonne results mappiin, hämää koska siinä on vaan Driver ja Integer
        // VAI
        // Onko resultissa vain Kuskit ja niitten totalpisteet
    }

    @Override
    public int getDriverPoints(Driver driver) {
        // Ei toimi tavanomainen looppi tässä, katoppas youtubesta oli se video miten pysty semi iisisti noutamaan sen avaimen
        return 1;
    }

    @Override
    public List<Driver> getResults() {
        // Varmaan vaan joku yksinkertainen tulosta lista tjsp tähän
        return new ArrayList<>();
    }

}
