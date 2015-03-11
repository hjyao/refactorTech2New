package com.twu.refactoring;

public class Receipt {
    private final Taxi taxi;

    public Receipt(Taxi taxi) {
        this.taxi = taxi;
    }

    public double totalCost() {
        double totalCost = 0;
        totalCost += 50;
        totalCost += taxi.sumPrice();
        return totalCost * (1 + 0.1);
    }
}
