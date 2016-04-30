package leetcode113;

import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
    	sum(root, sum, list, res);
    	return res;
    }
    
    private void sum(TreeNode root, int sum, List<Integer> list, List<List<Integer>> res){
    	if(root == null) return;
    	list.add(root.val);

    	if(root.left == null && root.right == null){
    		if(root.val == sum){
    			List<Integer> newList = new ArrayList<Integer>(list);
    			res.add(newList);
    		}
    	}
    	else{
    		if(root.left != null)
    			sum(root.left, sum - root.val, list, res);
    		if(root.right != null)
    			sum(root.right, sum - root.val, list, res);
    	}
    	list.remove(list.size()-1);	
    }
}
