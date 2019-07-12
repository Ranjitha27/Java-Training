package com.cogzy.programs;

public class P01_CreateArray {

	public static void main(String[] args) {

		int[] x;
		int size = 4;
		x = new int[size];
		System.out.println("x is : " + x);
		System.out.println("Elements of X are :");
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);

		}
		x[0] = 123;
		x[1] = 23;
		x[2] = -45;
		x[3] = 4356;
		x[4] = 100;//

		x = new int[] { 19, 29, 30, 44, 23, 45 };

		x[2] = 300;

		System.out.println("New elements of x are: ");

		for (int i = 0; i < x.length; i++) {

			System.out.println(x[i]);
		}
	}
}