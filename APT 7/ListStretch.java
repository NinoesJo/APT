public class ListStretch {
    public ListNode stretch(ListNode list, int amount) {
        if (list == null) {
            return list;
        }
        ListNode answer = new ListNode(list.info, null);
        ListNode last = answer;
        for (int i = 1; i < amount; i++) {
            last.next = new ListNode(list.info, null);
            last = last.next;
        }
        list = list.next;
        while (list != null) {
            for (int i = 0; i < amount; i++) {
                last.next = new ListNode(list.info, null);
                last = last.next;
            }
            list = list.next;
        }
        return answer;
    }
}