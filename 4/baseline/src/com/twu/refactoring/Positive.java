package com.twu.refactoring;

/**
 * Created by twer on 09/03/15.
 */
public class Positive implements Counter {
    @Override
    public boolean isMatched(int number) {
        return number >= 0;
    }
}
