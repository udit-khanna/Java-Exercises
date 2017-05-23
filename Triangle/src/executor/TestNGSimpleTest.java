package executor;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import keywords.Triangle;

public class TestNGSimpleTest {
	public List<String> TriangleKind = new ArrayList<>(Arrays.asList("EQUILATERAL", "ISOSCELES", "SCALENE"));

	@Test
	public void equilateralTrianglesHaveEqualSides() throws TriangleException {
		Triangle triangle = new Triangle(2, 2, 2);

		assertEquals(TriangleKind.get(0), triangle.getKind());
	}

	@Test
	public void largerEquilateralTrianglesAlsoHaveEqualSides() throws TriangleException {
		Triangle triangle = new Triangle(10, 10, 10);

		assertEquals(TriangleKind.get(0), triangle.getKind());
	}

	@Test
	public void isoscelesTrianglesHaveLastTwoSidesEqual() throws TriangleException {
		Triangle triangle = new Triangle(3, 4, 4);

		assertEquals(TriangleKind.get(1), triangle.getKind());
	}

	@Test
	public void isoscelesTrianglesHaveFirstAndLastSidesEqual() throws TriangleException {
		Triangle triangle = new Triangle(4, 3, 4);

		assertEquals(TriangleKind.get(1), triangle.getKind());
	}

	@Test
	public void isoscelesTrianglesHaveTwoFirstSidesEqual() throws TriangleException {
		Triangle triangle = new Triangle(4, 4, 3);

		assertEquals(TriangleKind.get(1), triangle.getKind());
	}

	@Test
	public void isoscelesTrianglesHaveInFactExactlyTwoSidesEqual() throws TriangleException {
		Triangle triangle = new Triangle(10, 10, 2);

		assertEquals(TriangleKind.get(1), triangle.getKind());
	}

	@Test
	public void scaleneTrianglesHaveNoEqualSides() throws TriangleException {
		Triangle triangle = new Triangle(3, 4, 5);

		assertEquals(TriangleKind.get(2), triangle.getKind());
	}

	@Test
	public void scaleneTrianglesHaveNoEqualSidesAtLargerScaleEither() throws TriangleException {
		Triangle triangle = new Triangle(10, 11, 12);

		assertEquals(TriangleKind.get(2), triangle.getKind());
	}

	@Test
	public void scaleneTrianglesHaveNoEqualSidesInDescendingOrderEither() throws TriangleException {
		Triangle triangle = new Triangle(5, 4, 2);

		assertEquals(TriangleKind.get(2), triangle.getKind());
	}

	@Test
	public void verySmallTrianglesAreLegal() throws TriangleException {
		Triangle triangle = new Triangle(0.4, 0.6, 0.3);

		assertEquals(TriangleKind.get(2), triangle.getKind());
	}

	@Test(expectedExceptions = TriangleException.class)
	public void trianglesWithNoSizeAreIllegal() throws TriangleException {
		new Triangle(0, 0, 0);
	}

	@Test(expectedExceptions = TriangleException.class)
	public void trianglesWithNegativeSidesAreIllegal() throws TriangleException {
		new Triangle(3, 4, -5);
	}

	@Test(expectedExceptions = TriangleException.class)
	public void trianglesViolatingTriangleInequalityAreIllegal() throws TriangleException {

		new Triangle(1, 1, 3);
	}

	@Test(expectedExceptions = TriangleException.class)
	public void trianglesViolatingTriangleInequalityAreIllegal2() throws TriangleException {

		new Triangle(2, 4, 2);
	}

	@Test(expectedExceptions = TriangleException.class)
	public void trianglesViolatingTriangleInequalityAreIllegal3() throws TriangleException {

		new Triangle(7, 3, 2);
	}
}
