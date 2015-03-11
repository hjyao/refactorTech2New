package com.twu.refactoring;

public class Taxi {
    private final int totalKms;
    private boolean isPeakTime;
    private int firstSectionPrice = 15;
    private int restSectionPrice = 12;
    private double peakMultiple = 1.2;

    public Taxi(int totalKms, boolean isPeakTime) {
        this.totalKms = totalKms;
        this.isPeakTime = isPeakTime;
    }

    public double sumPrice() {
        return sumBasicPrice(this.firstSectionPrice, this.restSectionPrice);
    }

    protected double sumBasicPrice(int firstSectionPrice, int restSectionPrice) {
        double totalCost = 0D;
        totalCost += Math.min(10, this.totalKms) * firstSectionPrice;
        totalCost += Math.max(0, this.totalKms - 10) * restSectionPrice;
        return isPeakTime ? totalCost * peakMultiple : totalCost;
    }

}
