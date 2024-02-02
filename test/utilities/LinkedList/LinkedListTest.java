package utilities.LinkedList;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class LinkedListTest {

	@Test
	void testConstructor() {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		assertTrue(list.isEmpty());
		assertEquals(list.size(),0);

	}

	@Test
	void testIsEmpty() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		assertTrue(list.isEmpty());
		list.addToFront(1);
		assertFalse(list.isEmpty());
	}

	@Test
	void testClear() {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addToFront(1);
		list.addToFront(2);
		list.addToFront(3);
		assertEquals(list.size(), 3);
		list.clear();
		assertTrue(list.isEmpty());
		assertEquals(list.size(),0);

	}

	@Test
	void testSize() {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addToFront(1);
		list.addToFront(2);
		list.addToFront(3);
		assertEquals(list.size(), 3);

	}

	@Test
	void testAddToFront() {

		LinkedList<Integer> list = new LinkedList<Integer>();
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

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addToFront(1);
		list.addToFront(2);
		list.addToFront(3);
		
		assertTrue(list.remove(1));
		assertTrue(list.remove(2));
		assertTrue(list.remove(3));
		assertTrue(list.isEmpty());
		assertEquals(list.size(),0);
		
		for (int i = 0; i < 100; i++) {
			list.addToFront(1);
		}
		for (int i = 0; i < 100; i++) {
			assertTrue(list.remove(1));
		}
		assertEquals(list.size(), 0);
		
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
