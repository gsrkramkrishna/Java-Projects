package com.gsrk.util.concurrent;


public class SingleLinkedList {

	static class Node {
		private Node next;
		private String data;

		public Node(String data) {
			// TODO Auto-generated constructor stub
			this.data = data;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return data;
		}
	}

	private Node head;
	private Node temp;
	
	private int size = 0;
	
	public int getSize(){
		return this.size;
	}
	public void incrmentSize(){
		this.size++;
	}
	
//	public String getLastNodeWithPerformance(int n){
//		
//		if (n < (size >> 1)) {
//			Node fast = head;
//            for (int i = 0; i < n; i++)
//                fast = fast.next;
//            return fast.data;
//        } 
//	}
	
	public String getLastNode(int n) {
		Node fast = head;
		Node slow = head;
		int start = 1;
		while (fast.next != null) {
			fast = fast.next;
			start++;
			if (start > n) {
				slow = slow.next;
			}
		}
		return slow.data;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node current = head;
		while (current != null) {
			sb.append(current).append("-->");
			current = current.next;
		}
		if (sb.length() >= 3) {
			sb.delete(sb.length() - 3, sb.length());
		}
		return sb.toString();
	}

	public void append(String data) {
		if (head == null) {
			head = new Node(data);
			incrmentSize();
			return;
		}
		// cyclic data
//		if(data.equals("3")){
//			if(temp==null){
//				temp = new Node(data);
//				tail().next = temp;
//			}else{
//				tail().next = temp;
//			}
//		}else{
//			tail().next = new Node(data);
//		}
		
		tail().next = new Node(data);
		incrmentSize();
	}

	private Node tail() {
		Node tail = head;
		while (tail.next != null) {
			tail = tail.next;
		}
		return tail;
	}

	public boolean isCyclic() {
		Node fast = head;
		Node slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
		list.append("1");
		list.append("2");
		list.append("3");
		list.append("4");
		list.append("3");
		System.out.println("Is Cyclic: " + list.isCyclic());
		System.out.println("linked list : " + list);
		System.out.println("The first node from last: " + list.getLastNode(1));
		System.out.println("The second node from the end: " + list.getLastNode(2));
		System.out.println("The third node from the tail: " + list.getLastNode(3));
		System.out.println("Is Cyclic: " + list.isCyclic());
	}
}
