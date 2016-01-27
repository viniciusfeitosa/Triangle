package com.tradeshift.triangle.main;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTypeTest {

	@Test
	public void testErrorToZeroValueOrNegativeValue() {
		int[] sides = {1, 0, -7};
		TriangleType triangleType = new TriangleType(sides);
		Assert.assertEquals("Your input is invalid to triangle", triangleType.check());
	}
	
	@Test
	public void testErroToSideBiggerThemSumOfOther() {
		int[] sides = {1, 1, 10};
		TriangleType triangleType = new TriangleType(sides);
		Assert.assertEquals("Your input is invalid to triangle", triangleType.check());
	}
	
	@Test
	public void testToEquilatera() {
		int[] sides = {5, 5, 5};
		TriangleType triangleType = new TriangleType(sides);
		Assert.assertEquals(Triangle.EQUILATERAL.toString(), triangleType.check());
	}
	
	@Test
	public void testToIsoceles() {
		int[] sides = {5, 5, 4};
		TriangleType triangleType = new TriangleType(sides);
		Assert.assertEquals(Triangle.ISOCELES.toString(), triangleType.check());
	}
	
	@Test
	public void testToScalene() {
		int[] sides = {5, 7, 4};
		TriangleType triangleType = new TriangleType(sides);
		Assert.assertEquals(Triangle.SCALENE.toString(), triangleType.check());
	}

}
