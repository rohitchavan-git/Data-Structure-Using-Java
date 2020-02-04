package stack;

import java.util.NoSuchElementException;

import utilNode.Node;

/**
 * 
 * @author Rohit Stack Implementation Using LinkedList
 *
 */
public class StackLinkCustom {

	private Node top;
	private int size;

	public StackLinkCustom() {
		this.size = 0;
	}

	/**
	 * Algorithm :=> 1.Stack full or Not ..Here there is no such condition 2. if top
	 * is null then create new node and assign to top 3. else set newNode->next =
	 * top top =newNode
	 * 
	 * @param data
	 */
	public void push(int data) {

		Node newNode = new Node(null, data);
		if (this.top == null)
			this.top = newNode;
		else {
			newNode.setNext(this.top);
			this.top = newNode;
		}
	}

	public int peek() {
		if (this.isEmpty())
			throw new NoSuchElementException("UNDERFLOW_EXCEPTION.");
		return this.top.getData();
	}

	public int pop() {
		if (this.isEmpty())
			throw new NoSuchElementException("UNDERFLOW_EXCEPTION.");
		int popedData = this.top.getData();
		this.top = this.top.getNext();
		return popedData;
	}

	public void showStack() {
		if (this.isEmpty())
			throw new NoSuchElementException("UNDERFLOW_EXCEPTION.");
		printStack(top);
	}

	private void printStack(Node top) {
		if (top == null)
			return;
		else {
			System.out.println(top.getData());
			printStack(top.getNext());
		}
	}

	private boolean isEmpty() {
		return this.top == null;
	}

	public int getSize() {
		return this.size;
	}

}
