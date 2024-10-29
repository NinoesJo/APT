public class HeightLabel {
    private int height(TreeNode t) {
        if (t == null) {
            return 0;
        }
        int leftHeight = height(t.left);
        int rightHeight = height(t.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    private TreeNode rewireTree(TreeNode tree, int height) {
        if (tree == null) {
            return null;
        }
        TreeNode t = new TreeNode(height, rewireTree(tree.left, height(tree.left)), rewireTree(tree.right, height(tree.right)));
        return t;
    }

    public TreeNode rewire(TreeNode t) {
        int height = height(t);
        return rewireTree(t, height);
    }
}