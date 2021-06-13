/************************************************************
 * Purpose Implementation Of Stack and Oueue
 * @author Rosy Rupali
 * @Version 1.0
 * @since 13-06-2021
 *
 ************************************************************/
package com.bridgelabz.stackandqueue;

public class Stack<T> {

	LinkedList<T> list = new LinkedList<>();

	/**
	 * Pushed the elements
	 * 
	 * @param data
	 */
	public void push(T data) {
		list.addAtStart(data);
	}

	/**
	 * Printing the elements present in an array
	 */
	public void show() {
		list.show();
	}
}
