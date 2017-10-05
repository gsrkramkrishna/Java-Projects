package com.gsrk.data.structures.tree;


public class AVLNode {
	
	private AVLNode left,right;
	private int data;
	private int height;
	
	public AVLNode(){
		left = null;
		right = null;
		data = 0;
		height = 0;
	}
	public AVLNode(int data){
		left = null;
		right = null;
		this.data=data;
		height = 0;
	}
	public AVLNode getLeft() {
		return left;
	}
	public void setLeft(AVLNode left) {
		this.left = left;
	}
	public AVLNode getRight() {
		return right;
	}
	public void setRight(AVLNode right) {
		this.right = right;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	

}
