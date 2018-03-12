import common.TreeNode;

import java.util.Stack;

public class _230KthSmallestElementinaBST {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (p.left != null) {
            stack.push(p);
            p = p.left;
        }

        while (k > 0) {
            if (p == null) {
                p = stack.pop();
                if (--k == 0) return p.val;
                p = p.right;
            } else {
                stack.push(p);
                p = p.left;
            }
        }
        return p.val;
    }
}
