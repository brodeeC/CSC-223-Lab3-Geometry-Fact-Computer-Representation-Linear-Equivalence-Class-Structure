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
	
	public boolean add(LinkedEquivalenceClass<T> element) {
		return _classes.add(element);
	}
	
	public boolean contains(T target) {
		if(_classes.isEmpty()) return false;
		return _classes.contains(target);
	}
	
	public int size() {
		int sum = 0;
		for(LinkedEquivalenceClass<T> elm : _classes) {
			for(int i = 0; i< elm.size(); i++) {
				sum++;
			}
		}
		return sum;
	}

	public int numClasses() {
		return _classes.size(); 
	}
	
	protected int indexOfClass(T element) {
		if(!(contains(element))) return -1;
		return _classes.indexOf(element);
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("comparator: " + _comparator);
		for(int i = 0; i<numClasses(); i++) {
			str.append(_classes.get(i));
		}
		return str.toString();
	}

}
