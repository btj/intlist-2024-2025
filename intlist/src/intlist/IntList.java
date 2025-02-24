package intlist;

import java.util.stream.IntStream;

/**
 * Elke instantie van deze klasse slaat een reeks int-waarden op.
 */
public class IntList {
	
	/**
	 * @creates | result
	 * @post | result != null
	 */
	public int[] getElements() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @post | result == getElements().length
	 */
	public int getLength() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @pre | 0 <= index && index < getLength()
	 * @post | result == getElements()[index]
	 */
	public int getElementAt(int index) { throw new RuntimeException("Not yet implemented"); }

	/**
	 * @post | getLength() == 0
	 */
	public IntList() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @mutates | this
	 * @post | getLength() == old(getLength()) + 1
	 * @post | getElementAt(old(getLength())) == element
	 * @post | IntStream.range(0, old(getLength())).allMatch(i -> getElementAt(i) == old(getElements())[i])
	 */
	public void add(int element) { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @throws IllegalStateException | getLength() == 0
	 * @mutates | this
	 * @post | getLength() == old(getLength()) - 1
	 * @post | IntStream.range(0, getLength()).allMatch(i -> getElementAt(i) == old(getElements())[i])
	 */
	public void removeLast() {
		if (getLength() == 0)
			throw new IllegalStateException("The IntList object is empty");
		
		throw new RuntimeException("Not yet implemented");
	}
}
