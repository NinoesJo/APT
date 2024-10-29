public class ListParity {
    public int count (ListNode list) {
        int answer = 0;
        int count = 0;
        while (list != null) {
            if (count % 2 == 0) {
                answer += list.info;
            }
            count++;
            list = list.next;
        }
        return answer;
    }
}