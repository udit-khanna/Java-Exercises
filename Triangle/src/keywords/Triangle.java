package keywords;

import executor.TriangleException;

public class Triangle {
	private double[] triangleSides = new double[3];

	public Triangle(double d, double e, double f) throws TriangleException {
		triangleSides[0] = d;
		triangleSides[1] = e;
		triangleSides[2] = f;
		checkDegeneratedTriangle(triangleSides);
	}

	public Object getKind() {
		try {
			if (checkEquilateralTriangle(triangleSides))
				return "EQUILATERAL";
			else if (checkIsoscelesTriangle(triangleSides))
				return "ISOSCELES";
			else
				return "SCALENE";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private boolean checkIsoscelesTriangle(double[] triangleSides2) {
		Boolean isIsosceles = false;
		try {
			if (triangleSides2[0] == triangleSides2[1] & triangleSides2[0] != triangleSides2[2])
				isIsosceles = true;
			else if (triangleSides2[0] == triangleSides2[2] & triangleSides2[0] != triangleSides2[1])
				isIsosceles = true;
			else if (triangleSides2[1] == triangleSides2[2] & triangleSides2[0] != triangleSides2[1])
				isIsosceles = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isIsosceles;

	}

	private boolean checkEquilateralTriangle(double[] triangleSides2) {
		Boolean isEquilateral = false;
		try {
			if (triangleSides2[0] == triangleSides2[1] & triangleSides2[0] == triangleSides2[2])
				isEquilateral = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isEquilateral;

	}

	private void checkDegeneratedTriangle(double[] triangleSides2) throws TriangleException {
		if (triangleSides2[0] + triangleSides2[1] <= triangleSides2[2])
			// throw new TriangleException();
			throw new TriangleException("It is a degenerated triangle");
		else if (triangleSides2[0] + triangleSides2[2] <= triangleSides2[1])
			// throw new TriangleException();
			throw new TriangleException("It is a degenerated triangle");
		else if (triangleSides2[1] + triangleSides2[2] <= triangleSides2[0])
			// throw new TriangleException();
			throw new TriangleException("It is a degenerated triangle");
	}

}
