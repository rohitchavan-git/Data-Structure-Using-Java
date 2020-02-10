package hashing;

import java.io.Serializable;
import java.util.NoSuchElementException;
/**
 * 
 * @author Rohit
 * Custom HashMap
 *
 */
public class HashMapCustom implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	private class NodeEntry {
		private String key;
		private String value;
		private NodeEntry nextNode;

		public NodeEntry(String key, String value) {
			this.key = key;
			this.value = value;
		}

		public NodeEntry(String key, String value, NodeEntry entryNode) {
			this.key = key;
			this.value = value;
			this.nextNode = entryNode;
		}

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public NodeEntry getNextNode() {
			return nextNode;
		}

		public void setNextNode(NodeEntry entryNode) {
			this.nextNode = entryNode;
		}

	};

	private NodeEntry hashmap[];
	private Integer TABLE_SIZE;

	public HashMapCustom() {
		this.TABLE_SIZE = 10;
		this.hashmap = new NodeEntry[10];
	}

	public HashMapCustom(Integer size) {
		this.TABLE_SIZE = size;
		this.hashmap = new NodeEntry[size];
	}

	public void put(String key, String value) {
		addNewNodeInHash(key, value);
	}

	private void addNewNodeInHash(String key, String value) {
		NodeEntry newEntryNode = new NodeEntry(key, value);
		int index = getHashCode(key) % this.TABLE_SIZE;
		addEntryNodeAtIndex(newEntryNode, index);
	}

	private void addEntryNodeAtIndex(NodeEntry newEntryNode, int index) {
		if (this.hashmap[index] == null) {
			this.hashmap[index] = newEntryNode;
		} else {
			NodeEntry currentStartNode = this.hashmap[index];
			newEntryNode.setNextNode(currentStartNode);
			this.hashmap[index] = newEntryNode;
		}
	}

	private int getHashCode(String key) {
		int hashCode = key.hashCode();
		hashCode %= this.TABLE_SIZE;
		if (hashCode < 0)
			hashCode += this.TABLE_SIZE;
		return hashCode;
	}

	/**
	 * It will return latest value of key
	 * 
	 * @param key
	 * @return
	 */
	public String get(String key) {
		NodeEntry entryNode = getEntryNode(key);
		if (entryNode == null)
			throw new NoSuchElementException("Key is not present");
		return entryNode.getValue();
	}

	/**
	 * It will return latest Node of key
	 * 
	 * @param key
	 * @return
	 */
	private NodeEntry getEntryNode(String key) {
		int index = getHashCode(key);
		if (this.hashmap[index] == null)
			return null;
		return this.hashmap[index];
	}

	public void printTable() {

		printTable(this.hashmap);
	}

	private void printTable(NodeEntry[] tempHashMap) {

		for (int i = 0; i < this.TABLE_SIZE; i++) {
			if (tempHashMap[i] != null) {
				System.out.print("HashTable[" + i + "] = key: " + tempHashMap[i].getKey() + " value : ");
				NodeEntry currentEntryNode = tempHashMap[i];
				while (currentEntryNode != null) {
					System.out.print(currentEntryNode.getValue() + " ,");
					currentEntryNode = currentEntryNode.getNextNode();
				}
				System.out.println();
			} else {
				System.out.println("HashTable[" + i + "] = null");
			}
		}

	}
}
