import java.util.Stack;

public class PathSum {
    public int hasPath(int target, TreeNode tree) {
        if (tree == null) {
            return 0;
        }
        Stack<TreeNode> treeStack = new Stack<>();
        Stack<Integer> summation = new Stack<>();
        treeStack.push(tree);
        summation.push(target - tree.info);
        while (!treeStack.isEmpty()) {
            TreeNode current = treeStack.pop();
            int remaining = summation.pop();
            if (remaining == 0) {
                return 1;
            }
            if (current.left != null) {
                treeStack.push(current.left);
                summation.push(remaining - current.left.info);
            }
            if (current.right != null) {
                treeStack.push(current.right);
                summation.push(remaining - current.right.info);
            }
        }
        return 0;
    }
}