package com.company;

public class Ex21FactorPrinter {

public static void printFactors(int number) {
    if (number < 1) {
        System.out.println("Invalid Value");
        return;
    }
    int i = 1;
    while (i <= number) {
        if (number % i == 0){
            System.out.print(i + " ");
        }
        i++;
    }
}
}
