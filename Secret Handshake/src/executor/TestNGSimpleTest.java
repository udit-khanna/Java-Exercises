package executor;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;

import keywords.HandshakeCalculator;

public class TestNGSimpleTest {
	private HandshakeCalculator handshakeCalculator;

	public enum Signal {
		WINK, DOUBLE_BLINK, CLOSE_YOUR_EYES, JUMP;
	}

	public List<String> signal = new ArrayList<String>(
			Arrays.asList("WINK", "DOUBLE_BLINK", "CLOSE_YOUR_EYES", "JUMP"));

	private Boolean compareTo(List<String> a, List<String> b) {

		if ((a.size() != b.size()) || (a == null && b != null) || (a != null && b == null)) {
			return false;
		}
		System.out.println("actual: " + b);
		System.out.println("expected: " + a);
		// if (a == null && b == null) return true;
		//
		// Sort and compare the two lists
		// Collections.sort(a);
		// Collections.sort(b);
		return a.equals(b);

	}

	@BeforeMethod
	public void setUp() {
		handshakeCalculator = new HandshakeCalculator();
	}

	@Test
	public void testThatInput1YieldsAWink() {
		Assert.assertTrue(compareTo(singletonList(signal.get(0)), handshakeCalculator.calculateHandshake(1)));
	}

	@Test
	public void testThatInput2YieldsADoubleBlink() {
		Assert.assertTrue(compareTo(singletonList(signal.get(1)), handshakeCalculator.calculateHandshake(2)));
	}

	@Test
	public void testThatInput4YieldsACloseYourEyes() {
		Assert.assertTrue(compareTo(singletonList(signal.get(2)), handshakeCalculator.calculateHandshake(4)));
	}

	@Test
	public void testThatInput8YieldsAJump() {
		Assert.assertTrue(compareTo(singletonList(signal.get(3)), handshakeCalculator.calculateHandshake(8)));
	}

	@Test
	public void testAnInputThatYieldsTwoActions() {
		Assert.assertTrue(compareTo(asList(signal.get(0), signal.get(1)), handshakeCalculator.calculateHandshake(3)));
	}

	@Test
	public void testAnInputThatYieldsTwoReversedActions() {
		Assert.assertTrue(compareTo(asList(signal.get(1), signal.get(0)), handshakeCalculator.calculateHandshake(19)));
	}

	@Test
	public void testReversingASingleActionYieldsTheSameAction() {
		Assert.assertTrue(compareTo(singletonList(signal.get(3)), handshakeCalculator.calculateHandshake(24)));
	}

	@Test
	public void testReversingNoActionsYieldsNoActions() {
		Assert.assertTrue(compareTo(emptyList(), handshakeCalculator.calculateHandshake(16)));
	}

	@Test
	public void testInputThatYieldsAllActions() {
		Assert.assertTrue(compareTo(asList(signal.get(0), signal.get(1), signal.get(2), signal.get(3)),
				handshakeCalculator.calculateHandshake(15)));
	}

	@Test
	public void testInputThatYieldsAllActionsReversed() {
		Assert.assertTrue(compareTo(asList(signal.get(3), signal.get(2), signal.get(1), signal.get(0)),
				handshakeCalculator.calculateHandshake(31)));
	}

	@Test
	public void testThatInput0YieldsNoActions() {
		assertEquals(emptyList(), handshakeCalculator.calculateHandshake(0));
	}

	@Test
	public void testThatInputWithLower5BitsNotSetYieldsNoActions() {
		Assert.assertTrue(compareTo(emptyList(), handshakeCalculator.calculateHandshake(32)));
	}
}
