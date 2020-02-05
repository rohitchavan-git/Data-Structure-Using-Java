package queue;

public class QueueArrayListMain {

	public static void main(String[] args) {

		QueueArrayList queue = new QueueArrayList();
		
		queue.enqueue(10);
		queue.enqueue(11);
		queue.enqueue(12);
		queue.enqueue(13);
		queue.enqueue(14);
		queue.showQueue();

		System.out.println("Dequeue ="+queue.dequeue());
		queue.showQueue();
		System.out.println("Dequeue="+queue.dequeue());
		queue.showQueue();
		System.out.println("Dequeue ="+queue.dequeue());
		System.out.println("Dequeue ="+queue.dequeue());
		queue.showQueue();
		System.out.println("Dequeue ="+queue.dequeue());
		queue.showQueue();
		
	}

}
