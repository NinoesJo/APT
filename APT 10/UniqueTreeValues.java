import java.util.TreeSet;

public class UniqueTreeValues {
    private void traverse(TreeNode root, TreeSet<Integer> answerSet) {
        if (root == null) return;
        answerSet.add(root.info);
        traverse(root.left, answerSet);
        traverse(root.right, answerSet);
    }

    public int[] unique(TreeNode root) {
        TreeSet<Integer> answerSet = new TreeSet<>();
        traverse(root, answerSet);
        int[] answer = new int[answerSet.size()];
        int i = 0;
        for (int num: answerSet) {
            answer[i] = num;
            i++;
        }
        return answer;
    }
}