import common.TreeNode;

/**
 * 1.查找两支的最大深度
 * 2.相减作比较绝对值是否超过1
 */
public class _110BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        int l = height(root.left);
        int r = height(root.right);
        return !(l < 0 || r < 0 || Math.abs(l - r) > 1);
    }

    private int height(TreeNode root) {
        if (root == null) return 0;
        int l = height(root.left);
        int r = height(root.right);
        if (l < 0 || r < 0 || Math.abs(l - r) > 1) return -1;
        else return Math.max(l, r) + 1;
    }
}
