import common.TreeNode;

/**
 * [思路]
 * 如果如果p,q 比root小, 则LCA必定在左子树, 如果p,q比root大,
 * 则LCA必定在右子树. 如果一大一小, 则root即为LCA.
 * <p>
 * 在二叉查找树种，寻找两个节点的最低公共祖先。
 * 1、如果a、b都比根节点小，则在左子树中递归查找公共节点。
 * 2、如果a、b都比根节点大，则在右子树中查找公共祖先节点。
 * 3、如果a、b一个比根节点大，一个比根节点小，或者有一个等于根节点，则根节点即为最低公共祖先。
 */
public class _235LowestCommonAncestorofaBinarySearchTree {
    private TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || q == null || p == null) {
            return null;
        }

        if (Math.max(q.val, p.val) < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (Math.min(q.val, p.val) > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else return root;
    }
}
