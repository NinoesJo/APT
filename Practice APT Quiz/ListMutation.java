public class ListMutation {
    ListNode first;
    public ListNode alter(ListNode list) {
        while (list != null) {
            if (list.info % 2 == 0) {
                first = list;
                list = list.next;
                break;
            }
            list = list.next;
        }
        if (first == null) {
            return null;
        }
        first = new ListNode(first.info);
        ListNode start = first;
        first.next = new ListNode(first.info);
        first = first.next;
        while (list != null) {
            if (list.info % 2 == 0) {
                first.next = new ListNode(list.info);
                first = first.next;
                first.next = new ListNode(list.info);
                first = first.next;
            }
            list = list.next;
        }
        return start;
    }
}