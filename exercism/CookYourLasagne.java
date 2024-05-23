package pl.globallogic.exercism;

public class CookYourLasagne {

    public int expectedMinutesInOven() {
        return 40;
    }
    public int remainingMinutesInOven(int minutesInOven) {
        return expectedMinutesInOven() - minutesInOven;
    }
    public int preparationTimeInMinutes(int numOfLayers) {
        return numOfLayers * 2;
    }
    public int totalTimeInMinutes(int numOfLayer, int minutesInOven) {
        return preparationTimeInMinutes(numOfLayer) + minutesInOven;
    }
}
