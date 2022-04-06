package com.bridgelabz.arithmatic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArithmaticTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class called");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("afetr class called");
	}

	@Before
	public void beforeTest() {
		System.out.println("before is called");
	}

	@After
	public void afterTest() {
		System.out.println("After is called");
	}

	@Test
	public void testAdd45() {
		Arithmatic a = new Arithmatic();

		int actualResult = a.add(4, 5);

		assertEquals(8, actualResult);
	}

	@Test
	public void testAdd1214() {
		Arithmatic a = new Arithmatic();
		int actualResult = a.add(-12, 5);
		assertEquals(-7, actualResult);
	}

	@Test
	public void testAddWithThreeValue() {
		Arithmatic a = new Arithmatic();
		int actualResult = a.add(0, 14, 15);
		assertEquals(29, actualResult);
	}

}