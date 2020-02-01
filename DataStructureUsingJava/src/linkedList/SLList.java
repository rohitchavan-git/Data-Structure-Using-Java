package linkedList;

import java.io.Serializable;

public class SLList implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	private class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}
	};

	private Node head;
	private int count;

	private int getCount() {
		return count;
	}

	private Node getNode(int data) {
		return new Node(data);
	}

	public void add(int data) {
		if (this.head == null) {
			this.head = this.getNode(data);
			count++;
			return;
		}
		this.head = add(data, this.head);
	}

	private Node add(int data, Node currentNode) {
		if (currentNode.next == null) {
			currentNode.next = this.getNode(data);
			this.count++;

		} else
			currentNode.next = add(data, currentNode.next);
		return currentNode;
	}

	public int size() {
		return this.getCount();
	}

	public void showList() {
		showList(this.head);
	}

	private void showList(Node currentNode) {
		if (currentNode != null) {
			System.out.println(currentNode.data);
			this.showList(currentNode.next);
		}
	}

	public boolean search(int data) {
		if (this.getCount() == 0)
			return false;
		return search(data,this.head);
	}
	private boolean search(int data,Node currentNode) {
		if(currentNode == null)
			return false;
		if(currentNode.data == data)
			return true;
		return search(data, currentNode.next);
	}
}
