package keywords;

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
	
    private final Set missingLetters = new HashSet();  

	public Boolean isPangram(String string) {
		try {
			String str = string.toLowerCase();
			for (char ch = 'a'; ch <= 'z'; ch++) {  
	            missingLetters.add(ch);  
	        }  
	        for (int i = 0; i < str.length(); i++) {  
	            missingLetters.remove(str.charAt(i));  
	        } 
	        return missingLetters.isEmpty();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
  

}
