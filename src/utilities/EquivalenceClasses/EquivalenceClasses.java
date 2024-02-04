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
	
	public boolean add(T element) {
		return add(element);
	}
	
	public boolean contains(T target) {
		if(_classes.isEmpty()) return false;
		return _classes.contains(target);
	}
	
	//what is size actually looking for? different than numClasses?
	public int size() {
		return _classes.size();
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
