public class TreeSumTotal {
    private int sum(TreeNode t) {
        if (t == null) return 0;
        return t.info + sum(t.left) + sum(t.right);
    }

    public int count(TreeNode tree, int target) {
        if (tree == null) return 0;
        int total = 0;
        if (sum(tree) == target) {
            total++;
        }
        total += count(tree.left, target) + count(tree.right, target);
        return total;
    }
}