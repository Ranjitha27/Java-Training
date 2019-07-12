package com.cogzy.programs;

import com.cogzy.utils.DoublyLinkedList;

public class P02_TestingDoublyLinkedList {

	public static void main(String[] args) {

		DoublyLinkedList<Integer> nums = new DoublyLinkedList<Integer>();

		nums.addAtStart(3);
		System.out.println(nums);
		nums.addAtStart(6);
		System.out.println(nums);
		nums.addAtStart(7);
		System.out.println(nums);
		nums.addAtStart(1);
		System.out.println(nums);
		nums.addAtEnd(2);
		System.out.println(nums);

		nums.deleteStart();
		System.out.println(nums);

		nums.deleteEnd();
		System.out.println(nums);

		int index = 2;
		nums.addAtIndex(700, index);
		System.out.printf("Element at index %d is %s\n", index, nums);

		index = 2;
		nums.deleteAtIndex(index);
		System.out.printf("Element at index %d is deleted %s\n", index, nums);

		index = 2;
		nums.set(77, 2);
		System.out.printf("After setting %d at index 77,nums is %s\n", index, nums);

		Integer n = 6;
		index = nums.indexOf(n);
		System.out.printf("Index of %d  in nums is %d\n", n, index);

		n = 77;
		index = nums.indexOf(n);
		System.out.printf("Index of %d in nums is %d\n", n, index);

		index = 2;
		n = nums.get(index);
		System.out.printf("Element at index %d is %d\n", index, n);
	}

}
