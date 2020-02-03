package stack;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.NoSuchElementException;
/**
 * 
 * @author Rohit
 * Stack Implementation using LinkedList Collection Class.
 * (simple and self explanatory code)
 */
public class StackLink implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	private LinkedList<Integer> stack;
	private int size;

	public StackLink() {
		this.stack=new LinkedList<>();
		this.size=5;
	}

	public StackLink(int size) {
		this.stack = new LinkedList<>();
		this.size = size;
	}
	
	public void push(int data) {
		addElement(data);
	}
	
	private void addElement(int data) {
		if(isFull()) {
			throw new NoSuchElementException("OVERFLOW EXCEPTION");
		}
		stack.addFirst(data);
	}
	
	public int peek() {
		return getLast();
	}
	private int getLast() {
		if(underflow())
			throw new NoSuchElementException("UNDERFLOW EXCEPTION");
		return stack.getFirst();
	}
	
	public int pop() {
		return removeFormStack();
	}
	private int removeFormStack() {
		if(underflow())
			throw new NoSuchElementException("UNDERFLOW EXCEPTION");
		return stack.removeFirst();
	}
	public boolean underflow() {
		return stack.isEmpty();
	}
	public boolean overflow() {
		return this.isFull();
	}
	private boolean isFull() {
		return stack.size() == this.size;
	}

	public void showStack() {
		if(underflow())
			throw new NoSuchElementException("UNDERFLOW EXCEPTION");
		stack.stream().forEach(System.out::println);
	}
	
	@Override
	public String toString() {
		return "StackLink [stack=" + stack + ", size=" + size + "]";
	}
}
