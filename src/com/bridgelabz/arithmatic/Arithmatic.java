package com.bridgelabz.arithmatic;

public class Arithmatic {

	public int add(int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

}