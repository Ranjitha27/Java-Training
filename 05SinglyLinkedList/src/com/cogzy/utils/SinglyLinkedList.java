package com.cogzy.utils;

public class SinglyLinkedList<T> {

	private Node<T> start, end;
	private int size;

	public SinglyLinkedList() {
		start = end = null;
	}

	// 1. Function to add elements at the start or end position

	public void addAtStart(T data) {
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

	// 2. Function to insert a element at a given index

	@SuppressWarnings("unchecked")
	public void addAtIndex(T data, int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Invalid Index");
		}
		if (index == 0) {
			this.addAtStart(data);
			return;
		}
		if (index == size - 1) {
			this.addAtEnd(data);
			return;
		}

		Node<T> newNode = new Node<T>(data);
		Node<T> temp = start;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		size++;

	}

	// 3. Function to get the number of elements
	public int size() {

		return this.size;
	}

	// 4. Function to get an element at a given index
	@SuppressWarnings("unchecked")
	public T get(int index) {

		if (index < 0 || index >= size || start == null) {
			throw new IndexOutOfBoundsException("Invalid index");
		}

		if (index == 0) {
			return start.data;
		}

		if (index == size - 1) {
			return end.data;
		}

		Node<T> temp = start;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}

		return temp.data;
	}

	// 5. Function to delete an element at a given index
	@SuppressWarnings("unchecked")
	public T deleteAtIndex(int index) {

		if (index < 0 || index >= size || start == null) {
			throw new IndexOutOfBoundsException("Invalid index");
		}

		Node<T> temp = start;
		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;
		}

		Node<T> tbd = temp.next;
		temp.next = tbd.next;
		return tbd.data;
	}

	// 6. Function to delete all elements
	public void empty() {
		start = end = null;
	}

	// 7. Function to set a value at a given index
	@SuppressWarnings("unchecked")
	public void set(T data, int index) {
		if (index < 0 || index >= size || start == null) {
			throw new IndexOutOfBoundsException("Invalid index");

		}

		if (index == 0) {
			start.data = data;
			return;
		}

		if (index == size - 1) {
			end.data = data;
			return;
		}

		Node<T> temp = start;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		temp.data = data;
	}

	// 8. Function to check if the given data exits in the list
	public boolean exists(T data) {
		// return false;
		return this.indexOf(data) != -1;
	}

	// 9. Function to get the index of a given data

	@SuppressWarnings("unchecked")
	public int indexOf(T data) {
		if (start == null) {
			return -1;
		}

		Node<T> temp = start;
		for (int i = 0; i < size - 2; i++) {
			if (temp.data.equals(data)) {
				return i;
			}
			temp = temp.next;
		}
		return -1;
	}

	@SuppressWarnings("unchecked")
	@Override
	public String toString() {
		String str = "SinglyLinkedList [";

		if (start == null) {
			str += "]";
			return str;
		} else {
			Node<T> temp = start;
			while (temp != end) {
				str += temp.data + ",";
				temp = temp.next;

			}
			str += temp.data;
			str += "]";

			return str;
		}
	}

	@SuppressWarnings("hiding")
	private class Node<T> {
		private T data;
		@SuppressWarnings("rawtypes")
		private Node next;

		public Node(T data) {
			this.data = data;
		}

		@SuppressWarnings("unused")
		private T getData() {
			return data;
		}

		@SuppressWarnings("unused")
		private void setData(T data) {
			this.data = data;
		}

		@SuppressWarnings({ "unused", "rawtypes" })
		private Node getNext() {
			return next;
		}

		@SuppressWarnings({ "rawtypes", "unused" })
		private void setNext(Node next) {
			this.next = next;
		}

	}
}
