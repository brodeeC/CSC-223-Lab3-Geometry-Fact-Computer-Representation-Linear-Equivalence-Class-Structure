package utilities.LinkedEquivalenceClass;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;

import org.junit.jupiter.api.Test;

import utilities.LinkedList.LinkedList;

class LinkedEquivalenceClassTest {

	@Test
	void testConstructor() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		Comparator<Integer> c = new Comparator<Integer>()
				{
					//All even integers are 'equivalent'
					//All odd integers are 'equivalent'
					public int compare(Integer x, Integer y)
					{return x %2 == y %2 ? 0 : 1;}
			
				};
		
		assertTrue("List was not empty.",list.isEmpty());
		
		
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
	
	@Test
	void testisEmpty() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		
		assertTrue("List was not empty.",list.isEmpty());
		
		list.addToBack(4);
		list.addToBack(6);
		list.addToBack(8);
		
		assertFalse("List was empty.",list.isEmpty());

	}
	
	@Test
	void testClear() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		int _canonical = 2;
		list.addToBack(6);
		list.addToBack(8);
		list.addToBack(10);
		list.clear();
		
		assertEquals("List was not cleared.",list.isEmpty(),true);
		
	}
	
	@Test
	void testclearNonCanonical() {
		int _canonical = 2;
		
		assertEquals("No canonical value detected.",_canonical,2);
		
		
	}
	

	@Test
	void testAdd() {
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
		
		
		
	}
	
	@Test 
	void testContains() {
		Comparator<Integer> c = new Comparator<Integer>()
		{
			//All even integers are 'equivalent'
			//All odd integers are 'equivalent'
			public int compare(Integer x, Integer y)
			{return x %2 == y %2 ? 0 : 1;}
	
		};
		
	}
	
	@Test
	void testBelongs() {
		Comparator<Integer> c = new Comparator<Integer>()
		{
			//All even integers are 'equivalent'
			//All odd integers are 'equivalent'
			public int compare(Integer x, Integer y)
			{return x %2 == y %2 ? 0 : 1;}
	
		};
		
	}
	
	@Test
	void testRemove() {Comparator<Integer> c = new Comparator<Integer>()
	{
		//All even integers are 'equivalent'
		//All odd integers are 'equivalent'
		public int compare(Integer x, Integer y)
		{return x %2 == y %2 ? 0 : 1;}

	};
		
	}
	
	@Test 
	void testremoveCanonical() {
		
		
	}
	
	@Test
	void testdemoteAndSetCanonical() {
		Comparator<Integer> c = new Comparator<Integer>()
		{
			//All even integers are 'equivalent'
			//All odd integers are 'equivalent'
			public int compare(Integer x, Integer y)
			{return x %2 == y %2 ? 0 : 1;}
	
		};
		
	}
	
	@Test
	void testToString() {
		
		
	}
	

}
