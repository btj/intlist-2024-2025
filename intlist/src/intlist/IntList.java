package intlist;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Elke instantie van deze klasse slaat een reeks int-waarden op.
 */
public class IntList {
	
	/**
	 * @invar | elements != null
	 * 
	 * @representationObject
	 */
	private int[] elements;
	
	/**
	 * @creates | result
	 * @post | result != null
	 */
	public int[] getElements() { return elements.clone(); }
	
	/**
	 * @post | result == getElements().length
	 */
	public int getLength() { return elements.length; }
	
	/**
	 * @pre | 0 <= index && index < getLength()
	 * @post | result == getElements()[index]
	 */
	public int getElementAt(int index) { return elements[index]; }

	/**
	 * @post | getLength() == 0
	 */
	public IntList() { elements = new int[] {}; }
	
	/**
	 * @mutates | this
	 * @post | getLength() == old(getLength()) + 1
	 * @post | getElementAt(old(getLength())) == element
	 * @post | IntStream.range(0, old(getLength())).allMatch(i -> getElementAt(i) == old(getElements())[i])
	 */
	public void add(int element) {
//		int[] newElements = new int[elements.length + 1];
//		for (int i = 0; i < elements.length; i++)
//			newElements[i] = elements[i];
//		System.arraycopy(elements, 0, newElements, 0, elements.length);
		
		elements = Arrays.copyOf(elements, elements.length + 1);
		elements[elements.length - 1] = element;
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
		
		elements = Arrays.copyOf(elements, elements.length - 1);
	}
}
