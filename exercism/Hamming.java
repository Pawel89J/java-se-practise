package pl.globallogic.exercism;

public class Hamming {

    private int hamDistance;

    public Hamming(String leftStrand, String rightStrand) {
        hamDistance = 0;
        validateInput(leftStrand, rightStrand);
        for (int i = 0; i < leftStrand.length(); i++) {
            if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
                hamDistance++;
            }
        }
    }
    public int getHammingDistance() {
        return hamDistance;
    }
    public void validateInput(String left, String right) {
        if (left.isEmpty() && !right.isEmpty()) {
            throw new IllegalArgumentException("strands must be of equal length");
        }
        if (right.isEmpty() && !left.isEmpty()) {
            throw new IllegalArgumentException("strands must be of equal length");
        }
        if (left.length() != right.length()) {
            throw new IllegalArgumentException("strands must be of equal length");
        }
    }
}
