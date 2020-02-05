package queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class QueueLink {

	private LinkedList<Integer> queue;
	private int size;

	public QueueLink() {
		this.size = 5;
		this.queue = new LinkedList<>();
	}

	public QueueLink(int size) {
		this.size = size;
		this.queue = new LinkedList<>();
	}

	public void enqueue(int data) {
		this.isOverFlow();
		this.queue.addLast(data);
	}

	public int dequeue() {
		this.isUnderFlow();
		return this.queue.removeFirst();
	}

	public void showQueue() {
		this.isUnderFlow();
		this.queue.stream().forEach(System.out::println);
	}

	public void isOverFlow() {
		if (queueFull())
			throw new NoSuchElementException("QUEUE_FULL:Queue OverFlow");
	}

	public void isUnderFlow() {
		if (isEmpty())
			throw new NoSuchElementException("QUEUE_EMPTY:Queue Underflow");
	}

	private boolean isEmpty() {
		return this.queue.isEmpty();
	}

	private boolean queueFull() {
		return this.queue.size() == this.size;
	}

	private int getSize() {
		return size;
	}

	public int size() {
		return this.getSize();
	}

}
