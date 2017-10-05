package com.gsrk.data.structures.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTree<E> {
	private Node<E> root;

	public Node<E> getRoot() {
		return root;
	}

	public void setRoot(Node<E> root) {
		this.root = root;
	}
	
	public List<E> preOrderTraversal(Node<E> node){
		if(node == null)
			return null;
		List<E> res = new ArrayList<E>();
		Stack<Node<E>> s = new Stack<Node<E>> ();
		s.push(node);
		while(!s.isEmpty()){
			Node<E> temp = s.pop();
			res.add(temp.getData());
			if(temp.getRight()!=null){
				s.push(temp.getRight());
			}
			if(temp.getLeft()!=null){
				s.push(temp.getLeft());
			}
		}
		return res;
	}

}
