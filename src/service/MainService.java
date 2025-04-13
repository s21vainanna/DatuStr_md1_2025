package service;

import datastr.MyDeque;
import datastr.MyQueue;
import datastr.MyStack;
import model.Student;

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
		
		MyDeque<Integer> deque = new MyDeque<>();
		deque.addToFront(55);
		deque.addToFront(23);
		deque.addToRear(100);
		deque.addToRear(48);
		deque.addToRear(77);
		deque.print();
		System.out.println("Deleted deque element: " + deque.removeFromRear());
		System.out.println("Deque size: " + deque.size());
		deque.print();
		deque.makeEmpty();
		System.out.println("------I EMPTIED THE DEQUE!---------");
		System.out.println("Is deque empty? " + deque.isEmpty());
		
		Student s1 = new Student("Anna", "Smith", new int[]{8, 9, 10});
		Student s2 = new Student("John", "Doe", new int[]{6, 7, 7});
		Student s3 = new Student("Emma", "Brown", new int[]{10, 10, 9});
		
		MyStack<Student> studentStack = new MyStack<>();
		studentStack.push(s1);
		studentStack.push(s2);
		studentStack.push(s3);
		studentStack.print();
		System.out.println("Top student: " + studentStack.top());
		System.out.println("Stack size: " + studentStack.size());
		studentStack.pop();
		studentStack.print();
		studentStack.makeEmpty();
		System.out.println("Stack empty? " + studentStack.isEmpty());
		
		MyQueue<Student> studentQueue = new MyQueue<>();
		studentQueue.addToRear(s1);
		studentQueue.addToRear(s2);
		studentQueue.addToRear(s3);
		studentQueue.print();
		System.out.println("Removed from queue: " + studentQueue.removeFromFront());
		System.out.println("Queue size: " + studentQueue.size());
		studentQueue.print();
		studentQueue.makeEmpty();
		System.out.println("Queue empty? " + studentQueue.isEmpty());
		
		MyDeque<Student> studentDeque = new MyDeque<>();
		studentDeque.addToFront(s1);
		studentDeque.addToRear(s2);
		studentDeque.addToRear(s3);
		studentDeque.print();
		System.out.println("Removed from rear: " + studentDeque.removeFromRear());
		System.out.println("Deque size: " + studentDeque.size());
		studentDeque.print();
		studentDeque.makeEmpty();
		System.out.println("Deque empty? " + studentDeque.isEmpty());
		
	}

}
