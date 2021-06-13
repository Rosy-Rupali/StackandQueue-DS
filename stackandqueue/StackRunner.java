package com.bridgelabz.stackandqueue;

public class StackRunner {

	public static void main(String[] args) {
		Stack<Integer> numberList = new Stack<Integer>();
        numberList.push(70);
        numberList.push(30);
        numberList.push(56);
        numberList.show();
        System.out.println();
        
        while(numberList.peek() != null) {
        	System.out.println("Top most element of the stack is: "+numberList.peek());
        	numberList.pop();
        	numberList.show();
        }
	}

}
