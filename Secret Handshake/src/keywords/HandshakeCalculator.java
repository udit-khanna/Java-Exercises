package keywords;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HandshakeCalculator {
	private String outputStrings[] = {"WINK" , "DOUBLE_BLINK", "CLOSE_YOUR_EYES" ,"JUMP"};

	public List<String> calculateHandshake(int decimalNum) {
		List<String> handShakeList = new ArrayList<String>();
		try {
			System.out.println(decimalNum);
			String binaryForm = Integer.toBinaryString(decimalNum);
			System.out.println(binaryForm);
			for(int count=0; count<binaryForm.length();count++){
				if(Character.toString(binaryForm.charAt(count)).equals("1") & count <= 3){
					handShakeList.add(outputStrings[count]);
				}
				else if(binaryForm.length() > 4 && binaryForm.charAt(4) == '1'){
					Collections.reverse(handShakeList);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(handShakeList);
		return handShakeList;
	}

}
