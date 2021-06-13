/************************************************************
 * Purpose Implementation Of Oueue 
 * @author Rosy Rupali
 * @Version 1.0
 * @since 13-06-2021
 *
 ************************************************************/
package com.bridgelabz.stackandqueue;

public class Queue<T> {
	LinkedList<T> numberList = new LinkedList<>();
	
	/**
	 * It is use to add elements in the queue
	 * @param data
	 */
	public void enqueue(T data) {
		numberList.add(data);
	}
	/**
	 * It prints all the elements present in the queue
	 */
	public void show() {
		numberList.show();
	}
	
}
