package keywords;

public class RaindropConverter {

	private static final String[] outputArray = { "Pling", "Plang", "Plong" };

	public String convert(int inputNumber) {
		String outputStr = "";
		try {
			for (int i = 0; i <= 2; i++) {
				if (inputNumber % ((2*i) + 3) == 0) {
					outputStr = outputStr + outputArray[i];
				}
			}
			if (inputNumber % 3 != 0 & inputNumber % 5 != 0 & inputNumber % 7 != 0) {
				outputStr = String.valueOf(inputNumber);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return outputStr;
	}

}
