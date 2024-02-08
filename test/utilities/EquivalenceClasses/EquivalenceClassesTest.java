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
				
		LinkedEquivalenceClass<Integer> lec2 = new LinkedEquivalenceClass<Integer>(comp);
		lec2.add(25);
		lec2.add(30);
		lec2.add(5);
		lec2.add(17);
		
		
		EquivalenceClasses<Integer> ec = new EquivalenceClasses<Integer>(comp);
		
		
		assertTrue(ec.add(lec));
		assertEquals(1, ec.numClasses());
		assertEquals(6,ec.size());
		
		assertTrue(ec.add(lec2));
		assertEquals(2, ec.numClasses());
		assertEquals(9, ec.size());
		
		
	}
	
	@Test
	void testContains() {
		Comparator<Integer> comp = new Comparator<Integer>() 
		{
			public int compare(Integer x, Integer y)
			{return x % 3 == y % 3 ? 0:1;}
			
		};
		
		LinkedEquivalenceClass<Integer> lec = new LinkedEquivalenceClass<Integer>(comp);
		
		int[] list = new int [] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		for(int i : list) {
			lec.add(i);
		}
		
		LinkedEquivalenceClass<Integer> lec2 = new LinkedEquivalenceClass<Integer>(comp);
		int [] list2 = new int[] {30,31,23,45,75,8,13,-3,0,-11};
		for(int i : list2) {
			lec2.add(i);
		}
		
		EquivalenceClasses<Integer> ec = new EquivalenceClasses<Integer>(comp);
		
		assertTrue(ec.add(lec));
		assertTrue(ec.add(lec2));
		
		assertTrue(ec.contains(0));
		assertFalse(ec.contains(2));
		assertTrue(ec.contains(3));
		assertFalse(ec.contains(99));
		assertTrue(ec.contains(-3));
		
	}
	
	@Test
	void testSize() {
		
		Comparator<Integer> comp = new Comparator<Integer>() 
		{
			public int compare(Integer x, Integer y)
			{return x % 5 == y % 5 ? 0:1;}
			
		};
		
		EquivalenceClasses<Integer> ec = new EquivalenceClasses<Integer>(comp);
		
		assertEquals(0,ec.size());
		
		LinkedEquivalenceClass<Integer>  lec = new LinkedEquivalenceClass<Integer>(comp);
		
		int [] list = new int[] {0,1,2,3,4,5,6,12,15,80};
		for(int i : list) {
			lec.add(i);
		}
		
		ec.add(lec);
		assertEquals(4,ec.size());
		
		LinkedEquivalenceClass<Integer> lec2 = new LinkedEquivalenceClass<Integer>(comp);
		
		int [] list2 = new int[] {4,12,16,90,-3,4,7,-15};
		
		for(int i :list2) {
			lec2.add(i);
		}
		
		ec.add(lec2);
		assertEquals(6,ec.size());
		
	}

	@Test 
	void testNumClasses() {
		Comparator<Integer> comp = new Comparator<Integer>() 
		{
			public int compare(Integer x, Integer y)
			{return x % 2 == y % 2 ? 0:1;}
			
		};
		EquivalenceClasses<Integer> ec = new EquivalenceClasses<Integer>(comp);
		
		assertEquals(0,ec.numClasses());
		
		LinkedEquivalenceClass<Integer> lec = new LinkedEquivalenceClass<Integer>(comp);
		
		int[] list = new int[] {1,2,3,4};
		//adds each appropriate element from list to linkedEquivalenceClass
		for(int i :list) {
			lec.add(i);
		}
		
		ec.add(lec);
		assertEquals(1,ec.numClasses());

		LinkedEquivalenceClass<Integer> lec2 = new LinkedEquivalenceClass<Integer>(comp);
		int[] list2 = new int[] {10,23,-6,7,55};
		//adds each appropriate element from list2 to linkedEquivalenceClass
		for(int i :list2) {
			lec2.add(i);
		}
		
		ec.add(lec2);
		assertEquals(2,ec.numClasses());

		LinkedEquivalenceClass<Integer> lec3 = new LinkedEquivalenceClass<Integer>(comp);
		int[] list3 = new int[] {33,400,87};
		//adds each appropriate element from list2 to linkedEquivalenceClass
		for(int i :list3) {
			lec3.add(i);
		}
		
		ec.add(lec3);
		
		assertEquals(3, ec.numClasses());
		
		
	}
	
	@Test
	void testIndexOfClass() {
		Comparator<Integer> comp = new Comparator<Integer>() 
		{
			public int compare(Integer x, Integer y)
			{return x % 2 == y % 2 ? 0:1;}
			
		};
		EquivalenceClasses<Integer> ec = new EquivalenceClasses<Integer>(comp);
				
		LinkedEquivalenceClass<Integer> lec = new LinkedEquivalenceClass<Integer>(comp);
		
		int[] list = new int[] {8,12,-4,5,6};
		//adds each appropriate element from list to linkedEquivalenceClass
		for(int i :list) {
			lec.add(i);
		}
		
		ec.add(lec);

		LinkedEquivalenceClass<Integer> lec2 = new LinkedEquivalenceClass<Integer>(comp);
		int[] list2 = new int[] {7,23,41,55};
		//adds each appropriate element from list2 to linkedEquivalenceClass
		for(int i :list2) {
			lec2.add(i);
		}
		
		ec.add(lec2);

		LinkedEquivalenceClass<Integer> lec3 = new LinkedEquivalenceClass<Integer>(comp);
		int[] list3 = new int[] {0,1};
		//adds each appropriate element from list2 to linkedEquivalenceClass
		for(int i :list3) {
			lec3.add(i);
		}
		
		
		assertEquals(-1, ec.indexOfClass(lec3));
		assertEquals(1, ec.indexOfClass(lec2));
		assertEquals(0, ec.indexOfClass(lec));
		
		ec.add(lec3);
		
		assertEquals(2, ec.indexOfClass(lec3));
		
	}


	@Test 
	void testToString() {
		
		Comparator<Integer> comp = new Comparator<Integer>() 
		{
			public int compare(Integer x, Integer y)
			{return x % 2 == y % 2 ? 0:1;}
			
		};
		EquivalenceClasses<Integer> ec = new EquivalenceClasses<Integer>(comp);
				
		LinkedEquivalenceClass<Integer> lec = new LinkedEquivalenceClass<Integer>(comp);
		
		int[] list = new int[] {0,1,2,3};
		//adds each appropriate element from list to linkedEquivalenceClass
		for(int i :list) {
			lec.add(i);
		}
		
		ec.add(lec);
		
		assertEquals("{0, 2},", ec.toString());
		
		LinkedEquivalenceClass<Integer> lec2 = new LinkedEquivalenceClass<Integer>(comp);
		
		int[] list2 = new int[] {4,5,6,7};
		//adds each appropriate element from list to linkedEquivalenceClass
		for(int i :list2) {
			lec2.add(i);
		}
		
		ec.add(lec2);
		
		assertEquals("{0, 2},{4, 6},", ec.toString());

		
	}
}
