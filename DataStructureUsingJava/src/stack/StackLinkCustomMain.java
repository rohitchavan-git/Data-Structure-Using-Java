package stack;

public class StackLinkCustomMain {
	public static void main(String[] args) {
		
		StackLinkCustom stack=new StackLinkCustom();
		stack.push(10);
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.push(15);
		
		System.out.println(stack.peek());
		System.out.println("__________________");
		stack.showStack();
		System.out.println("poped element =>"+stack.pop());
		System.out.println("__________________");
		stack.showStack();
	}
}
