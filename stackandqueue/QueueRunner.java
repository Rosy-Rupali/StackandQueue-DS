package com.bridgelabz.stackandqueue;

public class QueueRunner {

	public static void main(String[] args) {
		Queue<Integer> numberList = new Queue<Integer>();
		numberList.enqueue(56);
		numberList.enqueue(70);
		numberList.enqueue(30);
		numberList.show();
		System.out.println("Before removing any element");
		System.out.println();
		numberList.dequeue();
		System.out.println("After removing elements from queue");
		numberList.show();

	}

}
