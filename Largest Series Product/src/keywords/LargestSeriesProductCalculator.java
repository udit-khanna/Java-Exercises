package keywords;

public class LargestSeriesProductCalculator {
	private static String inputString;

	public LargestSeriesProductCalculator(String string) {
		LargestSeriesProductCalculator.inputString = string.trim();
		checkInputString();
	}

	public long calculateLargestProductForSeriesLength(int i) {
		long largestProduct = 0;
		checkInputSeriesLength(i);
		try {
			if (inputString.equals("") & i==0){
				return 1;
			}
			for(int count=0; (i+count)<inputString.length(); count++ ){
				String series = inputString.substring(count, (i+count));
				int seriesProduct = 1;
				for(int seriesCount = 0; seriesCount<series.length(); seriesCount++){
					seriesProduct = seriesProduct*Character.getNumericValue(series.charAt(seriesCount));
					if(seriesProduct>largestProduct){
						largestProduct = seriesProduct;
					}
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return largestProduct;
	}

	private void checkInputSeriesLength(int i) {
		if(i<0){
			throw new IllegalArgumentException("Series length must be non-negative.");
		} else if(i > inputString.length()){
			throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
		} else if (inputString.equals("") & i>0){
			throw new IllegalArgumentException(
					"Series length must be less than or equal to the length of the string to search.");
		}
	}

	public long changeInputStringToLong(String string) {
		long inputStringInIntegerFormat = Long.parseLong(string);
		return inputStringInIntegerFormat;
	}

	public void checkInputString() {
		if (inputString.equals(null))
			throw new IllegalArgumentException("String to search must be non-null.");
		else if (!inputString.matches("[0-9]+")){
			throw new IllegalArgumentException("String to search may only contains digits.");
		}
			
	}

}
