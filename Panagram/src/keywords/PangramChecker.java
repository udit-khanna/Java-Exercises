package keywords;

public class PangramChecker {

	public Boolean isPangram(String string) {
		try {
			String str = string.toLowerCase().replaceAll("[^a-z]", "");			
				if(str.length() < 26){
					return false;
				}
				else{
					for(char ch = 'a'; ch <= 'z'; ch++){
						if(!str.contains(String.valueOf(ch))){							
							return false;
						}
					}
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

}
