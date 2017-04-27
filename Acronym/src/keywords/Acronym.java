package keywords;

public class Acronym {
	private static String phrase; 

	public Acronym(String phrase) {
		Acronym.phrase = phrase;
	}

	public String get() {
		String Acronym = "";
		try {
			String[] str = phrase.split("\\s");
			for(String s : str){
				Acronym = Acronym + s.charAt(0);
				if(s.contains("-")){
					int index = s.indexOf("-");
					Acronym = Acronym + s.charAt(index+1);
				}
//				for(int count =1; count<s.length(); count++){
//					if(s.charAt(count) >= 'A' & s.charAt(count) <= 'Z')
//						Acronym = Acronym + s.charAt(count);
//				}
			}
			
			System.out.println(phrase);
			System.out.println(Acronym.toUpperCase());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Acronym.toUpperCase();
	}

}
