package utilities.LinkedList;

public class LinkedList <T>{
	
	protected int _size;
	protected Node _head;
	protected Node _tail;
	
	protected class Node {
		protected T _item;
		protected Node _next;
		protected Node _prev;
		
		public Node() {this(null, null, null); }
		
		public Node (Node p, T i, Node n) {_prev = p; _item = i; _next = n; }
	}
	
	public LinkedList() {
		_tail = new Node();
		_head = new Node(null, null, _tail);
		_tail._prev = _head;
		_size = 0;
	}
	
	public boolean isEmpty() {
		return _size == 0;
	}
	
	public void clear() {
		new LinkedList<T>();
	}
	
	public int size() {
		return _size;
	}
	
	public void addToFront(T element) {
		//TODO 
	}
	
	public boolean contains(T target) {
		//TODO
		return false;
	}
	
	private Node previous(T target) {
		//TODO
		return last();
	}
	
	public boolean remove(T target) {
		//TODO
		return false;
	}
	
	private Node last() {
		//TODO
		return previous(null);
	}
	
	public void addToBack(T element) {
		//TODO
	}
	
	public String toString() {
		//TODO
		return null;
	}
	
	public void reverse() {
		//TODO
	}
}
