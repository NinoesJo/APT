public class TreeImbalance {
    private int count(TreeNode t) {
        if (t == null) return 0;
        return 1 + count(t.left) + count(t.right);
    }

    private int balanceFactor(TreeNode t) {
        if (t == null) return 0;
        int left = count(t.left);
        int right = count(t.right);
        return Math.abs(left - right);
    }

    public int imbalance(TreeNode t) {
        if (t == null) return 0;
        return Math.max(balanceFactor(t), Math.max(imbalance(t.left), imbalance(t.right)));
    }
}