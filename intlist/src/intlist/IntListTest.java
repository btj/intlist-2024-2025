package intlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntListTest {

	@Test
	void test() {
		IntList myIntList = new IntList();
		assertArrayEquals(new int[] {}, myIntList.getElements());
		assertEquals(0, myIntList.getLength());
		
		myIntList.add(10);
		assertArrayEquals(new int[] {10}, myIntList.getElements());
		assertEquals(1, myIntList.getLength());
		assertEquals(10, myIntList.getElementAt(0));
		
		myIntList.add(20);
		assertArrayEquals(new int[] {10, 20}, myIntList.getElements());
		assertEquals(2, myIntList.getLength());
		assertEquals(10, myIntList.getElementAt(0));
		assertEquals(20, myIntList.getElementAt(1));
		
		myIntList.removeLast();
		assertArrayEquals(new int[] {10}, myIntList.getElements());
		assertEquals(1, myIntList.getLength());
		assertEquals(10, myIntList.getElementAt(0));
	}

}
