package com.cogzy.programs;

import java.util.Arrays;

public class EvenAndOdd {

	public static int[] SumOfEvensAndOdds(int[] nums) {

		if (nums == null) {

			nums = new int[0];

		}

		int[] result = new int[2];

		for (int num : nums) {

			if (num % 2 == 0) {

				result[0] += num;

			} else {

				result[1] += num;

			}

		}

		return result;

	}

	public void printSumOfEvensAndOdds(int[] input) {

		System.out.println(Arrays.toString(SumOfEvensAndOdds(input)));

	}

	public static void main(String[] args) {

		try {

			int[] input = new int[args.length];

			for (int i = 0; i < input.length; i++) {

				input[i] = Integer.parseInt(args[i]);

			}

			EvenAndOdd obj = new EvenAndOdd();

			obj.printSumOfEvensAndOdds(input);

		} catch (NumberFormatException e) {

			System.out.println("Only numbers are allowed.");

		}
	}
}
