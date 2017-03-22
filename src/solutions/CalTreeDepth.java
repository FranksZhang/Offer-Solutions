package solutions;

/**
 * 
 * @author zwf
 *
 */
class TreeNode3 {
    int val = 0;
    TreeNode3 left = null;
    TreeNode3 right = null;

    public TreeNode3(int val) {
        this.val = val;

    }

}
public class CalTreeDepth {
	public int TreeDepth(TreeNode3 root) {
		if(root == null) 
			return 0;
		int right = TreeDepth(root.right);
		int left = TreeDepth(root.left);
		
		return (right > left) ? (right + 1) : (left + 1);
	}
}
