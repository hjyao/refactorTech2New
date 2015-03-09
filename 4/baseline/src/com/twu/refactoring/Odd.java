package com.twu.refactoring;

/**
 * Created by twer on 09/03/15.
 */
public class Odd implements Counter {
    @Override
    public boolean isMatched(int number) {
        return number % 2 == 1;
    }
}
