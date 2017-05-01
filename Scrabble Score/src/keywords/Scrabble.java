package keywords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Scrabble {
	private static String input;
	private HashMap<String, Integer> valueMap;
	private static final String[] valueString = { "AEIOULNRST", "DG", "BCMP", "FHVWY", "K", "JX", "QZ" };
	private static final Integer[] valueOfChar = { 1, 2, 3, 4, 5, 8, 10 };

	public Scrabble(String scrabbleInput) {
		Scrabble.input = scrabbleInput;
	}

	public int getScore() {
		try {
			if (input == null | input == "") {
				return 0;
			} else {
				return scoreScrabble(input);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

	public int scoreScrabble(String inputString) {
		int score = 0;
		String str = null;
		for (int count = 0; count < inputString.length(); count++) {
			str = Character.toString(inputString.charAt(count));
			for (int x = 0; x < valueString.length; x++) {
				if (valueString[x].contains(str.toUpperCase())) {
					score = score + valueOfChar[x];
				}
			}
		}
		System.out.println(inputString + " : " + score);
		return score;
	}

}
