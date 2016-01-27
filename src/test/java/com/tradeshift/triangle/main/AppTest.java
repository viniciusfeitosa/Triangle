package com.tradeshift.triangle.main;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.naming.directory.InvalidAttributesException;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AppTest {

	private String[] array;
	
	@Rule
    public ExpectedException expectedException = ExpectedException.none();

	@Test()
	public void testInvalidValuesWithEmptyInput() throws InvalidAttributesException {
		expectedException.expect(InvalidAttributesException.class);
		expectedException.expectMessage("Input can't be empty");
		System.setIn(generateInput(""));
		App.main(array);
	}
	
	@Test()
	public void testInvalidValuesWithLetters() throws InvalidAttributesException {
		expectedException.expect(NumberFormatException.class);
		expectedException.expectMessage("Invalid number format to your input");
		System.setIn(generateInput("a,a,a"));
		App.main(array);
	}
	
	@Test()
	public void testInvalidSeparator() throws InvalidAttributesException {
		expectedException.expect(InvalidAttributesException.class);
		expectedException.expectMessage("Invalid input value");
		System.setIn(generateInput("5 5 5"));
		App.main(array);
	}
	
	@Test()
	public void testInvalidNumberOfValues() throws InvalidAttributesException {
		expectedException.expect(InvalidAttributesException.class);
		expectedException.expectMessage("Invalid input value");
		System.setIn(generateInput("5,5"));
		App.main(array);
	}
	
	@Test()
	public void testSidesStringToLong(){
		int[] expectedSidesInLong = {5, 4, 3};
		List<String> sides = new ArrayList<String>();
		sides.add("5");
		sides.add("4");
		sides.add("3");
		int[] sidesInLong = App.sidesStringToLong(sides);
		Assert.assertEquals(expectedSidesInLong[0], sidesInLong[0]);
		Assert.assertEquals(expectedSidesInLong[1], sidesInLong[1]);
		Assert.assertEquals(expectedSidesInLong[2], sidesInLong[2]);
	}
	
	private InputStream generateInput(String input){
		return new ByteArrayInputStream(input.getBytes());
	}

}
