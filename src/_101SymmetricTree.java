import common.TreeNode;

public class _101SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return root == null || helper(root.left, root.right);
    }

    private boolean helper(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left != null && right == null || left == null) {
            return false;
        } else {
            if (left.val == right.val) {
                return helper(left.left, right.right) && helper(left.right, right.left);
            }
        }
        return false;
    }

}
