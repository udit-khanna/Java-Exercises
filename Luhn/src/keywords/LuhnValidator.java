package keywords;

public class LuhnValidator {

	public Boolean isValid(String string) {
		try {
			int replacementValue = 0, sumOfString = 0;
			String replacementValueInString = "";

//			System.out.println("String: " + string);
			string = string.trim().replaceAll("\\s+", "");
			string = new StringBuilder(string).reverse().toString();
//			System.out.println("reversed: " + string);
			
			if(string.equals("0")){
				return false;
			}
			
			String[] convertedToArray = string.split("");

			for (int count = 0; count < convertedToArray.length; count++) {
				if (count % 2 != 0) {
					if ((Integer.parseInt(convertedToArray[count]) * 2) >= 10) {
						replacementValue = ((Integer.parseInt(convertedToArray[count]) * 2) - 9);
					} else {
						replacementValue = (Integer.parseInt(convertedToArray[count]) * 2);
					}
//					 System.out.println(convertedToArray[count] + "->" +
//					 replacementValue);
					replacementValueInString = Integer.toString(replacementValue);
					convertedToArray[count] = replacementValueInString;
				}
				replacementValue = 0;
			}
//			System.out.println("string with replaced digits: ");

			for (int count = 0; count < convertedToArray.length; count++) {
				System.out.print(convertedToArray[count]);
				sumOfString = sumOfString + Integer.parseInt(convertedToArray[count]);
			}
//			System.out.println();
//			System.out.println("sum of string: " + sumOfString);
			if (sumOfString % 10 == 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
