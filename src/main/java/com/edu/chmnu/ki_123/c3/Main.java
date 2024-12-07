package com.edu.chmnu.ki_123.c3;

import java.util.Arrays;

public class Main {

    public static int[] filterMaxDigitNumbers(int[] numbers) {
        int maxDigits = Arrays.stream(numbers)
                .map(num -> String.valueOf(Math.abs(num)).length())
                .max()
                .orElse(0);

        return Arrays.stream(numbers)
                .filter(num -> String.valueOf(Math.abs(num)).length() == maxDigits)
                .toArray();
    }

    public static String replaceNegativeNumber(String phrases){
        phrases = phrases.replaceAll("-\\d+", "\\[\\]");
        return phrases;
    }

    public static void main(String[] args) {

        int[] numb = {234, 2356, 233, 2346, 123};

        int[] resNumb = filterMaxDigitNumbers(numb);
        System.out.println(Arrays.toString(resNumb));

        String sentence3 = "String -7 5 6 -67 34 -35";
        String negativeNumbersReplacRounds = replaceNegativeNumber(sentence3);
        System.out.println(sentence3);
        System.out.println(negativeNumbersReplacRounds);

    }
}