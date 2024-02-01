package utilities.LinkedList;

public class LinkedList <T>{
	
	protected int _size;
	protected DNode _head;
	protected DNode _tail;
	
	protected class DNode {
		protected T _item;
		protected DNode _next;
		protected DNode _prev;
		
		public DNode() {this(null, null, null); }
		
		public DNode (DNode p, T i, DNode n) {_prev = p; _item = i; _next = n; }
	}
	
	public LinkedList() {
		_tail = new DNode();
		_head = new DNode(null, null, _tail);
		_tail._prev = _head;
		_size = 0;
	}
}
