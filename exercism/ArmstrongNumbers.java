package pl.globallogic.exercism;

public class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int modifiedNumberToCheck = numberToCheck;
        int[] digits = new int[String.valueOf(numberToCheck).length()];
        int counter = 0;
        int armstrongCheck = 0;

        while (modifiedNumberToCheck > 0) {
            digits[counter] = modifiedNumberToCheck % 10;
            modifiedNumberToCheck = modifiedNumberToCheck / 10;
            counter++;
        }
        for (int digit : digits) {
            armstrongCheck += (int) Math.pow(digit, String.valueOf(numberToCheck).length());
        }
        return numberToCheck == armstrongCheck;
    }
}
