package pl.globallogic.exercism;

import java.util.Arrays;

public class ResistorColorDuo {

    int value(String[] colors) {

        String sb = String.valueOf(colorCode(colors[0])) + colorCode(colors[1]);
        return Integer.parseInt(sb);
    }
    int colorCode(String color) {
        return Arrays.asList(colors()).indexOf(color);
    }
    String[] colors() {
        return new String[] {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    }
}
