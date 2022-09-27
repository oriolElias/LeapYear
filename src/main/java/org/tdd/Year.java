package org.tdd;

public class Year {

    private final int year;

    public Year(int year){
        this.year=year;
    }
    public Boolean isLeapYear() {
        return year%4==0;
    }
}
