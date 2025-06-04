package tree;

import java.io.Serializable;
import java.util.Stack;

/**
 * 
 * @author rohit 
 * implement binary search tree data structure in java
 *
 */
public class BSTree implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	private class Node {
		private int data;
		private Node leftChild;
		private Node rightChild;

		public Node(int data) {
			this.data = data;
		}
	};

	private Node root;
	private int count;

	private int getCount() {
		return count;
	}

	public void add(int data) {
		this.root = add(data, this.root);
	}

	private Node add(int data, Node root) {
		if (root == null) {
			root = getNode(data);
			count++;
		} else {
			if (data < root.data)
				root.leftChild = add(data, root.leftChild);
			else
				root.rightChild = add(data, root.rightChild);
		}
		return root;
	}

	private Node getNode(int data) {
		return new Node(data);
	}

	public boolean search(int data) {
		if (getLength() == 0)
			return false;
		return search(data, this.root);
	}

	private boolean search(int data, Node root) {
		if (root == null)
			return false;
		if (root.data == data)
			return true;
		if (data < root.data)
			return search(data, root.leftChild);
		else
			return search(data, root.rightChild);
	}

	public void inorder() {
		inorder(this.root);
	}

	private void inorder(Node root) {
		if (root != null) {
			inorder(root.leftChild);
			System.out.print(root.data + " ");
			inorder(root.rightChild);
		}
	}

	public void preorder() {
		preorder(this.root);
	}

	private void preorder(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preorder(root.leftChild);
			preorder(root.rightChild);
		}

	}

	public void postorder() {
		postorder(this.root);
	}

       private void postorder(Node root) {
               if (root != null) {
                       postorder(root.leftChild);
                       postorder(root.rightChild);
                       System.out.print(root.data + " ");
               }
       }

	public int getLength() {
		return this.getCount();
	}

	public void preorderIte() {
		Stack<Node> stack = new Stack<>();
		if (this.root == null)
			throw new IllegalStateException("Tree is Empty.");
		else {
			Node currentNode = this.root;
			while (!stack.isEmpty() || currentNode != null) {
				if (currentNode != null) {
					System.out.print(currentNode.data + " ");
					stack.push(currentNode);
					currentNode = currentNode.leftChild;
				} else {
					currentNode = stack.pop();
					currentNode = currentNode.rightChild;
				}
			}
		}
	}

	public int getMin() {
		if (getLength() == 0)
			throw new IllegalStateException("Tree is Empty");
		if (getLength() == 1)
			return this.root.data;

		return getMin(this.root);
	}

	private int getMin(Node root) {
		Node currentNode = root;
		if (currentNode.leftChild == null)
			return currentNode.data;
		return getMin(currentNode.leftChild);
	}

	public int getMax() {
		if (getLength() == 0)
			throw new IllegalStateException("Tree is Empty");
		if (getLength() == 1)
			return this.root.data;

		return getMax(this.root);
	}

	private int getMax(Node root) {
		if (root.rightChild == null)
			return root.data;
		return getMax(root.rightChild);
	}

}
