package com.gsrk.data.structures.tree;

public class AVLTree {
	private AVLNode root;

	public AVLNode getRoot() {
		return root;
	}

	public void setRoot(AVLNode root) {
		this.root = root;
	}

	public AVLTree() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void makeEmpty() {
		root = null;
	}

	private int height(AVLNode node) {
		return node == null ? -1 : node.getHeight();
	}

	private int max(int lhs, int rhs) {
		return lhs > rhs ? lhs : rhs;
	}

	private AVLNode insert(int x, AVLNode t) {

		if (t == null)

			t = new AVLNode(x);

		else if (x < t.getData())

		{
			AVLNode tempLeft = null;
			tempLeft = insert(x, t.getLeft());
			t.setLeft(tempLeft);
			if (height(t.getLeft()) - height(t.getRight()) == 2)

				if (x < t.getLeft().getData())
					t = rotateWithLeftChild(t);
				else
					t = doubleWithLeftChild(t);

		}

		else if (x > t.getData())

		{
			AVLNode tempRight = null;
			tempRight = insert(x, t.getRight());
			t.setRight(tempRight);

			if (height(t.getRight()) - height(t.getLeft()) == 2)

				if (x > t.getRight().getData())
					t = rotateWithRightChild(t);

				else
					t = doubleWithRightChild(t);

		}

		else
			System.out.println("Nothing");
		t.setHeight(max(height(t.getLeft()), height(t.getRight())) + 1);
		return t;

	}

	public void insert(int data) {
		AVLNode temp = root;
		root = insert(data, temp);
	}

	private AVLNode rotateWithLeftChild(AVLNode k1) {

		AVLNode k2 = k1.getLeft();
		k1.setLeft(k2.getRight());
		k2.setRight(k1);
		k1.setHeight(max(height(k1.getLeft()), height(k1.getRight())) + 1);
		k2.setHeight(max(height(k2.getLeft()), k1.getHeight()) + 1);
		return k2;

	}

	private AVLNode rotateWithRightChild(AVLNode k1)

	{

		AVLNode k2 = k1.getRight();

		k1.setRight(k2.getLeft());
		k2.setLeft(k1);

		k1.setHeight(max(height(k1.getLeft()), height(k1.getRight())) + 1);

		k2.setHeight(max(height(k2.getRight()), k1.getHeight()) + 1);

		return k2;

	}

	/**
	 * 
	 * Double rotate binary tree node: first left child
	 * 
	 * with its right child; then node k3 with new left child
	 */

	private AVLNode doubleWithLeftChild(AVLNode k3)

	{

		k3.setLeft(rotateWithRightChild(k3.getLeft()));

		return rotateWithLeftChild(k3);

	}

	/**
	 * 
	 * Double rotate binary tree node: first right child
	 * 
	 * with its left child; then node k1 with new right child
	 */

	private AVLNode doubleWithRightChild(AVLNode k1)

	{

		k1.setRight(rotateWithLeftChild(k1.getRight()));

		return rotateWithRightChild(k1);

	}

	public int countNodes()

	{

		return countNodes(root);

	}

	private int countNodes(AVLNode r)

	{

		if (r == null)

			return 0;

		else

		{

			int l = 1;

			l += countNodes(r.getLeft());

			l += countNodes(r.getRight());

			return l;

		}

	}

	public boolean search(int val)

	{

		return search(root, val);

	}

	private boolean search(AVLNode r, int val)

	{

		boolean found = false;
		while ((r != null) && !found)

		{

			int rval = r.getData();

			if (val < rval)

				r = r.getLeft();

			else if (val > rval)

				r = r.getRight();

			else

			{

				found = true;

				break;

			}

			found = search(r, val);

		}

		return found;

	}

	public void inorder()

	{

		inorder(root);

	}

	private void inorder(AVLNode r) {
		if (r == null)
			return;

		inorder(r.getLeft());

		System.out.print(r.getData() + " ");

		inorder(r.getRight());

	}

	public void preorder()

	{

		preorder(root);

	}

	private void preorder(AVLNode r)

	{

		if (r != null)

		{

			System.out.print(r.getData() + " ");

			preorder(r.getLeft());

			preorder(r.getRight());

		}

	}

	public void postorder()

	{

		postorder(root);

	}

	private void postorder(AVLNode r)

	{

		if (r != null)

		{

			postorder(r.getLeft());

			postorder(r.getRight());

			System.out.print(r.getData() + " ");

		}

	}

}
