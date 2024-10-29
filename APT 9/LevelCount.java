public class LevelCount {
    public int count(TreeNode t, int level) {
        if (t == null || level < 0) {
            return 0;
        }
        if (level == 0) {
            return 1;
        }
        int left = count(t.left, level - 1);
        int right = count(t.right, level - 1);
        int numNodes = left + right;
        return numNodes;
    }
}