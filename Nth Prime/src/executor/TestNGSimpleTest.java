package executor;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import keywords.PrimeCalculator;

public class TestNGSimpleTest {
	private PrimeCalculator primeCalculator;

    @BeforeMethod
    public void setup() {
        primeCalculator = new PrimeCalculator();
    }

    @Test
    public void testFirstPrime() {
        assertEquals(primeCalculator.nth(1), is(2));
    }

    
    @Test
    public void testSecondPrime() {
        assertEquals(primeCalculator.nth(2), is(3));
    }

    
    @Test
    public void testSixthPrime() {
        assertEquals(primeCalculator.nth(6), is(13));
    }

    
    @Test
    public void testBigPrime() {
        assertEquals(primeCalculator.nth(10001), is(104743));
    }


	@Test(expectedExceptions = IllegalArgumentException.class)
    public void testUndefinedPrime() {
        primeCalculator.nth(0);
    }
	
	private int is(int i) {		
		return i;
	}
}
