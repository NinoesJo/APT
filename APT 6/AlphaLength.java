import java.util.ArrayList;
import java.util.Arrays;;

public class AlphaLength {
    public ListNode create(String[] words) {
        ArrayList<String> unique = new ArrayList<>();
        for (String uni: words) {
            if (!unique.contains(uni)) {
                unique.add(uni);
            }
        }
        String[] uniWords = new String[unique.size()];
        for (int i = 0; i < unique.size(); i++) {
            uniWords[i] = unique.get(i);
        }
        Arrays.sort(uniWords);
        ArrayList<Integer> length = new ArrayList<>();
        for (String word: uniWords) {
            length.add(word.length());
        }
        int[] len = new int[length.size()];
        for (int i = 0; i < length.size(); i++) {
            len[i] = length.get(i);
        }
        ListNode answer = null;
        for (int i = len.length - 1; i >= 0; i--) {
            answer = new ListNode(len[i], answer);
        }
        return answer;
    }
}