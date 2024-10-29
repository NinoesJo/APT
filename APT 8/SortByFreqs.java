import java.util.ArrayList;
import java.util.TreeMap;

public class SortByFreqs {
    private TreeMap<String, Integer> frequencyMap(String[] data) {
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String word: data) {
            map.putIfAbsent(word, 0);
            map.put(word, map.get(word) + 1);
        }
        return map;
    }

    public String[] sort(String[] data) {
        TreeMap<String, Integer> map = frequencyMap(data);
        ArrayList<String> answerList = new ArrayList<>();
        for (String word: map.keySet()) {
            if (answerList.size() != 0) {
                int i = 0;
                for (String w: answerList) {
                    if (map.get(word) > map.get(w)) {
                        answerList.add(i, word);
                        break;
                    }
                    if (map.get(word) == map.get(w) && map.get(word).compareTo(map.get(w)) < 0) {
                        answerList.add(i, word);
                        break;
                    }
                    i++;
                }
                if (i == answerList.size()) {
                    answerList.add(word);
                }
           } else {
            answerList.add(word);
           }
        }
        String[] answer = answerList.toArray(new String[answerList.size()]);
        return answer;
    }
}