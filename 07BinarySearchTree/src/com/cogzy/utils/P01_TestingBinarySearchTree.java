package com.cogzy.utils;

import com.cogzy.utils.BinarySearchTree;

public class P01_TestingBinarySearchTree {

	public static void main_1(String[] args) {
		BinarySearchTree<String> tree = new BinarySearchTree<String>();
		tree.add("Theju");
		tree.add("Ranju");
		tree.add("Keerthana");
		tree.add("Sahiti");
		System.out.println(tree);
		
		// tree.print();
	}

	public static void main(String[] args) {

		BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();

		tree.add(51);
		tree.add(21);
		tree.add(7);
		tree.add(5);
		tree.add(51);
		tree.add(75);
		tree.add(56);
		tree.add(53);
		tree.add(65);
		tree.add(51);
		tree.add(10);

		tree.print();
	}

}
