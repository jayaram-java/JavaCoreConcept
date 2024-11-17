package com.program.java.dsa;

class Node {

	String data;
	Node left, right;

	public Node(String data) { // Constructor
		super();
		this.data = data;
		left = right = null;
	}

}

public class BinaryTree {

	Node root;

	public BinaryTree(String data) { // constructor
		super();
		root = new Node(data);
	}

	public void insert(Node parent, String data, boolean isLeft) {

		if (isLeft) {
			parent.left = new Node(data);
		} else {
			parent.right = new Node(data);
		}

	}

	public void inOrderTraversal(Node node) {

		if (node != null) {

			inOrderTraversal(node.left);
			System.out.println(node.data + "  ");
			inOrderTraversal(node.right);

		}

	}

	public Node search(Node node, String data) {

		if (node == null || node.data.equals(data)) {
			return node;
		}

		Node leftResult = search(node.left, data);

		return (leftResult != null) ? leftResult : search(node.right, data); // conditional operator or ternary operator

	}

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree("CEO");

		tree.insert(tree.root, "CTO", true);
		tree.insert(tree.root, "CFO", false);
		tree.insert(tree.root.left, "VP of Engineering", true);
		tree.insert(tree.root.left, "VP of Product", false);
		tree.insert(tree.root.right, "VP of Finance", true);
		tree.insert(tree.root.right, "VP of HR", false);

		System.out.println("In order traversal of the organizational hierarchy: ");
		tree.inOrderTraversal(tree.root);

		String searchRole = "VP of Finance & mgmt";

		Node result = tree.search(tree.root, searchRole);

		if (result != null) {
			System.out.println("\nRole " + searchRole + " found in the organization.");
		} else {
			System.out.println("\nRole " + searchRole + " not found in the organization");
		}

	}

}
