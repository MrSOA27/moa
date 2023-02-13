
package moa.Newfunction;

import org.junit.Test;

import moa.Newfunction.PrimeNumberDetector;

import static org.junit.Assert.*;

public class PrimeNumberDetectorTest {
    @Test
    public void testIsPrime() {
        PrimeNumberDetector detector = new PrimeNumberDetector();
        assertTrue(detector.isPrime(2));
        assertTrue(detector.isPrime(3));
        assertFalse(detector.isPrime(4));
        assertTrue(detector.isPrime(5));
        assertFalse(detector.isPrime(6));
    }
}
