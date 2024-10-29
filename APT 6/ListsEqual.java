import java.util.ArrayList;

public class ListsEqual {
    public int equal(ListNode a1, ListNode a2) {
        ArrayList<Integer> a1List = new ArrayList<>();
        ArrayList<Integer> a2List = new ArrayList<>();
        while (a1 != null) {
            a1List.add(a1.info);
            a1 = a1.next;
        }
        while (a2 != null) {
            a2List.add(a2.info);
            a2 = a2.next;
        }
        if (a1List.size() != a2List.size()) {
            return 0;
        } else {
            if (a1List.equals(a2List)) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}