public class DoubleList {
    public ListNode bigify(ListNode list) {
        if (list == null) {
            return list;
        }
        ListNode answer = new ListNode(list.info, null);
        ListNode last = answer;
        last.next = new ListNode(list.info, null);
        last = last.next;
        list = list.next;
        while (list != null) {
            for (int i = 0; i < 2; i++) {
                last.next = new ListNode(list.info, null);
                last = last.next;
            }
            list = list.next;
        }
        return answer;
    }
}