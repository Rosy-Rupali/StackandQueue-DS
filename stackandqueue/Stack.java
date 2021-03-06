/************************************************************
 * Purpose Implementation Of Stack 
 * @author Rosy Rupali
 * @Version 1.0
 * @since 13-06-2021
 *
 ************************************************************/
package com.bridgelabz.stackandqueue;

public class Stack<T> {

	 LinkedList<T> numberList = new LinkedList<T>();

	    /**
	     * It is used to add elements to the stack
	     *
	     * @param data 
	     */
	    public void push(T data) {
	        numberList.addAtStart(data);
	    }
	    
	    /**
	     * It is used to find the first element in stack
	     * @return
	     */
	    public T peek() {
	    	return numberList.peek();
	    }
	    
	    /**
	     * It removes the top most element of the stack
	     */
	    public void pop() {
	    	numberList.pop();
	    }

	    /**
	     * It is used to display the elements in the stack
	     */
	    public void show() {
	        numberList.show();
	    }
}
