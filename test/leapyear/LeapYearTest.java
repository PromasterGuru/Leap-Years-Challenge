/***************************************************
 *              LEAP YEARS
 * This short and simple Kata should be performed in 
 * pairs using Test Driven Development (TDD).
 *              
 *              ACCEPTANCE CRITERIA
 * All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year),
 * All years divisible by 100 but not by 400 are NOT leap years 
 * (so, for example, 1700, 1800, and 1900 were NOT leap years, NOR will 2100 be a leap year),
 * All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 2016),
 * All years not divisible by 4 are NOT leap years (e.g. 2017, 2018, 2019).
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
        int year = 1900;
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
        int year = 2016;
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
        int year = 2019;
        boolean expResult = false;
        boolean result = instance.isLeapYear(year);
        assertEquals(expResult, result);
    }
}
