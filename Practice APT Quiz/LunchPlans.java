import java.util.ArrayList;
import java.util.Arrays;

public class LunchPlans {
    public String[] favorites(String[] perferences) {
        ArrayList<String> answerList = new ArrayList<>();
        String[] startoff = perferences[0].split(" ");
        for (String word: startoff) {
            answerList.add(word);
        }
        int oLength = answerList.size();
        for (int i = 1; i < perferences.length; i++) {
            String[] splitStr = perferences[i].split(" ");
            int index = 0;
            while (index < oLength) {
                if (Arrays.asList(splitStr).contains(answerList.get(index)) == false) {
                    answerList.remove(index);
                    oLength--;
                    index--;
                }
                index++;
            }
        }
        String[] answer = answerList.toArray(new String[answerList.size()]);
        return answer;
    }
}