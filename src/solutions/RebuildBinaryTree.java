package solutions;

import javax.sound.midi.Instrument;

/**
 * 题目：重建二叉树
 * 
 * 描述：输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * 
 * @author wf
 *
 */

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class RebuildBinaryTree {
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) throws Exception {
		if(pre.length <= 0 || in.length <= 0) {
			return null;
		}
		return constructTree(pre, in, 0, pre.length-1, 0, in.length-1);
	}
	
	public TreeNode constructTree(int[] pre, int[] in, int preStart, int preEnd, int inStart, int inEnd) throws Exception {
		TreeNode root = new TreeNode(pre[preStart]);
		root.left = root.right = null;
		if(preStart == preEnd) {
			if(inStart == inEnd && pre[preStart] == in[inStart])
				return root;
			else
				throw new Exception("invalid input!!!");
		}
		
		int inRoot = inStart;
		while(in[inRoot] != pre[preStart] && inRoot < inEnd)
			inRoot++;
		
		int leftLength = inRoot - inStart;
		
		if(leftLength > 0) 
			root.left = constructTree(pre, in, preStart+1, preStart+leftLength, inStart, inRoot-1);
		if(leftLength < preEnd - preStart)
			root.right = constructTree(pre, in, preStart+leftLength+1, preEnd, inRoot+1, inEnd);
		
		return root;
	}
	
	public static void main(String[] args) {
		RebuildBinaryTree t = new RebuildBinaryTree();
		int[] pre = {1,2,4,3,5,6};
		int[] in = {4,2,1,5,3,6};
		try {
			TreeNode node = t.reConstructBinaryTree(pre, in);
			System.out.println(node.val);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
