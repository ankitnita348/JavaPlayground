package com.methods;

public class WithMethod {
	public static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println("Sum : " + add(5, 10));
		System.out.println("Sum : " + add(5, 1));
		System.out.println("Sum : " + add(5, 2));
		System.out.println("Sum : " + add(5, 3));
		System.out.println("Sum : " + add(5, 4));
		System.out.println("Sum : " + add(5, 5));

	}

}
