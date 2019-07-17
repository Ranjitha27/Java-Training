package com.cogzy.programs;

import com.cogzy.utils.SinglyLinkedList;

public class P01_LinkedListDemo {

	public static void main(String[] args) {

		SinglyLinkedList<Integer> nums = new SinglyLinkedList<Integer>();
		nums.addAtStart(20); 
		System.out.println(nums);
		nums.addAtStart(50); 
		System.out.println(nums);
		nums.addAtStart(35); 
		System.out.println(nums);
		nums.addAtEnd(10); 
		System.out.println(nums);
		nums.addAtIndex(44, 0);
		System.out.println(nums);
	   
		int index = 3;
		Integer n = nums.get(index);
		System.out.printf("Element at index %d is %d\n", index, n);
	    

         index = 2;
         n = nums.deleteAtIndex(index);
         System.out.printf("Element at given index %d is %d is deleted\n", index, n);
         System.out.println(nums);
         
        // nums.empty();
        // System.out.println("deleted all elements");
         
        index = 2;
        nums.set(77,2);
        System.out.printf("After setting 77 at index %d, nums is %s\n",index, nums);
        
        n=30;
		boolean found = nums.exists(n);
		System.out.printf("%d found is %s\n", n, found);
		
		n = 44;
		index = nums.indexOf(n);
		System.out.printf("Index of %d in nums is %d\n", n, index);


        n=44;
        found = nums.exists(n);
        System.out.printf("%d found is %s\n", n, found);
	}


	}


