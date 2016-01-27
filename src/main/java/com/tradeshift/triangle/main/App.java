package com.tradeshift.triangle.main;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.naming.directory.InvalidAttributesException;

/**
 *
 * @author Vinicius Pacheco
 *
 */
public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws InvalidAttributesException {
		System.out.println("Please enter the 3 sides values to determinate the triangle type");
		System.out.print("Split values with commas:");

		Scanner scanner = new Scanner(System.in);
		if(!scanner.hasNext())
			throw new InvalidAttributesException("Input can't be empty");

		List<String> sides = Arrays.asList(scanner.nextLine().split(","));
		if(sides.size() != 3)
			throw new InvalidAttributesException("Invalid input value");

		System.out.println(new TriangleType(App.sidesStringToLong(sides)).check());
	}

	/**
	 *
	 * @param  List<String> sides
	 * @return int[]
	 * @throws NumberFormatException
	 */
	public static int[] sidesStringToLong(List<String> sides) throws NumberFormatException {
		int[] sidesLong = new int[3];
		try {
			for (int i = 0; i < sides.size(); i++) {
				sidesLong[i] = Integer.parseInt(sides.get(i));
			}
		} catch (NumberFormatException e) {
			throw new NumberFormatException("Invalid number format to your input");
		}
		return sidesLong;
	}
}
