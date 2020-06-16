package com.leetcode.week3;

public class SearchBST {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		System.out.println("Before search");
		printBst(root);
		TreeNode node = searchBST(root, 5);
		System.out.println("\nAfter search");
		printBst(node);

	}

	private static void printBst(TreeNode root) {
		if (root == null)
			return;
		System.out.print(root.val + " ");
		printBst(root.left);
		printBst(root.right);
	}

	public static TreeNode searchBST(TreeNode root, int val) {
		while (root != null) {
			if (root.val == val)
				return root;
			if (root.val > val) {
				root = root.left;
			} else {
				root = root.right;
			}
		}

		return null;
	}
}
