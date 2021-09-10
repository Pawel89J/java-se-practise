public class TeenNumberChecker {

    static public boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {
        return isTeen(firstNumber) || isTeen(secondNumber) || isTeen(thirdNumber);
    }
    public static boolean isTeen(int firstNumber) {
        return (firstNumber >= 13 && firstNumber <= 19);
    }
}
