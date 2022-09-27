package org.tdd;

import org.junit.jupiter.api.Test;




import static org.junit.jupiter.api.Assertions.*;

class YearTest {
    Year year;

    @Test
    void yearIsNotLeapYear(){
        year=new Year(1997);
        assertEquals(year.isLeapYear(),false);
    }

}