public class RemoveMin {
    public ListNode remove(ListNode list) {
        if (list == null || list.next == null) {
            return null;
        }
        ListNode first = list;
        int min = Integer.MAX_VALUE;
        while (list != null) {
            if (list.info < min) {
                min = list.info;
            }
            list = list.next;
        }
        if (first.info == min) {
            first = first.next;
            ListNode answer = new ListNode(first.info, null);
            ListNode last = answer;
            first = first.next;
            while (first != null) {
                last.next = new ListNode(first.info, null);
                last = last.next;
                first = first.next;
            }
            return answer;
        } else {
            ListNode answer = new ListNode(first.info, null);
            ListNode last = answer;
            first = first.next;
            while (first != null) {
                if (first.info != min) {
                    last.next = new ListNode(first.info, null);
                    last = last.next;
                }
                first = first.next;
            }
            return answer;
        }
    }
}