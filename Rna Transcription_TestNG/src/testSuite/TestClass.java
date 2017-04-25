package testSuite;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import keywords.RnaTranscription;

public class TestClass {

	private RnaTranscription rnaTranscription;

	@BeforeClass
	public void setUp() {
		rnaTranscription = new RnaTranscription();
	}

	@Test
	public void testRnaTranscriptionOfEmptyDnaIsEmptyRna() {
		Assert.assertEquals("", rnaTranscription.ofDna(""));
	}

	@Test
	public void testRnaTranscriptionOfCytosineIsGuanine() {
		Assert.assertEquals("G", rnaTranscription.ofDna("C"));
	}

	@Test
	public void testRnaTranscriptionOfGuanineIsCytosine() {
		Assert.assertEquals("C", rnaTranscription.ofDna("G"));
	}

	@Test
	public void testRnaTranscriptionOfThymineIsAdenine() {
		Assert.assertEquals("A", rnaTranscription.ofDna("T"));
	}

	@Test
	public void testRnaTranscriptionOfAdenineIsUracil() {
		Assert.assertEquals("U", rnaTranscription.ofDna("A"));
	}

	@Test
	public void testRnaTranscription() {
		Assert.assertEquals("UGCACCAGAAUU", rnaTranscription.ofDna("ACGTGGTCTTAA"));
	}

}
