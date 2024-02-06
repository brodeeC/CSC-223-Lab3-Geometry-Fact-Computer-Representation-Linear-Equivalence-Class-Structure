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
		
		_canonical = (Integer) null;
		 assertEquals("Canonical was a value.",_canonical, null);
		
		
		
	}
	
	@Test
	void testisEmpty() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		
		assertTrue("List was not empty.",list.isEmpty());
		
		
		

	}
	
	@Test
	void testClear() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		int _canonical = 2;
		list.addToFront(6);
		list.addToFront(8);
		list.addToFront(10);
		
		assertTrue("List was not cleared.",list.clear());
		
	}
	
	@Test
	void testclearNonCanonical() {
		int _canonical = 2;
		
		
	}
	

	@Test
	void testAdd() {
		Comparator<Integer> c = new Comparator<Integer>()
		{
			//All even integers are 'equivalent'
			//All odd integers are 'equivalent'
			public int compare(Integer x, Integer y)
			{return x %2 == y %2 ? 0 : 1;}
	
		};
		
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
