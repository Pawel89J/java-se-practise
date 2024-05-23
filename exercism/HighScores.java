package pl.globallogic.exercism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HighScores {

    List<Integer> highScores;

    public HighScores(List<Integer> highScores) {
        this.highScores = highScores;
    }
    List<Integer> scores() {
        return this.highScores;
    }
    Integer latest() {
        return highScores.getLast();
    }
    Integer personalBest() {
        List<Integer> sortedScores = new ArrayList<>(highScores);
        Collections.sort(sortedScores);
        return sortedScores.getLast();
    }
    List<Integer> personalTopThree() {
        List<Integer> sortedScores = new ArrayList<>(highScores);
        Collections.sort(sortedScores);
        List<Integer> topThree = new ArrayList<>();

        if (sortedScores.size() > 3) {
            for (int i = sortedScores.size() - 1; i > sortedScores.size() - 4; i--) {
                topThree.add(sortedScores.get(i));
            }
        } else {
            Comparator cmp = Collections.reverseOrder();
            sortedScores.sort(cmp);
            return sortedScores;
        }
        return topThree;
    }
}
