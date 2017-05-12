package executor;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.ExpectedExceptions;
import org.testng.annotations.Test;

import keywords.LuhnValidator;

public class TestNGSimpleTest {
	private LuhnValidator luhnValidator;

	@BeforeMethod
	public void setUp() {
		luhnValidator = new LuhnValidator();
	}

	@Test
	public void testThatSingleDigitStringIsNotValid() {
		Assert.assertFalse(luhnValidator.isValid("1"));
	}

	@Test
	public void testThatTheStringConsistingOfASingleZeroIsInvalid() {
		Assert.assertFalse(luhnValidator.isValid("0"));
	}

	@Test
	public void testThatASimpleValidNumberIsIdentifiedAsValid() {
		Assert.assertTrue(luhnValidator.isValid(" 5 9 "));
	}

	@Test
	public void testThatAValidCanadianSocialInsuranceNumberIsIdentifiedAsValidV1() {
		Assert.assertTrue(luhnValidator.isValid("046 454 286"));
	}

	@Test
	public void testThatAValidCanadianSocialInsuranceNumberIsIdentifiedAsValidV2() {
		Assert.assertTrue(luhnValidator.isValid("055 444 285"));
	}

	@Test
	public void testThatAnInvalidCanadianSocialInsuranceNumberIsIdentifiedAsInvalid() {
		Assert.assertFalse(luhnValidator.isValid("046 454 287"));
	}

	@Test
	public void testThatAnInvalidCreditCardIsIdentifiedAsInvalid() {
		Assert.assertFalse(luhnValidator.isValid("8273 1232 7352 0569"));
	}

	@Test
	public void testThatAddingANonDigitCharacterToAValidStringInvalidatesTheString() {
		Assert.assertFalse(luhnValidator.isValid("046a 454 286"));
	}

	@Test(expectedExceptions = NumberFormatException.class)
	public void testThatStringContainingPunctuationIsInvalid() {
		Assert.assertFalse(luhnValidator.isValid("055-444-285"));
	}

	@Test(expectedExceptions = NumberFormatException.class)
	public void testThatStringContainingSymbolsIsInvalid() {
		Assert.assertFalse(luhnValidator.isValid("055£ 444$ 285"));
	}

	@Test
	public void testThatTheStringConsistingOfASpaceAndASingleZeroIsInvalid() {
		Assert.assertFalse(luhnValidator.isValid(" 0"));
	}

	@Test(expectedExceptions = NumberFormatException.class)
	public void testThatStringContainingMultipleZerosIsValid() {
		Assert.assertTrue(luhnValidator.isValid(" 00000"));
	}

	@Test
	public void testThatDoublingNineIsHandledCorrectly() {
		Assert.assertTrue(luhnValidator.isValid("091"));
	}
}
