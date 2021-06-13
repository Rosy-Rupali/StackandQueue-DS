/************************************************************
 * Purpose Implementation Of Stack and Oueue 
 * @author Rosy Rupali
 * @Version 1.0
 * @since 13-06-2021
 *
 ************************************************************/
package com.bridgelabz.stackandqueue;

public class Stack {

	int stack[] = new int[5];
	int top = 0;

	/**
	 * Pushed the elements
	 * 
	 * @param data
	 */
	public void push(int data) {
		if(isFull()) {
			System.out.println("Stack is overflow");
		}else {
			stack[top] = data;
			top++;
		}
	}

	private boolean isFull() {
		return top == stack.length;
	}

	/**
	 * Printing the elements of stack
	 */
	public void show() {
		for(int number : stack) {
			System.out.println(number+" ");
		}
	}
	
	/**
	 * peek of element is been performed
	 * @return
	 */
	public int peek() {
		int data;
		data = stack[top -1];
		return data;
	}
	
	/**
	 * pop of element is been performed
	 * @return
	 */
	public int pop() {
		int data = 0;
		if(isEmpty()) {
			System.out.println("Stack is underflow");
		}else {
			top--;
			data = stack[top];
			stack[top] = 0;
			return data;
		}
		return data;
	}
	
	/**
	 * It is use to get the size
	 * @return
	 */
	public int size() {
		return top;
	}

	private boolean isEmpty() {
		return top == 0;
	}
}
