public class AddAt {
    public ListNode addAt(ListNode list, ListNode toAdd, int index) {
        if (toAdd == null) {
            return list;
        }
        if (index == 0) {
            ListNode start = toAdd;
            while (toAdd.next != null) {
                toAdd = toAdd.next;
            }
            toAdd.next = list;
            return start;
        }
        ListNode start = list;
        for (int i = 0; i < index - 1; i++) {
            list = list.next;
        }
        ListNode after = list.next;
        list.next = toAdd;
        while (toAdd.next != null) {
            toAdd = toAdd.next;
        }
        toAdd.next = after;
        return start;
    }
}