package edu.kis.vh.nursery.list;

/**
 *
 * klasa linked list jest lista jednokierunkowa
 * Metoda push w klasie dodaje nowy nod do listy
 * Metoda isEmpty sprawdza czy lista jest pusta
 * Metoda isFull sprawdza czy lista jest pelna
 * Metoda top daje ostatni dodany element
 * Metoda pop usuwa ostatnio dodany element
 *
 * 
 */


public class IntLinkedList {

	private static final int NEGATIVE = -1;
	private Node last;
	private int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return NEGATIVE;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return NEGATIVE;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
