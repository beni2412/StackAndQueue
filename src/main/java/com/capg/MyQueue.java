package com.capg;

public class MyQueue {
	private final MyLinkedList myLinkedList;

	public MyQueue() {
		this.myLinkedList = new MyLinkedList();
	}

	public void enqueue(INode node) {
		myLinkedList.addEnd(node);
	}

	public void print() {
		myLinkedList.print();
	}
}
