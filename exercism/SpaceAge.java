package pl.globallogic.exercism;

public class SpaceAge {

    private double seconds;
    private final int earthYearInSeconds = 31557600;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }
    double getSeconds() {
        return seconds;
    }
    double onEarth() {
        return (seconds / earthYearInSeconds);
    }
    double onMercury() {
        return seconds / (0.2408467 * earthYearInSeconds);
    }
    double onVenus() {
        return seconds / (0.61519726 * earthYearInSeconds);
    }
    double onMars() {
        return seconds / (1.8808158 * earthYearInSeconds);
    }
    double onJupiter() {
        return seconds / (11.862615 * earthYearInSeconds);
    }
    double onSaturn() {
        return seconds / (29.447498 * earthYearInSeconds);
    }
    double onUranus() {
        return seconds / (84.016846 * earthYearInSeconds);
    }
    double onNeptune() {
        return seconds / (164.79132 * earthYearInSeconds);
    }
}
