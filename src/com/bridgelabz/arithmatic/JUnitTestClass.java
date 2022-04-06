package com.bridgelabz.arithmatic;

import org.junit.Assert;
import org.junit.Test;

public class JUnitTestClass {

	@Test
	public void testAssert() {

		String string1 = "JUnit";
		String string2 = "JUnit";

		Object obj1 = new Object();
		Object obj2 = new Object();

		String string5 = null;

		int var1 = 1;
		int var2 = 2;

		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 2, 3 };

		Assert.assertEquals(string1, string2);

		System.out.println(string1 == string2);
		Assert.assertSame(string1, string2);

		System.out.println(obj1 == obj1);
		Assert.assertSame(obj1, obj1);

		System.out.println(obj1 == obj2);
		Assert.assertNotSame(obj1, obj2);

		Assert.assertNotNull(string2);

		Assert.assertNull(string5);

		Assert.assertTrue(var1 < var2);
		Assert.assertFalse(var1 > var2);

		Assert.assertArrayEquals(arr1, arr2);
	}

}