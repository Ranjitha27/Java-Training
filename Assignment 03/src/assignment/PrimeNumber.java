package assignment;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a Number");
		int n = sc.nextInt();
		boolean isPrime = true;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				isPrime = false;
		}

		if (isPrime)
			System.out.println(n + " " + " is a Prime number");
		else
			System.out.println(n + " " + "is not a Prime number");
	}

}
