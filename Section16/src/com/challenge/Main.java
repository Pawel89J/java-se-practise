package com.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Runnable runnable1 = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

        Function<String, String> everySecondChar = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };

        System.out.println(everySecondChar.apply("1234567890"));
        String result = everySecondCharacter(everySecondChar,"1234567890");
        System.out.println(result);

        Supplier<String> iLoveJava = () -> "I love Java!";
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);

        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );
        List<String> firstUpperCaseList = new ArrayList<>();
//        topNames2015.forEach(name ->
//                firstUpperCaseList.add(name.substring(0,1).toUpperCase()+name.substring(1)));
//        firstUpperCaseList.sort(String::compareTo);
//        firstUpperCaseList.forEach(System.out::println);

        topNames2015
                .stream()
                .map(name -> name.substring(0,1).toUpperCase()+name.substring(1))
                .sorted()
                .forEach(System.out::println);

        long namesBeginningWithA = topNames2015
                .stream()
                .map(name -> name.substring(0,1).toUpperCase()+name.substring(1))
                .filter(name -> name.startsWith("A"))
                .count();

        System.out.println("Number of names beginning with A is: " + namesBeginningWithA);

        topNames2015
                .stream()
                .map(name -> name.substring(0,1).toUpperCase()+name.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .collect(Collectors.toList());

    }

    public static String everySecondCharacter(Function<String,String> function, String source) {
        return function.apply(source);
    }
}
