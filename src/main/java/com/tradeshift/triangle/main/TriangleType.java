package com.tradeshift.triangle.main;

/**
 *
 * @author Vinicius Pacheco
 *
 */
public class TriangleType {

	private int x;
	private int y;
	private int z;

	/**
	 *
	 * @param int[] sides
	 */
	public TriangleType(int[] sides) {
		x = sides[0];
		y = sides[1];
		z = sides[2];
	}

	/**
	 *
	 * @return String
	 */
	public String check() {
		if (x <= 0 || y <= 0 || z <= 0 || (x >= y + z || y >= x + z || z >= x + y))
			return "Your input is invalid to triangle";

		if(x == y && y == z)
			return Triangle.EQUILATERAL.toString();

		if(x == y || y == z || x == z)
			return Triangle.ISOCELES.toString();

		return Triangle.SCALENE.toString();
	}
}
