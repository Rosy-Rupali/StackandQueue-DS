/************************************************************
 * Purpose Implementation Of Stack and Queue using Linked List
 * @author Rosy Rupali
 * @Version 1.0
 * @since 12-06-2021
 *
 ************************************************************/
package com.bridgelabz.stackandqueue;

public class LinkedList<T> {

	Node<T> head;

	/**
	 * add elements to the linked list
	 * 
	 * @param data
	 */
	public void add(T data) {
		Node<T> newNode = new Node<>();
		newNode.data = data;
		if (head == null) {
			head = newNode;
		} else {
			Node<T> node = head;
			while (node.next != null) {
				node = node.next;
			}
			node.next = newNode;
		}
	}

	/**
	 * Inserts the element at the starting of the linked list
	 * 
	 * @param data
	 */
	public void addAtStart(T data) {
		Node<T> newNode = new Node<>();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}

	/**
	 * Current node should not be null and it is pointing to the next should be null
	 */
	public void show() {
		Node<T> node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}

	/**
	 * Inserts the specific element in between of two elements
	 * 
	 * @param index
	 * @param data
	 */
	public void addAtIndex(int index, T data) {
		Node<T> newNode = new Node<>();
		newNode.data = data;

		if (index == 0) {
			addAtStart(data);
		} else {
			Node<T> node = head;
			for (int i = 0; i < index - 1; i++) {
				node = node.next;
			}
			newNode.next = node.next;
			node.next = newNode;
		}
	}
	

	/**
	 * It removes the first element present in the Linked list
	 */
	public void pop() {
		if (null != head) {
			Node<T> newHead = head.next;
			head = newHead;
		}
	}

	/**
	 * It removes the last element present in the Linked List
	 */
	public void popLast() {
		Node<T> node = head;
		Node<T> secondlastNode = head;
		while (node.next != null) {
			secondlastNode = node;
			node = node.next;
		}
		secondlastNode.next = null;
	}

	/**
	 * Checks key value is present or not and if present at which position
	 * 
	 * @param data
	 * @return the index at which the key value is found
	 */
	public int searchWithValue(T data) {
		Node<T> node = head;
		int index = 0;
		if (node != null) {
			while ((node.next != null) || (node.data != null)) {
				if (node.data == data) {
					break;
				}
				node = node.next;
				if (node == null) {
					return -1;
				}
				index++;
			}
		}
		return index;
	}

	/**
	 * It removes the element at the specific index
	 * 
	 * @param index
	 */
	public void remove(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node<T> node = head;
			Node<T> secondLastNode = null;
			for (int i = 0; i < index - 1; i++) {
				node = node.next;
			}
			secondLastNode = node.next;
			node.next = secondLastNode.next;
		}
	}

	/**
	 * It gives the size of the linked list
	 * 
	 * @return 
	 */
	public int size() {
		Node<T> node = head;
		int count = 0;
		if (node != null) {
			while ((node.next != null) || (node.data != null)) {
				node = node.next;
				count++;
				if (node == null) {
					break;
				}
			}
		}
		return count;
	}
	

}
