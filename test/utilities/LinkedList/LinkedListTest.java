package utilities.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class LinkedListTest {

	@Test
	void testConstructor() {

	}

	@Test
	void testIsEmpty() {

	}

	@Test
	void testClear() {

	}

	@Test
	void testSize() {

	}

	@Test
	void testAddToFront() {

		LinkedList<Integer> list = new LinkedList<Integer>();
		assertTrue(list.isEmpty());
		list.addToFront(1);
		list.addToFront(2);
		list.addToFront(3);
		assertEquals(list.size(), 3);
		assertTrue(list.contains(1));
		assertTrue(list.contains(2));
		assertTrue(list.contains(3));
	}

	@Test
	void testContains() {
		
		

	}

	@Test
	void testRemove() {

	}

	@Test
	void testAddToBack() {

	}

	@Test
	void testToString() {

	}

	@Test
	void testReverse() {

	}

}
