package keywords;

public class DifferenceOfSquaresCalculator {

	public int computeSquareOfSumTo(int i) {
		int squareOfSum = 0;
		try {
			int sumOfNum = 0;
			for(int count=0; count<=i ; count++){
				sumOfNum = sumOfNum + count;
			}
			squareOfSum = sumOfNum * sumOfNum;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return squareOfSum;
	}

	public int computeSumOfSquaresTo(int i) {
		int SumOfSquares = 0;
		try {
			for(int count=0; count<=i ; count++){
				SumOfSquares = SumOfSquares + (count*count);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SumOfSquares;
	}

	public int computeDifferenceOfSquares(int i) {
		int DifferenceOfSquares = 0;
		try {
			DifferenceOfSquares = computeSquareOfSumTo(i) - computeSumOfSquaresTo(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return DifferenceOfSquares;
	}

}
