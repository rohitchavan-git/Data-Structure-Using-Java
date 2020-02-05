package queue;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
/**
 * 
 * @author Rohit
 *
 */
public class QueueArrayList implements Serializable,Cloneable {
	private static final long serialVersionUID = 1L;
	private List<Integer> queue;
	private Integer front;
	private Integer rear;
	private Integer count;
	private Integer size;

	public QueueArrayList() {
		this.queue = new ArrayList<Integer>(5);
		this.front = -1;
		this.rear = -1;
		this.count = 0;
		this.size = 5;
	}

	public QueueArrayList(int size) {
		this.queue = new ArrayList<>(size);
		this.size = size;
		this.front = -1;
		this.rear = -1;
		this.count = 0;
	}

	public void enqueue(Integer data) {
		if (fullQueue())
			throw new IllegalStateException("Queue_Full");
		else {
			if(this.rear == -1) {
				this.front++;
				this.rear++;
			}
			this.queue.add(this.rear, data);
			this.rear++;
			this.count++;
		}
	}

	public int dequeue() {
		if (emptyQueue())
			throw new NoSuchElementException("QUEUE_EMPTY.");
		int index = this.front;
		this.front++;
		this.count--;
		return this.queue.get(index);
	}

	public void showQueue() {
		if(emptyQueue())
			throw new NoSuchElementException("QUEUE_EMPTY.");
		
		for(int i=this.front;i<this.rear;i++) {
			System.out.println(queue.get(i));
		}
	}

	private boolean emptyQueue() {
		return this.rear == this.front;
	}

	private boolean fullQueue() {
		return this.rear == this.size;
	}
	public int size() {
		return this.size;
	}
}
