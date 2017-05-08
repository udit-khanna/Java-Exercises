package executor;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import keywords.RaindropConverter;

public class TestNGSimpleTest {

	@DataProvider(name = "dataProvider")
	public static Object[][] data() {
        return new Object[][]{
        	// Non-primes
            {1, "1"},
            {52, "52"},
            {12121, "12121"},

            // Numbers with 3 as a prime factor
            {3, "Pling"},
            {6, "Pling"},
            {9, "Pling"},

            // Numbers with 5 as a prime factor
            {5, "Plang"},
            {10, "Plang"},
            {25, "Plang"},

            // Numbers with 7 as a prime factor
            {7, "Plong"},
            {14, "Plong"},
            {49, "Plong"},

            // Numbers with multiple activating prime factors
            {15, "PlingPlang"},
            {21, "PlingPlong"},
            {35, "PlangPlong"},
            {105, "PlingPlangPlong"},
        };
    }


	@Test(dataProvider = "dataProvider")
    public void test(int inputNumber, String outputFromRaindropConversion) {
        assertEquals(outputFromRaindropConversion, new RaindropConverter().convert(inputNumber));
    }
}