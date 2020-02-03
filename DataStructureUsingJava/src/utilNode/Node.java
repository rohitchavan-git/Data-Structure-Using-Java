package utilNode;

/**
 * 
 * @author Rohit 
 * Node class (Simple POJO)
 *
 */
public class Node {

	private Node next;
	private int data;

	public Node() {
		this.next = null;
		this.data = 0;
	}

	public Node(Node next, int data) {
		this.next = next;
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}
