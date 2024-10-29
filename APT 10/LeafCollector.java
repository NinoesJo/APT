import java.util.ArrayList;

public class LeafCollector {
    private TreeNode collectAndRemove(TreeNode tree, ArrayList<String> answerList) {
        if (tree == null) return null;
        ArrayList<String> leavesList = new ArrayList<>();
        tree = collectAndRemoveHelper(tree, leavesList);
        if (leavesList.size() != 0) {
            answerList.add(String.join(" ", leavesList));
        }
        return tree;
    }

    private TreeNode collectAndRemoveHelper(TreeNode tree, ArrayList<String> leavesList) {
        if (tree == null) return null;
        if (isLeaf(tree)) {
            leavesList.add(String.valueOf(tree.info));
            return null;
        }
        tree.left = collectAndRemoveHelper(tree.left, leavesList);
        tree.right = collectAndRemoveHelper(tree.right, leavesList);
        return tree;
    }

    private boolean isLeaf(TreeNode tree) {
        return tree != null && tree.left == null && tree.right == null;
    }

    public String[] getLeaves(TreeNode tree) {
        ArrayList<String> answerList = new ArrayList<>();
        while (tree != null) {
            tree = collectAndRemove(tree, answerList);
        }
        String[] answer = answerList.toArray(new String[answerList.size()]);
        return answer;
    }
}