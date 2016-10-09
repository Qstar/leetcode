import common.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class _144BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.empty()) {
            while (node != null) {
                preorder.add(node.val);
                stack.push(node);
                node = node.left;
            }
            if (stack.size() > 0) {
                node = stack.pop();
                node = node.right;
            }
        }
        return preorder;
    }
}
