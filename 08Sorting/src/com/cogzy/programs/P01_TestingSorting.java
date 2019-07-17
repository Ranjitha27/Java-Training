package com.cogzy.programs;

import com.cogzy.utils.Sorting;

public class P01_TestingSorting {

	public static void main(String[] args) {

		testQuickSortAlogirthm();
	}

	static void testQuickSortAlogirthm() {
		int[] nums = { 5, 7, 9, 10, 12, 1, };
		Sorting s = new Sorting();
		s.sort(nums);

		for (int i : nums) {
			System.out.print(i);
			System.out.print(" ");
		}

	}

}
