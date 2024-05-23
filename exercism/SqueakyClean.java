package pl.globallogic.exercism;


public class SqueakyClean {

    static String clean(String identifier) {
        identifier = identifier.replace(" ", "_");
        identifier = identifier.replace("4", "a");
        identifier = identifier.replace("8", "o");
        identifier = identifier.replace("3", "e");
        identifier = identifier.replace("1", "l");
        identifier = identifier.replace("7", "t");
        identifier = identifier.replace("0", "o");

        StringBuilder sb = new StringBuilder();
        boolean isCap = false;
        for (String s: identifier.split("")) {
            if (s.equals("-")) {
                isCap = true;
            } else if (s.matches("[a-zA-Z_]?")) {
                if (isCap) {
                    isCap = false;
                    sb.append(s.toUpperCase());
                } else {
                    sb.append(s);
                }
            }
        }
        return sb.toString();
    }
}
