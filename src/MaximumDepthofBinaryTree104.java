import common.TreeNode;

public class MaximumDepthofBinaryTree104 {
    private int maxDepth(TreeNode root){
        if (root == null) {
            return 0;
        } else {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return 1 + Math.max(left, right);
        }
    }
}
