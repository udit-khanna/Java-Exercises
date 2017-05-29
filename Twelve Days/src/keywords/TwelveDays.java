package keywords;

public class TwelveDays {
	private final static String twelveDaysSong = "On the first day of Christmas my true love gave to me, a Partridge in a Pear Tree.\n"
			+ "\n" + "On the second day of Christmas my true love gave to me, two Turtle Doves, "
			+ "and a Partridge in a Pear Tree.\n" + "\n"
			+ "On the third day of Christmas my true love gave to me, three French Hens, two Turtle Doves, "
			+ "and a Partridge in a Pear Tree.\n" + "\n"
			+ "On the fourth day of Christmas my true love gave to me, four Calling Birds, three French Hens, "
			+ "two Turtle Doves, and a Partridge in a Pear Tree.\n" + "\n"
			+ "On the fifth day of Christmas my true love gave to me, five Gold Rings, four Calling Birds, "
			+ "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" + "\n"
			+ "On the sixth day of Christmas my true love gave to me, six Geese-a-Laying, five Gold Rings, "
			+ "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" + "\n"
			+ "On the seventh day of Christmas my true love gave to me, seven Swans-a-Swimming, "
			+ "six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, "
			+ "and a Partridge in a Pear Tree.\n" + "\n"
			+ "On the eighth day of Christmas my true love gave to me, eight Maids-a-Milking, "
			+ "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, "
			+ "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" + "\n"
			+ "On the ninth day of Christmas my true love gave to me, nine Ladies Dancing, eight Maids-a-Milking,"
			+ " seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, "
			+ "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" + "\n"
			+ "On the tenth day of Christmas my true love gave to me, ten Lords-a-Leaping, nine Ladies Dancing,"
			+ " eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, "
			+ "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" + "\n"
			+ "On the eleventh day of Christmas my true love gave to me, eleven Pipers Piping, "
			+ "ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, "
			+ "six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, "
			+ "and a Partridge in a Pear Tree.\n" + "\n"
			+ "On the twelfth day of Christmas my true love gave to me, twelve Drummers Drumming, "
			+ "eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, "
			+ "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, "
			+ "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
	private static String[] songSplit = null;

	public String verse(int i) {
		String returnVerse = null;
		try {
			splitSongIntoVerse();
			returnVerse = songSplit[i - 1] + "\n";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnVerse;
	}

	public String verses(int i, int j) {
		String returnVerse = "";
		try {
			splitSongIntoVerse();
			for (int count = i; count <= j; count++) {
				if (count != j)
					returnVerse = returnVerse + songSplit[count - 1] + "\n\n";
				else
					returnVerse = returnVerse + songSplit[count - 1] + "\n";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("returnVerse: " + returnVerse);
		return returnVerse;
	}

	public String sing() {
		return twelveDaysSong;
	}

	private void splitSongIntoVerse() {
		songSplit = twelveDaysSong.split("\\n+");
	}

}
