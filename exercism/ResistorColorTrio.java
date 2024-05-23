package pl.globallogic.exercism;

import java.util.Arrays;
import java.util.List;

public class ResistorColorTrio {

    private List<String> COLORS = Arrays.asList
            ("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white");

    String label(String[] colors) {

        int baseValue = COLORS.indexOf(colors[0]) * 10 + COLORS.indexOf(colors[1]);
        int zeroCount = COLORS.indexOf(colors[2]);
        long value = baseValue * (long) Math.pow(10, zeroCount);

        if (value < 1000) {
            return String.format("%d ohms", value);
        } else if (value < 1000000) {
            return String.format("%d kiloohms", value / 1000);
        }else if (value < 1000000000) {
            return String.format("%d megaohms", value / 1000000);
        }else if (value < 1000000000000L) {
            return String.format("%d gigaohms", value / 1000000000);
        }
        return "Value is too large";
    }
}
