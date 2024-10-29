import java.util.Collections;
import java.util.ArrayList;

public class SetAside {
    public String common(String[] list) {
        ArrayList<String> answerList = new ArrayList<>();
        String[] words = list[0].split(" ");
        for (String word: words) {
            if (answerList.contains(word) == false) {
                answerList.add(word);
            }
        }
        for (int i = 1; i < list.length; i++) {
            int index = 0;
            while (index < answerList.size()) {
                if (list[i].contains(answerList.get(index)) == false) {
                    answerList.remove(answerList.get(index));
                }
                else {
                    index++;
                }
            }
        }
        if (answerList.size() == 0) {
            return "";
        }
        else {
            Collections.sort(answerList);
            String answer = String.join(" ", answerList);
            return answer;
        }
    }
}