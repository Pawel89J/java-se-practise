package pl.globallogic.exercism;

public class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder sb = new StringBuilder(dnaStrand.length());

        for (int i = 0; i < dnaStrand.length(); i++) {
            if (dnaStrand.charAt(i) == 'G') {
                sb.append("C");
            } else if (dnaStrand.charAt(i) == 'C') {
                sb.append("G");
            } else if (dnaStrand.charAt(i) == 'T') {
                sb.append("A");
            } else if (dnaStrand.charAt(i) == 'A') {
                sb.append("U");
            }
        }
        return sb.toString();
    }
}
