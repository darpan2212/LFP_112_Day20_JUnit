package com.bridgelabz.arithmatic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ArithMaticTestParam {

	public int[] input;
	public int expectedResult;

	Arithmatic arithmatic;

	public ArithMaticTestParam(int[] input,
			int expectedResult) {
		this.input = input;
		this.expectedResult = expectedResult;
	}

	@Before
	public void initialize() {
		arithmatic = new Arithmatic();
	}

	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {
				{ new int[] { 4, 5 }, 9 },
				{ new int[] { 40, 20 }, 60 },
				{ new int[] { 1, 2, 3, 4, 5, 6, 7, 8 },
						36 }, });
	}

	@Test
	public void testAdd() {
		int actualResult = arithmatic.add(input);

		assertEquals(expectedResult, actualResult);
	}
}