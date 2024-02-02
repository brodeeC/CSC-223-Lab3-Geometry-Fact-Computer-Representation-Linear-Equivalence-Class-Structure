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
	
	/**
	 * Checks to see if the LinkedList is empty
	 * @return
	 */
	public boolean isEmpty() {
		
		return _rest.isEmpty();
		
	}
	
	/**
	 * Clears the LinkedList
	 */
	public void clear() {
		
		_rest.clear();
	}
	
	public void clearNonCanonical() {
		
	}
	
	/**
	 * Returns the size of the LinkedList 
	 * @return
	 */
	public int size() {
		
		return _rest.size();
		
	}
	
	public boolean add(T element) {
		if(element == null)return false;
		
		return false;
		
	}
	
	/**
	 * Sees if the LinkedList contains the target T
	 * @param target
	 * @return
	 */
	public boolean contains(T target) { //TODO Need a null check
		if(isEmpty()) return false;
		if(target == null) return false;
		
		return (_rest.contains(target));
		
	}
	
	public boolean belongs (T target) {
		return false;
		
	}
	
	public boolean remove(T target) {
		if(isEmpty())return false;
		
		return false;
		
	}
	
	public boolean removeCanonical() {
		
		return false;
	}
	
	public boolean demoteAndSetCanonical(T element) {
		
		return false;
	}
	
	public String toString() {
		return null;
		
	}

}
