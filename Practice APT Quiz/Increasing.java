import java.util.ArrayList;

public class Increasing {
    public int[] getIncreasing(int[] numbers) {
        ArrayList<Integer> answerList = new ArrayList<>();
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (answerList.size() == 0 || answerList.get(index) < numbers[i]) {
                answerList.add(numbers[i]);
                index++;
            }
        }
        int[] answer = new int[answerList.size()];
        for (int j = 0; j < answerList.size(); j++) {
            answer[j] = answerList.get(j);
        }
        return answer;
    }
}