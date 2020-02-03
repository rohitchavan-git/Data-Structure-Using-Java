package stack;

public class StackLinkMain {

	public static void main(String[] args) {
		StackLink stack=new StackLink();
		stack.push(10);
		stack.push(11);
		stack.push(12);
		stack.push(13);		
		stack.push(14);
		stack.showStack();
		System.out.println("Element at Top =>"+stack.peek());
		System.out.println("pop element =>"+stack.pop());
		stack.showStack();
	}
}
