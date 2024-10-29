public class PathLabel {
    private int countLeaves(TreeNode t) {
        if (t == null) return 0;
        if (t.left == null && t.right == null) {
            return 1;
        }
        return countLeaves(t.left) + countLeaves(t.right);
    }

    public TreeNode label(TreeNode t) {
        if (t == null) return null;
        TreeNode tree = new TreeNode(countLeaves(t), label(t.left), label(t.right));
        return tree;
    }
}