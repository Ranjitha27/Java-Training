package assignment;

import java.util.Scanner;
import java.util.Arrays;

public class Sort {

	private static Scanner sc;

	public static void main(String[] args) {

		int i, Size;
		sc = new Scanner(System.in);
		System.out.println("Enter the Number Of Elements in the Array :");
		Size = sc.nextInt();

		int[] a = new int[Size];
		System.out.println("Please Enter " + Size + " Elements of an Array :");

		for (i = 0; i < Size; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("\n Result of a Sorted Array :");
		for (int Number : a) {
			System.out.print(Number + " ");

		}

	}

}
