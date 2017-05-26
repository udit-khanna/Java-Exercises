package keywords;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Sieve {

	private static int upperLimit;
	private static List<Integer> primeNumList = new ArrayList<Integer>();

	public Sieve(int i) {
		Sieve.upperLimit = i;
	}

	public Collection<Integer> getPrimes() {
		try {
			List<Integer> listOfAllNumsTillLimit = enterAllNumTillLimit(upperLimit);
			List<Integer> toRemove = new ArrayList<Integer>();
			for (int num : listOfAllNumsTillLimit) {
				// System.out.println("num value: "+num);
				if ((num * num) < upperLimit) {
					// System.out.println("to be removed:");
					for (int count = 2; (num * count) <= upperLimit; count++) {
						toRemove.add(count * num);
						// System.out.println(count * num);
					}
				}
			}
			listOfAllNumsTillLimit = removeMultiples(listOfAllNumsTillLimit, toRemove);
			primeNumList = listOfAllNumsTillLimit;
		} catch (Exception e) {
			e.printStackTrace();
		}
		// System.out.println("list: " + primeNumList);
		return primeNumList;
	}

	private List<Integer> removeMultiples(List<Integer> list, List<Integer> toRemove) {
		for (int numToRemove : toRemove) {
			int index = list.indexOf(numToRemove);
			if (index >= 0)
				list.remove(index);
		}
		return list;
	}

	public List<Integer> enterAllNumTillLimit(int limit) {
		List<Integer> list = new ArrayList<Integer>();
		// System.out.println("List of all num till: " + limit);
		for (int count = 2; count <= limit; count++) {
			list.add(count);
			// System.out.println(count);
		}
		return list;

	}

}
