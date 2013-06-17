package search.util;

import java.util.NoSuchElementException;

public class SinglyLinkedList<T> {
	
	private int size = 0;
	
	private static class Node<T> {
		private Node(T value, Node<T> next) {
			this.value = value;
			this.next = next;
		}

		T value;
		Node<T> next;
	}
		
	Node<T> first = null;
	
	public SinglyLinkedList() {

	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void addFirst(T obj) {
		first = new Node<T>(obj, first);
		size++;
	}
	
	public T getFirst() {
		if (first == null)
			throw new NoSuchElementException();
		return first.value;
	}
	
	public T removeFirst(){
		if (first == null) 
			throw new NoSuchElementException();
		T result = first.value;
		first = first.next;
		size--;
		return result;
	}
	
	public boolean contains(T obj) {
		Node<T> p = first;
		while(p != null && !eq(obj, p.value))
			p = p.next;
		return p != null;
	}
	
	private boolean eq(Object a, Object b) {
		return a == null ? b == null : a.equals(b);
	}
	
	public int indexOf(T obj) {
		Node<T> p = first;
		int i=0;
		while(p != null && !p.value.equals(obj)) {
			p = p.next;
			i++;
		}
		return p != null ? i : -1;
	}
	
	public void addLast(T obj) {
		Node<T> newNode = new Node<T>(obj, null);
		if(first == null) 
			first = newNode;
		else {
			Node<T> q = null;
			Node<T> p = first;
			while(p != null){
				q = p;
				p = p.next;
			}
			q.next = newNode;
		}
		size++;
	}
	
	public boolean remove(T obj) {
		Node<T> p = first;
		Node<T> q = null;
		while(p != null && !p.value.equals(obj)) {
			q = p;
			p = p.next;
		}
		if(p == null)
			return false;
		else {
			if(p == first)
				first = first.next;
			else
				q.next = p.next;
			size--;
			return true;
		}
	}

	public void remove(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException();
		if (index == 0)
			first = first.next;
		else {
			Node<T> p = first;
			for(int i = 1; i<index; i++)
				p = p.next;
			p.next = p.next.next;
			size--;
		}
	}
}
