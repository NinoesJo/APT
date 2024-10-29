public class TreeGrowLeaves {
    public TreeNode grow(TreeNode root, int value) {
        if (root == null) return null;
        TreeNode tree = new TreeNode(root.info, grow(root.left, value + root.info), grow(root.right, value + root.info));
        if (root.left == null && root.right == null) {
            tree.left = new TreeNode(value + root.info);
            tree.right = new TreeNode(value + root.info);
        }
        if (root.left == null) tree.left = new TreeNode(value + root.info);
        if (root.right == null) tree.right = new TreeNode(value + root.info);
        return tree;
    }
}