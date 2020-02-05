package queue;

public class QueueLinkMain {

	public static void main(String[] args) {
		QueueLink queue = new QueueLink();
		queue.enqueue(10);
		queue.enqueue(11);
		queue.enqueue(12);
		queue.enqueue(13);
		queue.enqueue(14);

		queue.showQueue();
		System.out.println("after dequeue " + queue.dequeue());

		queue.showQueue();
	}
}
