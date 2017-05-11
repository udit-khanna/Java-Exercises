package keywords;

import java.util.HashSet;
import java.util.Iterator;

public class SumOfMultiples {
	private static int upperLimit;
	private static int[] set;
	private HashSet<Integer> multiples = new HashSet<>();
	public SumOfMultiples(int i, int[] set) {
		upperLimit = i;
		SumOfMultiples.set = set;
	}

	public int getSum() {
		int sumOfMultiples = 0;
		try {
			for(int setCounter = 0; setCounter<set.length; setCounter++){
				for (int count=0; count<upperLimit; count++) {
					if (count % set[setCounter] == 0) {
						multiples.add(count);
					}
				}
			}
			Iterator<Integer> it =multiples.iterator();
			while(it.hasNext()){
				sumOfMultiples = sumOfMultiples + it.next();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sumOfMultiples;
	}

	

}
