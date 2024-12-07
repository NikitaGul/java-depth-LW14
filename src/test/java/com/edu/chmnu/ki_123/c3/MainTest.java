package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void numbWithThreeSimpleDigits(){
        int[] sentence = {345, 568, 324, 547, 246};

        int[] repl = Main.filterMaxDigitNumbers(sentence);

        assertEquals(repl.length, 5);
    }

    @Test
    void numbWithTwoSimpleTwoDigits(){
        int[] sentence = {34, 8, 32, 5, 4};

        int[] repl = Main.filterMaxDigitNumbers(sentence);

        assertEquals(repl.length, 2);
    }

    @Test
    void numbWithOneSimpleThreeDigits(){
        int[] sentence = {3, 82, 32, 536, 4};

        int[] repl = Main.filterMaxDigitNumbers(sentence);

        assertEquals(repl.length, 1);
    }

    @Test
    void wordsWithAllNegativeNumb(){
        String sentence = "String with all neg -12 -15 -3";

        String repl = Main.replaceNegativeNumber(sentence);

        assertEquals(repl, "String with all neg [] [] []");
    }

    @Test
    void wordsWithoutAllNegativeNumb(){
        String sentence = "Lists with positiv 1 2 3";

        String repl = Main.replaceNegativeNumber(sentence);

        assertEquals(repl, "Lists with positiv 1 2 3");
    }

}