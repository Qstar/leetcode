import common.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class _94BinaryTreeInorderTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(new _94BinaryTreeInorderTraversal().inorderTraversal(root));
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.empty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            if (stack.size() > 0) {
                node = stack.pop();
                inorder.add(node.val);
                node = node.right;
            }
        }
        return inorder;
    }
}
