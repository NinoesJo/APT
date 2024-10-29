import java.util.ArrayList;
import java.util.HashMap;

public class Follower {
    public int[] follows(String[] words) {
        ArrayList<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < words.length - 1; i++) {
            boolean follow = false;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    follow = true;
                    break;
                }
            }
            if (follow) {
                answerList.add(i);
            }
        }
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}