package com.cogzy.utils;

public class DoublyLinkedList<T> {
	private Node<T> start, end;
	private int size = 0;

	public DoublyLinkedList() {
		start = end = null;

	}

	public void addAtStart(T data) {
		Node<T> newNode = new Node<T>(data);
		newNode.data = data;

		if (start != null) {
			start.previous = newNode;
			newNode.next = start;
		}
		start = newNode;
		if (end == null) {
			end = newNode;
		}
		size++;
	}

	public void addAtEnd(T data) {
		Node<T> newNode = new Node<T>(data);
		newNode.data = data;

		if (end != null) {
			end.next = newNode;
			newNode.previous = end;
		}
		end = newNode;
		if (start == null) {
			start = newNode;
		}
		size++;
	}

	public Node<T> deleteStart() {

		if (size == 0) {
			throw new RuntimeException("Doubly linked list is already empty");
		}
		Node<T> temp = start;
		start = start.next;
		start.previous = null;
		size--;
		return temp;
	}

	public Node<T> deleteEnd() {

		Node<T> temp = end;
		end = end.previous;
		end.next = null;
		size--;
		return temp;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return false;
	}

	public void deleteAfter(Node<T> after) {
		Node<T> temp = start;
		while (temp.next != null && temp.data != after.data) {
			temp = temp.next;
		}
		if (temp.next != null)
			temp.next.next.previous = temp;
		temp.next = temp.next.next;

	}

	public void addAtIndex(T data, int index) {
		Node<T> newNode = new Node<T>(data);

		if (index == 0) {
			newNode.next = start;
			start = newNode;

		} else {
			Node<T> temp = start;
			if (temp.next != null) {
				for (int i = 0; i < index - 1; i++)
					temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;

		}
		size++;
	}

	public void deleteAtIndex(int index) {
		if (index == 0) {
			start = start.next;

		} else {
			Node<T> temp = start;
			if (temp.next != null) {
				for (int i = 0; i < index - 1; i++)
					temp = temp.next;
			}
			temp.next = temp.next.next;
		}
		size--;
	}

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

	public boolean exists(T data) {
		return this.indexOf(data) != -1;

	}

	public int indexOf(T data) {
		if (start == null) {
			return -1;
		}
		Node<T> temp = start;
		for (int i = 0; i < size; i++) {
			if (temp.data.equals(data)) {
				return i;
			}
			temp = temp.next;
		}
		return -1;
	}

	public String toString() {

		String str = "DoublyLinkedList [";

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
	public class Node<T> {
		public T data;
		private Node<T> next;
		private Node<T> previous;

		private Node(T data) {
			this.data = data;
		}

		public void displayNodeData() {

		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}

		public Node<T> getPrevious() {
			return previous;
		}

		public void setPrevious(Node<T> previous) {
			this.previous = previous;
		}

	}
}
