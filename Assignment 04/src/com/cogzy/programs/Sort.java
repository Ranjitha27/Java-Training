package com.cogzy.programs;

public class Sort {

	public static void sortThreeNumbers(int a, int b, int c) {

		int t;

		if (!(a < b && a < c)) {

			if (b < a && b < c) {

				t = a;

				a = b;

				b = t;

			} else {

				t = a;

				a = c;

				c = t;

			}

		}

		if (b > c) {

			t = b;

			b = c;

			c = t;

		}

		System.out.print(a + " " + b + " " + c);

	}

	public static void main(String[] args) {

		sortThreeNumbers(2, 10, 1);
		System.out.println();

		sortThreeNumbers(20, 10, 1);
		System.out.println();

		sortThreeNumbers(2, 10, 100);
		System.out.println();
	}
}
