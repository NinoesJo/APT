import java.util.ArrayList;
import java.util.TreeMap;

public class LeafTrails {
    private void children(TreeNode t, TreeMap<Integer, String> tree, String path) {
        if (t == null) return;
        String nPath = path;
        if (t.left == null && t.right == null) {
            tree.put(t.info, nPath);
        }
        if (t.left != null) {
            nPath += "0";
            children(t.left, tree, nPath);
        }
        if (t.right != null) {
            nPath = path + "1";
            children(t.right, tree, nPath);
        }
    }

    public String[] trails(TreeNode tree) {
        TreeMap<Integer, String> answerTree = new TreeMap<>();
        children(tree, answerTree, "");
        ArrayList<String> answerList = new ArrayList<>(answerTree.values());
        String[] answer = answerList.toArray(new String[answerList.size()]);
        return answer;
    }
}