package utilities.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class LinkedListTest {

	@Test
	void testConstructor() {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		assertTrue("List not empty", list.isEmpty());
		assertEquals("Size not 0",list.size(),0);

	}

	@Test
	void testIsEmpty() {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		assertTrue("List not empty",list.isEmpty());
		
		list.addToFront(1);
		
		assertFalse("List empty",list.isEmpty());
	}

	@Test
	void testClear() {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.addToFront(1);
		list.addToFront(2);
		list.addToFront(3);
		
		assertEquals("Size not 3", list.size(), 3);
		
		list.clear();
		
		assertFalse("1 found", list.contains(1));
		assertFalse("2 found", list.contains(2));
		assertFalse("3 found", list.contains(3));
		
		assertTrue("List not empty", list.isEmpty());
		assertEquals("Size not 0", list.size(),0);

	}

	@Test
	void testSize() {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		assertEquals("Size not 0", list.size(), 0);
		
		list.addToFront(1);
		list.addToFront(2);
		list.addToFront(3);
		
		assertEquals("Size not 3", list.size(), 3);
	}

	@Test
	void testAddToFront() {

		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.addToFront(1);
		list.addToFront(2);
		list.addToFront(3);
		list.addToFront(null);
		
		assertEquals("Size not 3", list.size(), 3);
		assertTrue("1 not found", list.contains(1));
		assertTrue("2 not found", list.contains(2));
		assertTrue("3 not found",list.contains(3));
		assertFalse("null found", list.contains(null));
	}

	@Test
	void testContains() {
		LinkedList<String> list = new LinkedList<String>();
		
		list.addToFront("hello");
		list.addToFront("world");
		list.addToFront("pizza");
		
		assertEquals("Size not 3", list.size(), 3);
		assertTrue("pizza not found", list.contains("pizza"));
		assertTrue("hello not found", list.contains("hello"));
		assertTrue("world not found", list.contains("world"));
		assertFalse("null found found", list.contains(null));
		

	}

	@Test
	void testRemove() {

		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.addToFront(1);
		list.addToFront(2);
		list.addToFront(3);
		
		assertFalse("null removed", list.remove(null));
		
		assertTrue("1 not removed", list.remove(1));
		assertTrue("2 not removed", list.remove(2));
		assertTrue("3 not removed", list.remove(3));
		assertTrue("List not empty", list.isEmpty());
		assertEquals("Size not 0", list.size(),0);
		
		for (int i = 0; i < 100; i++) {
			list.addToFront(i);
		}
		for (int i = 0; i < 100; i++) {
			assertTrue("i not removed", list.remove(i));
		}
		assertEquals("Size not 0", list.size(), 0);
		
	}

	@Test
	void testAddToBack() {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.addToBack(1);
		list.addToBack(2);
		list.addToBack(3);
		list.addToBack(null);
		
		assertEquals("Size not 3", list.size(), 3);
		assertTrue("1 not found", list.contains(1));
		assertTrue("2 not found", list.contains(2));
		assertTrue("3 not found", list.contains(3));
		assertFalse(list.contains(null));
	}

	@Test
	void testToString() {

		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.addToBack(1);
		list.addToBack(2);
		list.addToBack(3);
		
		assertEquals("String not 1, 2, 3", list.toString(), "1, 2, 3");
		
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
		
		assertEquals("list not reversed", list.toString(),list2.toString());
		
		list.clear();
		list2.clear();
		
		for (int i = 0; i < 100; i++) {
			list.addToBack(i);
			list2.addToFront(i);
		}
		
		list.reverse();
		assertEquals("list not reversed", list.toString(), list2.toString());
	}

}
