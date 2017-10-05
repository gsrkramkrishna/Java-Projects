package com.gsrk.data.structures.linkedlist;

public class SingleLinkedList<E> {

	private static class Node<E> {
		private E element;
		private Node<E> next;

		public Node(E element, Node<E> next) {
			this.element = element;
			this.next = next;
		}

		public E getElement() {
			return element;
		}

		public void setElement(E element) {
			this.element = element;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> next) {
			this.next = next;
		}
	}

	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public E first() {
		if (size == 0)
			return null;
		return head.getElement();
	}

	public E last() {
		if (size == 0)
			return null;
		return tail.getElement();
	}

	public void addFirst(E e) {
		head = new Node(e, head);
		if (size == 0)
			tail = head;
		size++;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		Node<E> current = head;
		while (current != null) {
			sb.append(current.getElement().toString()).append("-->");
			current = current.getNext();
		}
		return sb.toString();
	}

	public void reverse() {
		Node<E> pointer = head;
		Node<E> previous = null, current = null;
		while (pointer != null) {
			current = pointer;
			pointer = pointer.next; 
			// reverse the link
			current.next = previous;
			previous = current;
			head = current;
		}
	}


	public static void main(String[] args) {
		SingleLinkedList<String> st = new SingleLinkedList<>();
		st.addFirst("Siva");
		st.addFirst("Rama");
		st.addFirst("Krishna");
		System.out.println("Size:" + st.getSize());
		System.out.println("List:" + st);
		st.reverse();
		System.out.println("After Reverse List:" + st);
	}

}
