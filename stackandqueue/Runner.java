package com.bridgelabz.stackandqueue;

public class Runner {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.show();
		System.out.println(stack.peek()+ "peek");
		System.out.println("\n"+stack.pop()+"pop");
		System.out.println(stack.peek()+"peek");
		System.out.println("\n"+stack.pop()+"pop");
		System.out.println(stack.peek()+"peek");
		System.out.println("\n"+stack.pop()+"pop");
		
		stack.pop();
		stack.show();
	}

}
