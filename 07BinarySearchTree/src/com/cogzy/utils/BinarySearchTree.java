package com.cogzy.utils;

public class BinarySearchTree<T extends Comparable<T>> {

	private Node<T> start;

	public BinarySearchTree() {

	}

	public void add(T data) {
		Node<T> newNode = new Node<T>(data);
		add(newNode, start);

	}
	
	

	private void add(Node<T> newNode, Node<T> currNode) {
		if (currNode == null) {
			start = newNode;
			return;
		}

		if (newNode.data.compareTo(currNode.data) < 0) {
			if (currNode.left == null) {
				currNode.left = newNode;
			} else {
				add(newNode, currNode.left);
			}
		}

		else {
			if (currNode.right == null) {
				currNode.right = newNode;
			} else {
				add(newNode, currNode.right);
			}
		}

	}

	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("[");
		toString(start, sb);
		sb.append("]");
		return sb.toString();
	}

	private void toString(Node<T> currNode, StringBuilder sb) {

		if (currNode.left != null) {
			toString(currNode.left, sb);

		}
		sb.append(currNode.data);
		sb.append(" , ");

		if (currNode.right != null) {
			toString(currNode.right, sb);
		}
	}

	public void print() {
		print(start);
	}

	private void print(Node<T> currNode) {
		if (currNode == null) {
			System.out.println("No data in the tree\n");
			return;
		}

		if (currNode.left != null) {
			print(currNode.left);

		}
		System.out.print(currNode.data + ",");

		if (currNode.right != null) {
			print(currNode.right);
		}

	}

	@SuppressWarnings("hiding")
	class Node<T> {
		private T data;
		private Node<T> left;
		private Node<T> right;

		public Node(T data) {

			this.data = data;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node<T> getLeft() {
			return left;
		}

		public void setLeft(Node<T> left) {
			this.left = left;
		}

		public Node<T> getRight() {
			return right;
		}

		public void setRight(Node<T> right) {
			this.right = right;
		}

	}
}
