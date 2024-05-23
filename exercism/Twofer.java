package pl.globallogic.exercism;

public class Twofer {

    public String twofer(String name) {
        if (name == null) {
            name = "you";
        }
        return "One for " +name+ ", one for me.";
    }
}
