package utilities.EquivalenceClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import utilities.LinkedEquivalenceClass.LinkedEquivalenceClass;

public class EquivalenceClasses<T>{
	
	protected Comparator<T> _comparator;
	protected List<LinkedEquivalenceClass<T>> _classes;
	

	public EquivalenceClasses(Comparator<T> comp){
		_classes = new ArrayList<LinkedEquivalenceClass<T>>();
		_comparator = comp;
	}
	
	/**
	 * adds linkedEquivalenceClass to _classes arrayList
	 * @param element
	 * @return boolean if element is added
	 */
	public boolean add(LinkedEquivalenceClass<T> element) {
		return _classes.add(element);
	}
	
	/**
	 * sees if desired element target is contained in _classes
	 * @param target
	 * @return
	 */
	public boolean contains(T target) {
		if(_classes.isEmpty()) return false;
		for(LinkedEquivalenceClass<T> elm : _classes) {
			if(elm.contains(target)) {
				return true;
				
			}
		}
		return false;		
	}
	
	/**
	 * contains class? //is this right? index of class needs this
	 * @param target
	 * @return
	 */
	public boolean contains(LinkedEquivalenceClass<T> target) {
		if(_classes.isEmpty()) return false;
		return _classes.contains(target);
	}
	
	/**
	 * sums total number of elements in all linkedEquivlalenceClasses 
	 * @return int total size
	 */
	public int size() {
		int sum = 0;
		for(LinkedEquivalenceClass<T> elm : _classes) {
			sum += elm.size();
		}
		return sum;
	}

	/**
	 * number of Classes in _classes
	 * @return total classes
	 */
	public int numClasses() {
		return _classes.size(); 
	}
	
	/**
	 * finds index of desired element
	 * @param element
	 * @return int index of element
	 */
	protected int indexOfClass(T element) {
		if(!(contains(element))) return -1;
		return _classes.indexOf(element);
	}
	
	protected int indexOfClass(LinkedEquivalenceClass<T> element) {
		if(!(contains(element))) return -1;
		return _classes.indexOf(element);
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		//str.append("comparator: " + _comparator);
		for(int i = 0; i<numClasses(); i++) {
			str.append("{"+_classes.get(i)+"},");
		}
		return str.toString();
	}

}
