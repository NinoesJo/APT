public class ListDuplicateMe {
    public ListNode duplicate(ListNode list) {
        if (list == null) return list;
        ListNode start = list;
        while (list != null) {
            ListNode after = list.next;
            for (int i = 0; i < list.info - 1; i++) {
                list.next = new ListNode(list.info);
                list = list.next;
            }
            list.next = after;
            list = list.next;
        }
        return start;
    }
}