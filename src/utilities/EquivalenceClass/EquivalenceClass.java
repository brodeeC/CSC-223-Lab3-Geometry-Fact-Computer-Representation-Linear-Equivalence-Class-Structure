package utilities.EquivalenceClass;

import java.util.Comparator;
import java.util.List;

import utilities.LinkedEquivalenceClass.LinkedEquivalenceClass;

public class EquivalenceClass<T> {
		
	protected Comparator<T> _comparator;
	protected List<LinkedEquivalenceClass<T>> _classes;
	

	public <T extends Comparator<T>> EquivalenceClass(){
		
	}
	
	public boolean add(T element) {
		return false;
	}
	
	public boolean contains(T target) {
		return false;
	}
	
	public int size() {
		return 0;
	}
	
	public int numClasses() {
		return 0; 
	}
	
	protected int indexOfClass(T element) {
		return 0;
	}
	
	public String toString() {
		return null;
	}
}
