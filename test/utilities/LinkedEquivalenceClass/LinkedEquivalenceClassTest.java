package utilities.LinkedEquivalenceClass;


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
		assertTrue("Values were not equivalent.",);
		
		
	}
	
	@Test
	void testCanonical() {
		Comparator<Integer> c = new Comparator<Integer>()
		{
			//All even integers are 'equivalent'
			//All odd integers are 'equivalent'
			public int compare(Integer x, Integer y)
			{return x %2 == y %2 ? 0 : 1;}
	
		};
		
	}
	
	@Test
	void testisEmpty() {
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
	
	@Test
	void testClear() {
		Comparator<Integer> c = new Comparator<Integer>()
		{
			//All even integers are 'equivalent'
			//All odd integers are 'equivalent'
			public int compare(Integer x, Integer y)
			{return x %2 == y %2 ? 0 : 1;}
	
		};
		
	}
	
	@Test
	void testclearNonCanonical() {
		Comparator<Integer> c = new Comparator<Integer>()
		{
			//All even integers are 'equivalent'
			//All odd integers are 'equivalent'
			public int compare(Integer x, Integer y)
			{return x %2 == y %2 ? 0 : 1;}
	
		};
		
	}
	
	@Test
	void testSize() {
		Comparator<Integer> c = new Comparator<Integer>()
		{
			//All even integers are 'equivalent'
			//All odd integers are 'equivalent'
			public int compare(Integer x, Integer y)
			{return x %2 == y %2 ? 0 : 1;}
	
		};
		
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
		Comparator<Integer> c = new Comparator<Integer>()
		{
			//All even integers are 'equivalent'
			//All odd integers are 'equivalent'
			public int compare(Integer x, Integer y)
			{return x %2 == y %2 ? 0 : 1;}
	
		};
		
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
		Comparator<Integer> c = new Comparator<Integer>()
		{
			//All even integers are 'equivalent'
			//All odd integers are 'equivalent'
			public int compare(Integer x, Integer y)
			{return x %2 == y %2 ? 0 : 1;}
	
		};
		
	}
	

}
