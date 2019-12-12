package binaryTree;

/**
 * @author: Dennis
 * @date: 2019/12/12 22:42
 */

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
}

public class maxDeep {
    public  int maxDepth(TreeNode root){
        if (root == null){
            return 0;
        }
            int m = maxDepth(root.left);
            int n = maxDepth(root.right);
            return m>n?m+1:n+1;
}

}
