package smallest.multiple;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Wilczewski
 */
public class SmallestMultipleTest {
    
    /**
     * Test of smallestMultiple method, of class SmallestMultiple.
     */
    @Test
    public void testSmallestMultiple() {
        System.out.println("smallestMultiple");
        int upperLimit = 10;
        int expResult = 2520;
        int result = SmallestMultiple.smallestMultiple(upperLimit);
        assertEquals(expResult, result);
    }

    /**
     * Test of highestPrime method, of class SmallestMultiple.
     */
    @Test
    public void testHighestPrime() {
        System.out.println("highestPrime");
        short maxNum = 100;
        short expResult = 97;
        short result = SmallestMultiple.highestPrime(maxNum);
        assertEquals(expResult, result);
    }    

    /**
     * Test of isPrime method, of class SmallestMultiple.
     */
    @Test
    public void testIsPrime() {
        System.out.println("isPrime");
        int x = 164;
        boolean expResult = false;
        boolean result = SmallestMultiple.isPrime(x);
        assertEquals(expResult, result);
    }

    /**
     * Test of canBeDivided method, of class SmallestMultiple.
     */
    @Test
    public void testCanBeDivided() {
        System.out.println("canBeDivided");
        int x = 40320;
        int highestFactor = 8; 
        boolean expResult = true;
        boolean result = SmallestMultiple.canBeDivided(x, highestFactor);
        assertEquals(expResult, result);
    }
}
