package stack;

public class StackArrMain {

	public static void main(String[] args) {
		StackArr stack=new StackArr();
		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.push(15);
		stack.push(16);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println("is it underflow ="+stack.isUnderFlow());
		System.out.println("is it overflow ="+stack.isOverFlow());
	}

}
