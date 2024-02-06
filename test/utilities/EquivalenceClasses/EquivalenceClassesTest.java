package utilities.EquivalenceClasses;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Comparator;

import org.junit.jupiter.api.Test;

import utilities.LinkedEquivalenceClass.LinkedEquivalenceClass;

class EquivalenceClassesTest {

	@Test
	void testConstructor() {
		Comparator<Integer> comp = new Comparator<Integer>() 
		{
			public int compare(Integer x, Integer y)
			{return x % 3 == y % 3 ? 0:1;}
			
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
			{return x % 3 == y % 3 ? 0:1;}
			
		};
		EquivalenceClasses<Integer> ec = new EquivalenceClasses<Integer>(comp);
		
		LinkedEquivalenceClass<Integer> lec = new LinkedEquivalenceClass<Integer>(comp);
		
		ec.add(lec);

		
		
	}
	
	@Test
	void testContains() {
		
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
