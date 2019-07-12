package com.cogzy.utils;

public class SinglyLinkedList<T> {

	private Node<T> start, end;
	private int size;

	public SinglyLinkedList() {
		start = end = null;
	}

	// 1. functions to add elements at the start/end positions

	public void addAtstart(T data) {
		Node<T> newNode = new Node<T>(data);
		if (start == null) {
			start = end = newNode;

		} else {
			newNode.next = start;
			start = newNode;

		}
		size++;

	}

	public void addAtEnd(T data) {
		Node<T> newNode = new Node<T>(data);
		if (start == null) {
			start = end = newNode;
		} else {
			end.next = newNode;
			end = newNode;
		}
		size++;
	}

//2. function to insert element at a given index

	public void addAtIndex(T data, int index) {

		if (index < 0 || index >= size) {

			throw new IndexOutOfBoundsException("Invalid index");

		}

		if (index == 0) {

			this.addAtEnd(data);

			return;

		}

		if (index == size - 1) {

			this.addAtEnd(data);

			return;

		}

		// navigate using a loop from start till the given index, and then insert the

		// node

		Node<T> newNode = new Node<T>(data);

		Node<T> temp = start;

		for (int i = 1; i < index; i++) {

			temp = temp.next;

		}

		newNode.next = temp.next;

		temp.next = newNode;

		size++;

	}
	// 3. function to get the number of elements

	public int size() {

		return this.size;

	}

	// 4. function to get an element at a given index

	public T get(int index) {

		return null;

	}

	// 5. function to delete an element at a given index

	public T deleteAtIndex(int index) {

		// delete the node at the given index and return the data of the node

		return null;

	}

	// 6. function to delete all elements (empty the list)

	public void empty() {

		// just delete all elements of the linked list

	}

	// 7. function to set a value at a given index

	public void set(T data, int index) {

		// node at the given index should now contain this new data

	}

	// 8. function to check if a given data exists in the list

	public boolean exists(T data) {

		// return true/false based on if the data is found in the list or not
		
		return indexOf(data) >= 0;

	}

	// 9. function to get the index of a given data

	public int indexOf(T data) {

		// should return -1 if the data is not found

		// but if found, return the index of the same

		return -1;
	}
//10. function to represent the entire list as a String

	@SuppressWarnings("unchecked")
	@Override

	public String toString() {

		String str = "SinglyLinkedList [";

		if (start == null) {

			str += "]";

			return str;

		}

		Node<T> temp = start;

		while (temp != end) {

			str += temp.data + ", ";

			temp = temp.next;

		}

		str += temp.data;

		str += "]";

		return str;

	}

	@SuppressWarnings("hiding")
	private class Node<T> {

		private T data;

		@SuppressWarnings("rawtypes")
		private Node next;

		private Node(T data) {

			this.data = data;

		}

		@SuppressWarnings("unused")
		private void setData(T data) {

			this.data = data;

		}

		@SuppressWarnings("unused")
		private T getData() {

			return data;

		}

		@SuppressWarnings({ "unused", "rawtypes" })
		private void setNext(Node next) {

			this.next = next;

		}

		@SuppressWarnings({ "unused", "rawtypes" })
		private Node getNext() {

			return next;

		}

	}

}
