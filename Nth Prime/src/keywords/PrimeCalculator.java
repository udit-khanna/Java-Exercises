package keywords;

public class PrimeCalculator {

	public int nth(int i) {
		checkNthNum(i);
		try {
			int candidate, count;
		    for(candidate = 2, count = 0; count < i; candidate++) {
		        if (isPrime(candidate)) {
		            ++count;
		        }
		    }
		    return candidate-1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	private void checkNthNum(int i) {
		if(i==0){
			throw new IllegalArgumentException();
		}
	}

	private boolean isPrime(int candidate) {
		for(int i = 2; i < candidate; ++i) {
	        if (candidate % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}

	

}
