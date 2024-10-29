import java.util.ArrayList;

public class TreeDivide {
    private String[] newArr(String[] list, int start, int end) {
        ArrayList<String> lis = new ArrayList<>();
        for (int i = start; i < end; i++) {
            lis.add(list[i]);
        }
        String[] array = lis.toArray(new String[lis.size()]);
        return array;
    }

    public TreeNode create(String[] list) {
        if (list.length == 1) return new TreeNode(list[0].length());
        TreeNode tree = new TreeNode(list[list.length / 2].length(), create(newArr(list, 0, list.length / 2)), create(newArr(list, list.length / 2 + 1, list.length)));
        return tree;
    }
}