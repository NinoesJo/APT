import java.util.Arrays;

public class ListUpper {
    private int count(String word) {
        int total = 0;
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (char c: word.toCharArray()) {
            if (str.indexOf(String.valueOf(c)) >= 0) {
                total++;
            }
        }
        return total;
    }
    
    public ListNode uplist(String[] words) {
        ListNode list = new ListNode(count(words[0]));
        ListNode answer = list;
        for (int i = 1; i < words.length; i++) {
            list.next = new ListNode(count(words[i]));
            list = list.next;
        }
        return answer;
    }
}