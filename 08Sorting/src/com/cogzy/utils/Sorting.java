package com.cogzy.utils;

public class Sorting {

	public Sorting() {

	}

	private int array[];
	private int length;

	public void sort(int[] inputarr) {
		if (inputarr == null || inputarr.length == 0) {
			return;
		}

		this.array = inputarr;
		length = inputarr.length;
		quicksort(0, length - 1);
	}

	private void quicksort(int lower, int higher) {
		int i = lower;
		int j = higher;
		int pivot = array[lower + (higher - lower) / 2];

		while (i <= j) {

			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}

			if (i <= j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}

			if (lower < j) {
				quicksort(lower, j);
			}

			if (i < higher) {
				quicksort(i, higher);
			}

		}
	}

}
