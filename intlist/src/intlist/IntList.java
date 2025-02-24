package intlist;

import java.util.stream.IntStream;

/**
 * Elke instantie van deze klasse slaat een reeks int-waarden op.
 */
public class IntList {
	
	private class Node {
		int element;
		Node next;
		
		Node(int element, Node next) {
			this.element = element;
			this.next = next;
		}
	}
	
	private Node getNodeAt(int index) {
		Node n = head;
		while (index > 0) {
			index--;
			n = n.next;
		}
		return n;
	}
	
	/**
	 * @invar | 0 <= size
	 * @invar | IntStream.range(0, size).allMatch(i -> getNodeAt(i) != null)
	 * @invar | getNodeAt(size) == null
	 */
	private int size;
	/**
	 * @representationObjects | IntStream.range(0, size).mapToObj(i -> getNodeAt(i)).toArray()
	 */
	private Node head;
	
	/**
	 * @creates | result
	 * @post | result != null
	 */
	public int[] getElements() {
		int[] result = new int[size];
		Node n = head;
		for (int i = 0; i < size; i++) {
			result[i] = n.element;
			n = n.next;
		}
		return result;
	}
	
	/**
	 * @post | result == getElements().length
	 */
	public int getLength() {
		return size;
	}
	
	/**
	 * @pre | 0 <= index && index < getLength()
	 * @post | result == getElements()[index]
	 */
	public int getElementAt(int index) { return getNodeAt(index).element; }

	/**
	 * @post | getLength() == 0
	 */
	public IntList() {
		size = 0;
		head = null;
	}
	
	/**
	 * @mutates | this
	 * @post | getLength() == old(getLength()) + 1
	 * @post | getElementAt(old(getLength())) == element
	 * @post | IntStream.range(0, old(getLength())).allMatch(i -> getElementAt(i) == old(getElements())[i])
	 */
	public void add(int element) {
		if (head == null)
			head = new Node(element, null);
		else
			getNodeAt(size - 1).next = new Node(element, null);
		size++;
	}
	
	/**
	 * @throws IllegalStateException | getLength() == 0
	 * @mutates | this
	 * @post | getLength() == old(getLength()) - 1
	 * @post | IntStream.range(0, getLength()).allMatch(i -> getElementAt(i) == old(getElements())[i])
	 */
	public void removeLast() {
		if (getLength() == 0)
			throw new IllegalStateException("The IntList object is empty");
		
		if (size == 1)
			head = null;
		else
			getNodeAt(size - 2).next = null;
		size--;
	}
}
