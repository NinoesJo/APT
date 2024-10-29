public class ListSum {
    public int sum(ListNode list, int thresh) {
        int total = 0;
        while (list != null) {
            if (list.info > thresh) {
                total += list.info;
            }
            list = list.next;
        }
        return total;
    }
}