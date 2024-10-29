import java.util.ArrayList;

public class EndOfWords {
    public String[] filter(String[] words) {
        ArrayList<String> answerList = new ArrayList<>();
        ArrayList<String> alphaUsed = new ArrayList<>();
        for (String word: words) {
            if (word.substring(0, 1).equals(word.substring(word.length() - 1, word.length()))) {
                if (alphaUsed.contains(word.substring(0, 1)) == false) {
                    answerList.add(word);
                    alphaUsed.add(word.substring(0, 1));
                }
            }
        }
        String[] answer = answerList.toArray(new String[answerList.size()]);
        return answer;
    }
}
