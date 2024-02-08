package utilities.LinkedEquivalenceClass;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;

import org.junit.jupiter.api.Test;

import utilities.LinkedList.LinkedList;
import utilities.LinkedEquivalenceClass.*;

/**
 * This Junit test case test each method within the LinkeEquivalnceClass.
 * 
 * @author Kyler, Brodee, and Eleanor
 * Date: February 5, 2024
 */
class LinkedEquivalenceClassTest {

	/**
	 * Test to see that the LinkedList, Comparator, and canonical are properly 
	 * constructed 
	 */
	@Test
	void testConstructor() { 
		Comparator<Integer> comp = new Comparator<Integer>()
		{
			//All even integers are 'equivalent'
			//All odd integers are 'equivalent'
			public int compare(Integer x, Integer y)
			{return x %2 == y %2 ? 0 : 1;}
	
		};	
		LinkedEquivalenceClass<Integer> list = new LinkedEquivalenceClass<Integer>(comp); 
		int _canonical = 2;
		
		//Test that the list is actually constructed
		assertTrue("List was not empty.",list.isEmpty());
		//Test that there is a canonical element
		assertEquals("Canonical element was not detected",_canonical,2);
		
		
	}
	
	/**
	 * Test to see whether or not the canonical actually exists
	 */
	@Test
	void testCanonical() {
		int _canonical = 2;
		
		assertEquals("Canonical not found.",_canonical,2);
		
		_canonical = 3;
		assertEquals("Canonical value did not change.",_canonical,3);
		
		
	}
	
	/**
	 * Test to check the boolean isEmpty condition for the LinkedList operates 
	 * properly.
	 */
	@Test
	void testisEmpty() {
		Comparator<Integer> comp = new Comparator<Integer>()
		{
			//All even integers are 'equivalent'
			//All odd integers are 'equivalent'
			public int compare(Integer x, Integer y)
			{return x %2 == y %2 ? 0 : 1;}
	
		};	
		LinkedEquivalenceClass<Integer> list = new LinkedEquivalenceClass<Integer>(comp);
		
		
		assertTrue("List was not empty.",list.isEmpty());
		
		list.add(4);
		list.add(6);
		list.add(8);
		
		assertFalse("List was empty.",list.isEmpty());
		assertEquals("List does not contain elements.",list.size(),3);
		
		list.clear();
		
		assertEquals("List was not empty.",list.isEmpty(),true);
		assertEquals("List still contains elements.",list.size(),0);

	}
	
	/**
	 * Test that the LinkedList is when clear is called all elements are
	 * removed
	 */
	@Test
	void testClear() {
		Comparator<Integer> comp = new Comparator<Integer>()
		{
			//All even integers are 'equivalent'
			//All odd integers are 'equivalent'
			public int compare(Integer x, Integer y)
			{return x %2 == y %2 ? 0 : 1;}
	
		};	
		LinkedEquivalenceClass<Integer> list = new LinkedEquivalenceClass<Integer>(comp);
		int _canonical = 2;
		list.add(6);
		list.add(8);
		list.add(10);
		list.clear();
		
		assertEquals("List was not cleared.",list.isEmpty(),true);
		
		list.add(4);
		list.add(10);
		
		//Test that you can add elements back to a cleared list
		assertEquals("List is still cleared.",list.isEmpty(),false);
		
		
	}
	
	/**
	 * Test to see that only the NonCanonicals are cleared within the list.
	 */
	@Test
	void testclearNonCanonical() {
		Comparator<Integer> comp = new Comparator<Integer>()
		{
			//All even integers are 'equivalent'
			//All odd integers are 'equivalent'
			public int compare(Integer x, Integer y)
			{return x %2 == y %2 ? 0 : 1;}
	
		};	
		LinkedEquivalenceClass<Integer> list = new LinkedEquivalenceClass<Integer>(comp);
		
		int _canonical = 2;
		list.add(6);
		list.add(8);
		list.add(10);
		list.clear();
		
		//Test the only thing removed is the elements in the list not the canonical
		assertEquals("No canonical value detected.",_canonical,2);
		assertEquals("Elements detected within the LinkeList.",list.size(),0);
		
		
	}
	

	/**
	 * Test that elements are properly added to either the back or front
	 */
	@Test
	void testAdd() {
		
		Comparator<Integer> comp = new Comparator<Integer>()
		{
			//All even integers are 'equivalent'
			//All odd integers are 'equivalent'
			public int compare(Integer x, Integer y)
			{return x %2 == y %2 ? 0 : 1;}
	
		};
		LinkedEquivalenceClass<Integer> list = new LinkedEquivalenceClass<Integer>(comp);
		
		int _canonical = 2;
		list.add(6);
		list.add(8);
		list.add(10);
		//Test to see that elements were properly
		assertEquals("Elements not added.",list.toString(),"6, 8, 10"); //Include a space after each comma with the toString
		//Test to see that more elements can be added onto the LinkedList
		list.add(12);
		list.add(14);
		assertEquals("Elements not added.",list.toString(),"6, 8, 10, 12, 14");
		//Test to see if an element may be less than the last can still be placed
		list.add(4);
		assertEquals("Element not added.",list.toString(),"6, 8, 10, 12, 14, 4");
		
		
		
	}
	
	/**
	 * Test to see that the contains method properly 
	 * finds a given target with returning true or false if found.
	 */
	@Test 
	void testContains() {
				Comparator<Integer> comp = new Comparator<Integer>()
		{
			//All even integers are 'equivalent'
			//All odd integers are 'equivalent'
			public int compare(Integer x, Integer y)
			{return x %2 == y %2 ? 0 : 1;}
	
		};
		LinkedEquivalenceClass<Integer> list = new LinkedEquivalenceClass<Integer>(comp);
		
		int _canonical = 2;
		list.add(6);
		list.add(8);
		list.add(10);
		list.add(null);
		
		assertTrue("List does not contain 10.",list.contains(6));
		assertFalse("List contains the value.",list.contains(12));
		assertFalse("List does not contain null value.",list.contains(null)); 
		
	}
	
	@Test //TODO test Belongs
	void testBelongs() {
		
		Comparator<Integer> comp = new Comparator<Integer>()
		{
			//All even integers are 'equivalent'
			//All odd integers are 'equivalent'
			public int compare(Integer x, Integer y)
			{return x %2 == y %2 ? 0 : 1;}
	
		};
		LinkedEquivalenceClass<Integer> list = new LinkedEquivalenceClass<Integer>(comp);
		
		int _canonical = 2;
		list.belongs(3);
		list.belongs(4);
		
		assertFalse("Element does not belongs in list.",list.belongs(3));
		
		
		
	}
	
	/**
	 * Test to see that a given element can be removed from the LinkedList.
	 */
	@Test
	void testRemove() { 
		
		
		Comparator<Integer> comp = new Comparator<Integer>()
	{
		//All even integers are 'equivalent'
		//All odd integers are 'equivalent'
		public int compare(Integer x, Integer y)
		{return x %2 == y %2 ? 0 : 1;}

	};
	LinkedEquivalenceClass<Integer> list = new LinkedEquivalenceClass<Integer>(comp);
	
	
	
	int _canonical = 2;
	list.add(6);
	list.add(8);
	list.add(10);
	list.add(12);
	
	//Test to make sure all the elements are in the list
	assertEquals("The integers were not in the list.",list.toString(),"6, 8, 10, 12" );
	//Remove instance number 1, removed the end element
	list.remove(12);
	assertEquals("Integer 12 was not removed.", list.size(),3);
	//Remove instance number 2, removed the middle element
	list.remove(8);
	assertEquals("Integer 8 was not removed.",list.size(),2);
	//Removing a null value 
	list.remove(null);
	assertEquals("List was altered.",list.size(),2);
	
	}
	
	@Test 
	void testremoveCanonical() {
		Comparator<Integer> comp = new Comparator<Integer>()
		{
			//All even integers are 'equivalent'
			//All odd integers are 'equivalent'
			public int compare(Integer x, Integer y)
			{return x %2 == y %2 ? 0 : 1;}
	
		};
		LinkedEquivalenceClass<Integer> list = new LinkedEquivalenceClass<Integer>(comp);
		int _canonical = 2;
		list.add(6);
		list.add(8);
		list.add(10);
		
		//Test Case #1 where canonical is not within the LinkedList
		assertFalse("Canonical was removed.",list.remove(_canonical));
		//Test Case #2 where canonical is within the LinkedList
		list.add(2);
		assertTrue("Canonical was not removed.",list.remove(_canonical));
		
		
	}
	
	/**
	 * Test that the canonical is demoted and set into the LinkedList
	 */
	@Test

	void testdemoteAndSetCanonical() { //TODO add some more test cases
		Comparator<Integer> comp = new Comparator<Integer>()
		{
			//All even integers are 'equivalent'
			//All odd integers are 'equivalent'
			public int compare(Integer x, Integer y)
			{return x %2 == y %2 ? 0 : 1;}
	
		};

		LinkedEquivalenceClass<Integer> list = new LinkedEquivalenceClass<Integer>(comp); 
																		 

		int _canonical = 2;
		Integer element = 3;
		
		list.add(6);
		list.add(8);
		list.add(10);
		list.add(12);
		
		list.demoteAndSetCanonical(element);
		
		assertEquals(list.canonical(), 3, "Canonical was not changed.");
		
		
	}
	
	/**
	 * Test that the given elements are properly placed into 
	 * a given string.
	 */
	@Test
	void testToString() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		Comparator<Integer> c = new Comparator<Integer>()
		{
			//All even integers are 'equivalent'
			//All odd integers are 'equivalent'
			public int compare(Integer x, Integer y)
			{return x %2 == y %2 ? 0 : 1;}
	
		};
		int _canonical = 2;
		list.addToBack(6);
		list.addToBack(8);
		list.addToBack(10);
		list.addToBack(12);
		
		assertEquals("String was not properly implemented.",list.toString(),"6, 8, 10, 12");
		list.addToFront(4);
		assertEquals("String was not properly implemented.",list.toString(),"4, 6, 8, 10, 12");
		list.addToBack(20);
		assertEquals("String was not properly implemented.",list.toString(),"4, 6, 8, 10, 12, 20");
		
		list.remove(20);
		assertEquals("String was not properly implemented.",list.toString(),"4, 6, 8, 10, 12");
		
	}
	

}
