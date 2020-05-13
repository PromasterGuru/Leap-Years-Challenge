/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyear;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 *
 * @author promasterguru
 */
public class LeapYearTest {
    LeapYear instance = new LeapYear();
    
    /**
     * Test of all years divisible by 400 ARE leap years 
     * e.g 2000
     */
    @Test
    public void testWithYearsDivisibleBy400(){
        int year = 2000;
        boolean expResult = true;
        boolean result = instance.isLeapYear(year);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of all years divisible by 100 but not by 400 are NOT leap years
     * e.g  1700, 1800, and 1900
     */
    @Test
    public void testWithYearsDivisibleBy100ButNotBy400(){
        int year = 2000;
        boolean expResult = false;
        boolean result = instance.isLeapYear(year);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of years divisible by 4 but not by 100 ARE leap years 
     * e.g 2008, 2012, 2016,
     */
    @Test
    public void testWithYearsDivisibleBy4ButNotBy100() {
        int year = 2008;
        boolean expResult = true;
        boolean result = instance.isLeapYear(year);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of years not divisible by 4 are NOT leap years 
     * e.g. 2017, 2018, 2019.
     */
    @Test
    public void testWithYearsNotDivisibleBy() {
        int year = 2017;
        boolean expResult = false;
        boolean result = instance.isLeapYear(year);
        assertEquals(expResult, result);
    }
}
