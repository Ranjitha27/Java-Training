package assignment;

import java.util.Scanner;

public class EvenAndOdd {

	private static Scanner sc;

	public static void main(String[] args) {

		int number, i, evenSum = 0, oddSum = 0;
		sc = new Scanner(System.in);

		System.out.println("Enter any Number: ");
		number = sc.nextInt();

		for (i = 1; i <= number; i++) {

			if (i % 2 == 0) {
				evenSum = evenSum + i;
			} else {
				oddSum = oddSum + i;
			}
		}
		System.out.println("\n The Sum Of Even Numbers are" + " " + evenSum);
		System.out.println("\n The Sum Of Odd Numbers are" + " " + oddSum);
	}
}
