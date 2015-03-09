package com.twu.refactoring;

public class NumberCruncher {
    private final int[] numbers;

    public NumberCruncher(int... numbers) {
        this.numbers = numbers;
    }

    public int countEven() {
        return count(new Even());
    }

    public int countOdd() {
        return count(new Odd());
    }

    public int countPositive() {
        return count(new Positive());
    }

    public int countNegative() {
        return count(new Negative());
    }

    private int count(Counter counter) {
        int count = 0;
        for (int number : numbers) {
            if (counter.isMatched(number)) count++;
        }
        return count;
    }

}
