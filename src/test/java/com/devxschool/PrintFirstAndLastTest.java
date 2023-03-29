package com.devxschool;

import com.devxschool.PrintFirstAndLast;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class PrintFirstAndLastTest {
    @Test
    public void printLettersTest1() {
        String[] words = {"hello", "why", "by", "apple", "note"};

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        PrintFirstAndLast.printLetters(words);
        assertEquals("Printing first and last letters of the following: " +
                        "\"hello\", \"why\", \"by\" + \"apple\", \"note\"",
                "ho wy by ae ne ",
                out.toString());
    }

    @Test
    public void printLettersTest2() {
        String[] words = {"a", "b", "c", "d", "e", "aa", "bb", "cc", "dd", "ee"};

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        PrintFirstAndLast.printLetters(words);
        assertEquals("Printing first and last letters of the following: " +
                        "\"a\", \"b\", \"c\", \"d\", \"e\", \"aa\", \"bb\", \"cc\", \"dd\", \"ee\"",
                "aa bb cc dd ee aa bb cc dd ee ",
                out.toString());
    }
}
