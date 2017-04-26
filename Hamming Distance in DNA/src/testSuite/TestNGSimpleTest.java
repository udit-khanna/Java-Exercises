package testSuite;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import keywords.Hamming;

public class TestNGSimpleTest {
	Hamming hamming = new Hamming();


//	@Rule
//    public ExpectedException thrown = ExpectedException.none();
    
    @Test
    public void testNoDifferenceBetweenIdenticalStrands() {
        assertEquals(new Hamming("A", "A").getHammingDistance(), hamming.is(0));
    }

    
    @Test
    public void testHammingDistanceForSingleNucleotideStrand() {
        assertEquals(new Hamming("A", "G").getHammingDistance(), hamming.is(1));
    }

    
    @Test
    public void testHammingDistanceForSmallStrand() {
        assertEquals(new Hamming("AG", "CT").getHammingDistance(), hamming.is(2));
    }

    
    @Test
    public void testSmallHammingDistance() {
        assertEquals(new Hamming("AT", "CT").getHammingDistance(), hamming.is(1));
    }

    
    @Test
    public void testSmallHammingDistanceInLongerStrand() {
        assertEquals(new Hamming("GGACG", "GGTCG").getHammingDistance(), hamming.is(1));
    }

    
    @Test( expectedExceptions = { IllegalArgumentException.class } )
    public void testValidatesFirstStrandNotLonger() {
        new Hamming("AAAG", "AAA");
    }

    
    @Test( expectedExceptions = { IllegalArgumentException.class } )
    public void testValidatesOtherStrandNotLonger() {
        new Hamming("AAA", "AAAG");
    }

    
    @Test
    public void testLargeHammingDistance() {
        assertEquals(new Hamming("GATACA", "GCATAA").getHammingDistance(), hamming.is(4));
    }

    
    @Test
    public void testHammingDistanceInVeryLongStrand() {
        assertEquals(new Hamming("GGACGGATTCTG", "AGGACGGATTCT").getHammingDistance(), hamming.is(9));
    }

}
