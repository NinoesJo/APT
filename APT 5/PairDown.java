public class PairDown {
    public int[] fold(int[] list) {
        int[] answer;
        if (list.length % 2 == 0) {
            answer = new int[list.length / 2];
            int index = 0;
            for (int i = 0; i < list.length - 1; i += 2) {
                answer[index] = list[i] + list[i + 1];
                index++;
            }
        }
        else {
            answer = new int[(list.length / 2) + 1];
            int index = 0;
            for (int i = 0; i < list.length - 2; i += 2) {
                answer[index] = list[i] + list[i + 1];
                index++;
            }
            answer[answer.length - 1] = list[list.length - 1];
        }
        return answer;
    }
}