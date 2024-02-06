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
	
	/**
	 * Returns the canonical element
	 * @return
	 */
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
	public void clearNonCanonical() { 
		_rest.clear();	
		}
	
	/**
	 * Returns the size of the LinkedList 
	 * @return
	 */
	public int size() {
		
		return _rest.size();
		
	}
	
	/**
	 * Adds the specified element to the LinkedList based on it's canonical
	 * @param element
	 * @return
	 */
	public boolean add(T element) {
		//If the element is even would be added to the front of the LinkedList
		if(element != null && _comparator.compare(_canonical, element)==0) {
			_rest.addToFront(element);
			return true;
		}
		//If the element is odd will be added to the back of the LinkedList
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
	public boolean contains(T target) { 
		if(isEmpty()) return false;
		if(target == null) return false;
		
		return _rest.contains(target);
		
	}
	
	/**
	 * Test to see if the target belongs in the canonical
	 * @param target
	 * @return
	 */
	public boolean belongs (T target) {
		//If the element is even will return true that it belongs there
		if(target != null && _comparator.compare(_canonical, target)==0) {
			return true;													//Ask if this code accurately captures the functionality of belongs()
		}
		//If the element is odd will return true that it belongs there
		if(target != null && _comparator.compare(_canonical, target)==1) {
			return true;
		}
		return false;
		
	}
	
	/**
	 * Removes the target element from the LinkedList
	 * @param target
	 * @return
	 */
	public boolean remove(T target) {
		if(isEmpty())return false;

		if(target != null && _rest.contains(target)) {
			_rest.remove(target);
			return true;
		}
		
		return false;
		
	}
	
	/**
	 * Removes the canonical from the LinkedList
	 * @return
	 */
	public boolean removeCanonical() {
		
		if(_canonical != null && _rest.contains(_canonical)) {
			_rest.remove(_canonical);
			return true;
		}
	
		return false;
	}
	
	public boolean demoteAndSetCanonical(T element) {
		
		return false;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		for(int i = 0; i< _rest.size(); i++) {
			if(_rest.belongs(_canonical)== true) { //TODO
				
			}
		}
		
		return s.toString();
		
	}

}
