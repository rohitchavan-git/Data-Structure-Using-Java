package hashing;

import java.util.NoSuchElementException;

import utilNode.Node;

/**
 * 
 * @author Rohit
 * 
 * Mostly popular Hashing technique for avoiding Collision.
 *        1.Chaining
 *        		Internal Data Structure=Array of Linked list. 
 *        2.Open Addressing
 *         		-Linear Probing -Quadratic Probing .
 *         		-Double Hashing Here we are using Chaining technique .
 *  In Hashing package we are providing :=> 
 *  	 -Chaining Using Custom class (Current) 
 *       -Create Custom HashMap class.
 *       -Create Custom HashSet class.
 */
public class HashingChainTech {

	private Node HashTable[];
	private int size;

	public HashingChainTech() {
		this.size = 10;
		this.HashTable = new Node[10];
	}

	public HashingChainTech(int size) {
		this.size = size;
		this.HashTable = new Node[this.size];
	}

	public void put(int data) {
		insertInTable(data);
	}

	private void insertInTable(int data) {
		int index = getHashCode(data);
		if (this.HashTable[index] == null)
			this.HashTable[index] = new Node(null, data);
		else {
			// insert at beginning in linked list
			this.insertNodeAtBeg(data, index);
		}
	}

	private int getHashCode(int data) {
		return data % size;
	}

	private boolean isDataPresentAtIndex(int index, int data) {
		Node nodeAtIndex = this.HashTable[index];
		if (nodeAtIndex != null) {
			if (nodeAtIndex.getData() == data) {
				return true;
			} else {
				return isPresentInList(data, nodeAtIndex);
			}
		}
		return false;
	}

	private boolean isPresentInList(int data, Node node) {
		if (node == null)
			return false;
		if (node.getData() == data)
			return true;
		else
			return isPresentInList(data, node.getNext());
	}

	private void insertNodeAtBeg(int data, int index) {
		Node newNode = new Node(null, data);
		newNode.setNext(this.HashTable[index]);
		this.HashTable[index] = newNode;
	}

	public boolean contains(int data) {
		return this.isDataPresentAtIndex(getHashCode(data), data);
	}

	public void showHashTable() {
		System.out.println();
		for (int i = 0; i < this.size; i++) {
			System.out.print("table[" + i + "] = ");
			Node table = this.HashTable[i];
			while (table != null) {
				System.out.print(table.getData() + "->");
				table = table.getNext();
			}
			System.out.println("null");
		}
	}

	public void remove(int data) {
		Node tempNode = this.HashTable[getHashCode(data)];
		if (tempNode == null) {
			throw new NoSuchElementException(data + " is not present .");
		} else {
			while (tempNode.getNext() != null) {
				if (tempNode.getNext().getData() == data) {
					tempNode.setNext(tempNode.getNext().getNext());
					return;
				}
				tempNode = tempNode.getNext();
			}
			throw new NoSuchElementException(data + " is not present .");
		}
	}
	
	public void makeHashEmpty() {
		
	}

}
