package com.twu.refactoring;

/**
 * Created by twer on 11/03/15.
 */
public class ACTaxi extends Taxi {
    private int restSectionPrice = 17;
    private int firstSectionPrice = 20;

    public ACTaxi(int totalKms, boolean isPeakTime) {
        super(totalKms, isPeakTime);
    }

    @Override
    public double sumPrice() {
        return sumBasicPrice(this.firstSectionPrice, this.restSectionPrice);
    }
}
