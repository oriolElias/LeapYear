package org.tdd;

import org.junit.jupiter.api.Test;




import static org.junit.jupiter.api.Assertions.*;

class YearTest {
    Year year;

    @Test
    void yearIsNotLeapYear(){
        year=new Year(1997);
        assertEquals(false,year.isLeapYear());
    }

    @Test
    void yearIsLeapYear(){
        year=new Year(1996);
        assertEquals(true,year.isLeapYear());
    }

    @Test
    void yearIsLeapYearDivisibleBy400(){
        year = new Year(1600);
        assertEquals(true,year.isLeapYear());
    }

    @Test
    void yearIsNotLeapYearIfNotDivisibleBy400(){
        year = new Year(1800);
        assertEquals(false,year.isLeapYear());
    }

}