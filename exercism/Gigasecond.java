package pl.globallogic.exercism;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {

    private LocalDateTime date;

    public Gigasecond(LocalDate moment) {
        date = moment.atStartOfDay();
    }
    public Gigasecond(LocalDateTime moment) {
        date = moment;
    }
    public LocalDateTime getDateTime() {
        return date.plusSeconds((long) 1E9);
    }
}
