package executable;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import keywords.Scrabble;

public class TestNGSimpleTest {

	@DataProvider(name = "dataProvider")
	public static Object[][] data() {
        return new Object[][]{
                {"", 0},
                {" \t\n", 0},
                {null, 0},
                {"a", 1},
                {"f", 4},
                {"street", 6},
                {"quirky", 22},
                {"OXYPHENBUTAZONE", 41},
                {"alacrity", 13},
        };
    }


	@Test(dataProvider = "dataProvider")
	public void test(String scrabbleInput, int scrabbleScore) {
		Scrabble scrabble = new Scrabble(scrabbleInput);

		assertEquals(scrabbleScore, scrabble.getScore());
	}
}
