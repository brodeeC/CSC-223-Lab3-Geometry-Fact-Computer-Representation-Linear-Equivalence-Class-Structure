package utilities.LinkedEquivalenceClass;

import java.util.Comparator;

import utilities.LinkedList.LinkedList;

public class LinkedEquivalenceClass<T> {
	
	protected T _canonical;
	protected Comparator<T> _comparator;
	protected LinkedList<T> _rest;
	
	public <T extends Comparator<T>> LinkedEquivalenceClass() {
		
	}
	
	public T canonical() {
		return _canonical; //TODO
		
	}
	
	public boolean isEmpty() {
		return false;
		
	}
	
	public void clear() {
		
	}
	
	public void clearNonCanonical() {
		
	}
	
	public int size() {
		return 0;
		
	}
	
	public boolean add(T element) {
		return false;
		
	}
	
	public boolean contains(T target) {
		return false;
		
	}

}
