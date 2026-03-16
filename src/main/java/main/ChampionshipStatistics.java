package main;


import java.util.List;

public class ChampionshipStatistics {
        public static double calculateAveragePointsPerDriver(List<Driver> drivers) {
            if (drivers == null) {
                return 0.0;
            }
            int totalPoints = 0;
            for (Driver driver : drivers) {
                totalPoints += driver.getPoints();
            }
        return totalPoints/drivers.size();
    }

    public static String findMostSuccessfullCountry(List<Driver> drivers) {
        Driver driver = drivers.get(0);
        for (Driver d : drivers) {
            if (driver.getPoints() < d.getPoints()) {
                driver = d;
            }
        }
        return driver.getCountry();
    }

    public static int getTotalRacesHeld(List<RallyRaceResult> races) {
    if (races == null) {
        return 0;
    }
    return races.size();
}


}
