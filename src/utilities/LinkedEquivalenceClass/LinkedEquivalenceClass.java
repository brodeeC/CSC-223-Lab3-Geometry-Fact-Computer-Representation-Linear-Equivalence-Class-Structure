package utilities.LinkedEquivalenceClass;

import java.util.Comparator;

import utilities.LinkedList.LinkedList;

public class LinkedEquivalenceClass<T> {
	
	protected T _canonical;
	protected Comparator<T> _comparator;
	protected LinkedList<T> _rest;
	
	public  LinkedEquivalenceClass(Comparator<T> _comparator) {
		_comparator = new Comparator<T>(); //Ask Dr. Alvin do I need this line
		_rest = new LinkedList<T>();
		
		
	}
	
	public T canonical() {
		return _canonical; 
		
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
	
	/**
	 * Clears the NonCanonical from the LinkedList
	 */
	public void clearNonCanonical() { //TODO think this through a little more
		_rest.clear();	
		}
	
	/**
	 * Returns the size of the LinkedList 
	 * @return
	 */
	public int size() {
		
		return _rest.size();
		
	}
	
	public boolean add(T element) {
		//If the element is even would be added to the front of the linkedlist
		if(element != null && _comparator.compare(_canonical, element)==0) {
			_rest.addToFront(element);
			return true;
		}
		//If the element is odd will be added to the back of the linkedlist
		if(element != null && _comparator.compare(_canonical, element)==1) {
			_rest.addToBack(element);
			return true;
		}
		
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
		
		return _rest.contains(target);
		
	}
	
	public boolean belongs (T target) {
		return false;
		
	}
	
	public boolean remove(T target) {
		if(isEmpty())return false;

		if(target != null && _rest.contains(target)) {
			_rest.remove(target);
			return true;
		}
		
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
