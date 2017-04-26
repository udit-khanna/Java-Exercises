package keywords;

public class Hamming {
	private static String string1, string2;

	public Hamming(String string1, String string2) {

		if (string1.length() == string2.length()) {
			Hamming.string1 = string1;
			Hamming.string2 = string2;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public Hamming() {
		// empty constructor
	}

	public Object getHammingDistance() {
		Integer count = 0;
		try {
			for(int c=0; c<string1.length(); c++){
				if(string1.charAt(c) == string2.charAt(c)){
					continue;
				}else{
					count++;
				}
					
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	public Object is(int i) {
		return i;
	}

}
