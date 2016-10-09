import common.TreeNode;

public class _226InvertBinaryTree {
    public TreeNode invertTree(TreeNode root){
        if (root == null) {
            return null;
        }

        TreeNode temp = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = temp;
        return root;
    }
}
