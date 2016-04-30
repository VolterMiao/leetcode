package leetcode114;

import common.TreeNode;

public class FlattenBinaryTreeToLinkedList {
	public void flatten(TreeNode root){
		root = help(root);
	}
	
	private TreeNode help(TreeNode root){
		if(root == null) return null;
		TreeNode l = root.left;
		TreeNode r = root.right;
		if(l != null){
			root.right = help(l);
			root.left = null;
			TreeNode rightmost = l;
			while(rightmost.right != null)
				rightmost = rightmost.right;
			rightmost.right = r;
		}
		help(r);
		return root;
	}
}
