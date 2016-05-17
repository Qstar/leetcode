import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversalII107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();

        if (root == null)
            return ret;

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int currentLevelCount = 1;
        int nextLevelCount = 0;

        ArrayList<Integer> levelRet = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            currentLevelCount--;
            levelRet.add(cur.val);

            if (cur.left != null) {
                queue.add(cur.left);
                nextLevelCount++;
            }
            if (cur.right != null) {
                queue.add(cur.right);
                nextLevelCount++;
            }
            if (currentLevelCount == 0) {
                currentLevelCount = nextLevelCount;
                nextLevelCount = 0;
                ret.add(0, levelRet);
                levelRet = new ArrayList<>();
            }
        }
        return ret;
    }
}
