package utilities.EquivalenceClasses;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import org.junit.jupiter.api.Test;

import utilities.LinkedEquivalenceClass.LinkedEquivalenceClass;

class EquivalenceClassesTest {

	@Test
	void testConstructor() {
		Comparator<Integer> comp = new Comparator<Integer>() 
		{
			public int compare(Integer x, Integer y)
			{return x % 3 == y % 3 ? 0:1; }
			
		};
		EquivalenceClasses<Integer> ec = new EquivalenceClasses<Integer>(comp);
		
		assertEquals(0, ec.numClasses());
		assertEquals(0, ec.size());
		
		
	}
	
	@Test
	void testAdd() {
		
		Comparator<Integer> comp = new Comparator<Integer>() 
		{
			public int compare(Integer x, Integer y)
			{return x % 2 == y % 2 ? 0 : 1; }
			
		};
		
		LinkedEquivalenceClass<Integer> lec = new LinkedEquivalenceClass<Integer>(comp);
		int[] list = new int[] {0,1,2,3,4,5,6,7,8,9,10};
		for( int i : list) {
			lec.add(i);
		}
		
		System.out.println(lec);
		
		LinkedEquivalenceClass<Integer> lec2 = new LinkedEquivalenceClass<Integer>(comp);
		lec2.add(25);
		lec2.add(30);
		lec2.add(5);
		lec2.add(17);
		
		EquivalenceClasses<Integer> ec = new EquivalenceClasses<Integer>(comp);
		
		System.out.println(lec.toString());
		
		assertTrue(ec.add(lec));
		
		assertEquals(1, ec.numClasses());
		assertEquals(3,ec.size());
		assertTrue(ec.add(lec2));
		
		assertEquals(2, ec.numClasses());
		assertEquals(7, ec.size());
		
		
	}
	
	@Test
	void testContains() {
		Comparator<Integer> comp = new Comparator<Integer>() 
		{
			public int compare(Integer x, Integer y)
			{return x % 3 == y % 3 ? 0:1;}
			
		};
		
		
		
		
	}
	
	@Test
	void testSize() {
		
	}

	@Test 
	void testNumClasses() {
		
	}
	
	@Test
	void testIndexOfClass() {
		
	}
	
	@Test 
	void testToString() {
		
	}
}
