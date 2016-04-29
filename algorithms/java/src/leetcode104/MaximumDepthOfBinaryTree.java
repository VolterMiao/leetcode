package leetcode104;

public class MaximumDepthOfBinaryTree {
	
	public int maxDepth(TreeNode root) {
		if(root == null)
			return 0;
		int dl = maxDepth(root.left);
		int dr = maxDepth(root.right);
		return 1 + ( dl > dr ? dl : dr );
	}
}
