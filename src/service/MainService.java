package service;

import datastr.MyQueue;
import datastr.MyStack;

public class MainService {

	public static void main(String[] args) {

		MyStack<Integer> stack = new MyStack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(66);
		stack.push(42);
		stack.print();
		System.out.println("Top element: " + stack.top());
		System.out.println("Stack size: " + stack.size());
		stack.pop();
		stack.print();
		stack.makeEmpty();
		System.out.println("------I EMPTIED THE STACK!---------");
		System.out.println("Is stack empty? " + stack.isEmpty());

		MyQueue<Integer> queue = new MyQueue<>();
		queue.addToRear(55);
		queue.addToRear(23);
		queue.addToRear(9);
		queue.addToRear(21);
		queue.print();
		System.out.println("Deleted queue element: " + queue.removeFromFront());
		System.out.println("Queue size: " + queue.size());
		queue.print();
		queue.makeEmpty();
		System.out.println("------I EMPTIED THE QUEUE!---------");
		System.out.println("Is queue empty? " + queue.isEmpty());

	}

}
