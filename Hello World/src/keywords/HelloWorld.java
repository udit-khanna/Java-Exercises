package keywords;

public class HelloWorld {

	public static String hello(String string) {
		String outputString = "Hello, World!";
		try {
			if(string == null || string == "" || string.equals(new String(""))){
				return outputString;
			}else{
				return outputString.replace("World", string);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return outputString;
	}

}
