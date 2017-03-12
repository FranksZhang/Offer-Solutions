package solutions;

/**
 * 题目：对称的二叉树
 * 
 * 描述：请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 * 
 * 思路：前序遍历的结果和前序遍历的对称遍历算法的结果一样。
 * 
 * @author wf
 *
 */
class TreeNode2 {
    int val = 0;
    TreeNode2 left = null;
    TreeNode2 right = null;

    public TreeNode2(int val) {
        this.val = val;

    }

}
public class Symmetrica {
	public boolean isSymmetrica(TreeNode2 pRoot) {
		return isSymmetrica(pRoot, pRoot);
	}
	
	public boolean isSymmetrica(TreeNode2 root1, TreeNode2 root2) {
		if(root1 == null && root2 == null) 
			return true;
		if(root1 == null || root2 == null)
			return false;
		if(root1.val != root2.val)
			return false;
		
		return isSymmetrica(root1.left, root2.right) && isSymmetrica(root1.right, root2.left);
	}
}
