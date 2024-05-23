package pl.globallogic.exercism;

import java.util.Arrays;

public class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWek() {
        return birdsPerDay;
    }
    public int getToday() {
        if (birdsPerDay.length < 1) return 0;
        return birdsPerDay[birdsPerDay.length - 1];
    }
    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }
    public boolean hasDayWithoutBirds() {
        return Arrays.stream(birdsPerDay).filter(value -> value > 0)
                .count() != 7;
    }
    public int getCountForFirstDays(int numberOfDays) {
        return Arrays.stream(birdsPerDay)
                .limit(numberOfDays)
                .sum();
    }
    public int getBusyDays() {
        return (int) Arrays.stream(birdsPerDay)
                .filter(value -> value >= 5)
                .count();
    }
}
