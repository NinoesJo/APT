public class AddSome {
    public ListNode splice (ListNode list, int size) {
        ListNode remember = list;
        ListNode answer = new ListNode(list.info);
        ListNode last = answer;
        list = list.next;
        for (int i = 0; i < size - 1; i++) {
            last.next = new ListNode(list.info);
            last = last.next;
            list = list.next;
        }
        last.next = remember;
        return answer;
    }
}