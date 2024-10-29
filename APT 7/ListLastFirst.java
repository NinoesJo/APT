public class ListLastFirst {
    public ListNode move(ListNode list) {
        if (list == null || list.next == null) {
            return list;
        }
        ListNode first = new ListNode(list.info, null);
        ListNode last = first;
        list = list.next;
        while (list.next != null) {
            last.next = new ListNode(list.info, null);
            last = last.next;
            list = list.next;
        }
        ListNode answer = new ListNode(list.info, first);
        return answer;
    }
}