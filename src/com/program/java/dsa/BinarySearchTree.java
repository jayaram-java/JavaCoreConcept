package com.program.java.dsa;

public class BinarySearchTree {

	private BSTNode root;

	public BinarySearchTree() {
		super();
		root = null;
	}

	public void insert(Contact contact) {

		root = insertRec(root, contact);

	}

	private BSTNode insertRec(BSTNode root, Contact contact) {

		if (root == null) {
			root = new BSTNode(contact);
		}

		if (contact.name.compareTo(root.contact.name) < 0) {
			root.left = insertRec(root.left, contact);
		} else if (contact.name.compareTo(root.contact.name) > 0) {
			root.right = insertRec(root.right, contact);
		}

		return root;
	}

	public void displayContacts() {
		displayContactRec(root);
	}

	public void displayContactRec(BSTNode root) {

		if (root != null) {
			displayContactRec(root.left);
			System.out.println(root.contact);

			displayContactRec(root.right);
		}

	}

	public Contact search(String name) {

		return searchRec(root, name);

	}

	private Contact searchRec(BSTNode root, String name) {

		if (root == null || root.contact.name.equals(name)) {
			return (root != null) ? root.contact : null;
		}

		if (root.contact.name.compareTo(name) > 0) {
			return searchRec(root.left, name);
		}

		return searchRec(root.right, name);
	}

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();

		bst.insert(new Contact("Alice", "123-456-7890"));
		bst.insert(new Contact("Bee", "231-456-7890"));
		bst.insert(new Contact("Calvin", "531-456-7890"));
		bst.insert(new Contact("lee", "931-456-7890"));

		System.out.println("Show all contacts");

		bst.displayContacts();

		String name = "Akeyue";

		Contact contact = bst.search(name);

		if (contact != null) {

			System.out.println("\n Contact found : " + contact);

		} else {
			System.out.println("\n Contact not found : " + name);
		}

	}

}
