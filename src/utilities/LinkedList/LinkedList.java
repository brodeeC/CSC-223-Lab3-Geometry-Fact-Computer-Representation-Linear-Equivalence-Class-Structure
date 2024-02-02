package utilities.LinkedList;

public class LinkedList<T> {

	protected int _size;
	protected Node _head;
	protected Node _tail;

	protected class Node {
		protected T _data;
		protected Node _next;
		protected Node _prev;

		public Node() {
			this(null, null, null);
		}

		public Node(Node p, T i, Node n) {
			_prev = p;
			_data = i;
			_next = n;
		}
	}

	public LinkedList() {
		_tail = new Node(null,null,null); //Was empty did not know if the nulls needed to be added so I added them -Kyler
		_head = new Node(null, null, _tail);
		_tail._prev = _head;
		_size = 0;
	}

	public boolean isEmpty() {
		return _size == 0;
	}

	public void clear() {
		_head._next = _tail;
		_tail._prev = _head;
		_size = 0;
	}

	public int size() {
		return _size;
	}

	public void addToFront(T element) {
		if (element != null) {
			Node tmpNode = _head._next;
			Node node = new Node(_head, element, _head._next);
			_head._next = node;
			tmpNode._prev = node;
			_size++;
		}
	}

	public boolean contains(T target) {
		if (target == null) return false;
		return contains(_head._next, _tail._prev, target);
	}
	private boolean contains(Node head, Node tail, T target) {
		if (head == _tail || tail == _head) return false;
		if (head._data.equals(target) || (tail._data).equals(target)) return true;
		if (head._next == tail) return false;
		if (head == tail) return false;

		return contains(head._next, _tail._prev, target);
	}

	private Node previous(T target) {
		for(Node node = _head._next; node != _tail; node = node._next) {
			if (node._data.equals(target)) return node._prev;
		}
		return null;
	}

	public boolean remove(T target) {
		if (!(contains(target))) return false;

		Node node = previous(target);
		if (node != null) {
			Node tmpNode = node._next;
			node._next = tmpNode._next;
			tmpNode._prev = node;
			_size--;
			return true;
		}
		return false;
	}

	private Node last() {
		return _tail._prev;
	}

	public void addToBack(T element) {
		if (element != null) {
			Node node = last();
			Node newNode = new Node(node, element, _tail);
			node._next = newNode;
			_tail._prev = newNode;
			_size++;
		}
	}

	public String toString() {
		StringBuilder s = new StringBuilder();
		for (Node node = _head._next; node != _tail._prev; node = node._next) {
			s.append(node._data);
			s.append(", ");
		}
		s.append(_tail._prev._data);
		return s.toString();
	}

	public void reverse() {
		if (!(isEmpty())) {
			reverse(_head._next, _tail._prev);
		}
	}
	private void reverse(Node head, Node tail) {
		if (head== tail) return;
		if (head._prev == tail) return;
		swap(head, tail);
		reverse(head._next, tail._prev);
	}
	private void swap(Node head, Node tail) {
		T tmpNode = head._data;
		head._data = tail._data;
		tail._data = tmpNode;
	}
}
