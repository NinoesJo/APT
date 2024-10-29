public class List2Long {
    public long convert(ListNode list) {
        String num = "";
        while (list != null) {
            num += String.valueOf(list.info);
            list = list.next;
        }
        long answer = Long.parseLong(num);
        return answer;
    }
}