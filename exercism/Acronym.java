package pl.globallogic.exercism;

public class Acronym {

    String acronymString = "";

    Acronym(String phrase) {
        for (String retval : phrase.split("[\\s-]+")) {
            retval = retval.replaceAll("[^a-zA-Z]", "");
            acronymString = acronymString.concat(String.valueOf(retval.charAt(0)).toUpperCase());
        }
    }
    String get() {
        return acronymString;
    }
}
