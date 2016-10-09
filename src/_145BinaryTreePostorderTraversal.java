import common.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class _145BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorder = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root, prev = root;
        while (node != null || stack.size() > 0) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            if (stack.size() > 0) {
                TreeNode temp = stack.peek().right;
                if (temp == null || temp == prev) {
                    node = stack.pop();
                    postorder.add(node.val);
                    prev = node;
                    node = null;
                } else {
                    node = temp;
                }
            }
        }
        return postorder;
    }
}
