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
        return "moi";
    }

    public static int getTotalRacesHeld() {
        return 1;
    }


    
    
}
