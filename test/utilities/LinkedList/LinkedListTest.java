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
		LinkedList<String> list = new LinkedList<String>();
		list.addToFront("hello");
		list.addToFront("world");
		list.addToFront("pizza");
		list.addToFront(null);
		assertTrue(list.contains("pizza"));
		assertTrue(list.contains("hello"));
		assertTrue(list.contains("world"));
		assertFalse(list.contains(null));
		

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
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addToBack(1);
		list.addToBack(2);
		list.addToBack(3);
		assertEquals(list.size(), 3);
		assertTrue(list.contains(1));
		assertTrue(list.contains(2));
		assertTrue(list.contains(3));

	}

	@Test
	void testToString() {

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addToBack(1);
		list.addToBack(2);
		list.addToBack(3);
		assertEquals(list.toString(), "1, 2, 3");
		
	}

	@Test
	void testReverse() {

		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.addToBack(1);
		list.addToBack(2);
		list.addToBack(3);
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		list2.addToFront(1);
		list2.addToFront(2);
		list2.addToFront(3);
		list.reverse();
		
		assertEquals(list.toString(), list2.toString());
		
		list.clear();
		list2.clear();
		
		for (int i = 0; i < 100; i++) {
			list.addToBack(i);
			list2.addToFront(i);
		}
		list.reverse();
		assertEquals(list.toString(), list2.toString());
	}

}
