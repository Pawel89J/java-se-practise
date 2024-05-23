package pl.globallogic.exercism;

public class ReverseString {

    String reverse(String inputString) {
        StringBuilder stringBuilder = new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
