package linkedList;

import java.io.Serializable;

/**
 * @author Rohit
 */
public class SLList implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	/**
	 * @author Rohit Node= |data|next|
	 *
	 */
	private class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}
	};

	private Node head;
	private int count;

	private int getCount() {
		return count;
	}

	/**
	 * 
	 * @param data
	 * @return new Node Ref.
	 */
	private Node getNode(int data) {
		return new Node(data);
	}

	/**
	 * data new Node in the Linked List.
	 * 
	 * @param data
	 */
	public void add(int data) {
		if (isListEmpty()) {
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

	/**
	 * number of nodes in linked list.
	 * 
	 * @return
	 */
	public int size() {
		return this.getCount();
	}

	/**
	 * Dispaly List.
	 */
	public void showList() {
		if (isListEmpty())
			throw new IllegalStateException("List is Empty.");

		showList(this.head);
	}

	private void showList(Node currentNode) {
		if (currentNode != null) {
			System.out.println(currentNode.data+"->");
			this.showList(currentNode.next);
		}
	}

	/**
	 * element is present in list or not.
	 */
	public boolean search(int data) {
		if (this.getCount() == 0)
			return false;
		return search(data, this.head);
	}

	private boolean search(int data, Node currentNode) {
		if (currentNode == null)
			return false;
		if (currentNode.data == data)
			return true;
		return search(data, currentNode.next);
	}

	/**
	 * Reverse Linked List using Recursion.
	 */
	public void revList() {
		this.revList(null, this.head);
	}

	private void revList(Node currentNode, Node nextNode) {
		if (nextNode == null)
			this.head = currentNode;

		if (nextNode != null) {
			revList(nextNode, nextNode.next);
			nextNode.next = currentNode;
		}
	}

	/**
	 * Insert at start.
	 */
	public void addBeg(int data) {
		addAtBeg(data);
	}

	private void addAtBeg(int data) {
		Node newNode = getNode(data);
		if (isListEmpty())
			this.head = newNode;
		else {
			newNode.next = this.head;
			this.head = newNode;
		}
	}

	/**
	 * Insert at give location.
	 * 
	 * @param loc
	 * @param data
	 */
	public void addAtIndex(int loc, int data) {
		Node nodeAtLoc = nodeAtIndex(loc);
		Node newNode = getNode(data);
		newNode.next = nodeAtLoc.next;
		nodeAtLoc.next = newNode;

	}

	private Node nodeAtIndex(int loc) {
		if (isListEmpty())
			throw new IllegalStateException("List is Empty.");
		if (loc > this.getCount())
			throw new IllegalStateException("Invaild Location for inserting element.");
		Node currentNode = this.head;
		for (int i = 0; i < loc; i++) {
			currentNode = currentNode.next;
		}
		return currentNode;
	}

	/**
	 * Is List Empty
	 * 
	 * @return
	 */
	private boolean isListEmpty() {
		return this.head == null;
	}

	/**
	 * data at index.
	 * 
	 * @param index
	 * @return
	 */
	public int get(int index) {
		return this.nodeAtIndex(index).data;
	}
}
