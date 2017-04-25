package keywords;

public class RnaTranscription {

	public String ofDna(String inputString) {
		System.out.println("Input String: " + inputString);
		String returnString = "";
		try {
			for(int count=0; count<inputString.length(); count++){
				if(inputString.charAt(count) == 'G'){
					returnString = returnString + "C";
				}else if(inputString.charAt(count) == 'C'){
					returnString = returnString + "G";
				}else if(inputString.charAt(count) == 'A'){
					returnString = returnString + "U";
				}else if(inputString.charAt(count) == 'T'){
					returnString = returnString + "A";
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("returned String: " + returnString);
		return returnString;
	}
	
}
