package com.exercise;

public class Ex18SharedDigit {

    public static boolean hasSharedDigit(int a, int b) {
        if ((a > 99) || ( a < 10) || (b > 99) || (b < 10)) {
            return false;
        }else {
            return ((a / 10 == b / 10) || (a / 10 == b % 10) || (b / 10 == a % 10) || (a % 10 == b % 10));
        }
    }
}
