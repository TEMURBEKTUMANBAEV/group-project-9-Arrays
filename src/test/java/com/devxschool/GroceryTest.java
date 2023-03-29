package com.devxschool;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.Scanner;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;

public class GroceryTest {
    @Test
    public void createListTest1(){
        String list = "3\nwatermelon\ngrapes\nyogurt\n";
        Scanner scanner = new Scanner(list);
        String[] actual = Grocery.createList(scanner);

        assertThat(actual, CoreMatchers.notNullValue());
        assertThat("Shopping list items should be same",
                asList(actual), CoreMatchers.hasItems("watermelon", "grapes", "yogurt"));
    }

    @Test
    public void createListTest(){
        String list = "5\n1\n2\n3\n4\n5\n";
        Scanner scanner = new Scanner(list);
        String[] actual = Grocery.createList(scanner);

        assertThat(actual, CoreMatchers.notNullValue());
        assertThat("Shopping list items should be same",
                asList(actual), CoreMatchers.hasItems("1", "2", "3", "4", "5"));
    }
}
