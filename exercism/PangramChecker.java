package pl.globallogic.exercism;

public class PangramChecker {

    public boolean isPangram(String input) {

        String newInput = input.toLowerCase();

        for (int i = 0; i < 26; i++) {
            char c = (char) (i + 97);
            int intCheck = newInput.indexOf(c);

            if (intCheck == -1) {
                return false;
            }
        }
        return true;
    }
}
