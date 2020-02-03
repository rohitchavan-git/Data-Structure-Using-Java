package stack;

import java.io.Serializable;
import java.util.ArrayList;
/**
 * 
 * @author Rohit
 * Implement Stack using Array.
 */

public class StackArr implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;
	private ArrayList<Integer> stack;
	private int size;
	private int top;

	public StackArr() {
		this.stack = new ArrayList<Integer>(5);
		this.size = 5;
		this.top = 0;
	}

	public StackArr(int size) {
		this.size = size;
		this.top = 0;
		this.stack = new ArrayList<>(this.size);
	}

	private boolean isEmpty() {
		return this.top == 0;
	}

	private boolean isFull() {
		return this.top == this.size;
	}

	public void push(int data) {
		this.addData(data, this.top);
	}

	private void addData(int data, int top) {
		if (this.isFull())
			throw new IllegalStateException("Stack Full already !!");
		stack.add(top, data);
		this.top++;
	}

	public int peek() {
		return this.peekStack();
	}

	private int peekStack() {
		if (isEmpty())
			throw new IllegalStateException("Stack Empty Peek not Possible..");
		return stack.get(this.top - 1);
	}

	public int pop() {
		if (isEmpty())
			throw new IllegalStateException("Stack Empty Pop Not Possible ..");
		return this.pop(this.top);
	}

	private int pop(int localTop) {
		Integer popedItem = stack.get(localTop - 1);
		stack.remove(localTop - 1);
		this.top--;
		return popedItem;
	}
	
	public boolean isOverFlow() {
		return this.isFull();
	}
	public boolean isUnderFlow() {
		return this.isEmpty();
	}
	
	public void showStack() {
		if(this.isEmpty())
			throw new IllegalStateException("Show Stack: Invaild Task.");
		stack.stream().forEach(System.out::println);
	}
}
