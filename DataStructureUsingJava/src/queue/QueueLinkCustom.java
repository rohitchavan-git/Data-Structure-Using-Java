package queue;

import java.io.Serializable;
import java.util.NoSuchElementException;

import utilNode.Node;

public class QueueLinkCustom implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;
	private Node front;
	private Node rear;
	private int size;
	private int count;

	public QueueLinkCustom() {
		this.size = 5;
		this.count = 0;
		this.front = null;
		this.rear = null;
	}

	public QueueLinkCustom(int size) {
		this.size = size;
		this.count = 0;
		this.front = null;
		this.rear = null;
	}

	public void enqueue(int data) {
		
	}

	private Node getNewNode(int data) {
		return new Node(null, data);
	}

}
