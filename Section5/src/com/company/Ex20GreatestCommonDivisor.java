package com.company;

public class Ex20GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int n1, int n2) {
        if (n1 < 10 || n2 < 10) {
            return -1;
        }
        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        return n2;
    }
}
