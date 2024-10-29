import java.util.HashMap;
import java.util.ArrayList;

public class Varied {
    private HashMap<String, Integer> AlphabetMap(String word) {
        HashMap<String, Integer> map = new HashMap<>();
        for (char letter: word.toCharArray()) {
            map.putIfAbsent(String.valueOf(letter), 0);
            map.put(String.valueOf(letter), map.get(String.valueOf(letter)) + 1);
        }
        return map;
    }

    private boolean justOnce(HashMap<String, Integer> map) {
        boolean value = true;
        for (String letter: map.keySet()) {
            if (map.get(letter) > 1) {
                value = false;
            }
        }
        return value;
    }
    
    public String[] variedStrings(String[] words) {
        ArrayList<String> answerList = new ArrayList<>();
        for (String word: words) {
            HashMap<String, Integer> map = AlphabetMap(word);
            boolean isOne = justOnce(map);
            if (isOne) {
                answerList.add(word);
            }
        }
        String[] answer = answerList.toArray(new String[answerList.size()]);
        return answer;
    }
}