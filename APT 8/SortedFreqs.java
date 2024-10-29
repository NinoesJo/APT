import java.util.ArrayList;
import java.util.TreeMap;

public class SortedFreqs {
    private TreeMap<String, Integer> frequencyMap(String[] data) {
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String word: data) {
            map.putIfAbsent(word, 0);
            map.put(word, map.get(word) + 1);
        }
        return map;
    }

    public int[] freqs(String[] data) {
        TreeMap<String, Integer> map = frequencyMap(data);
        ArrayList<String> answerList = new ArrayList<>();
        for (String word: map.keySet()) {
            answerList.add(word);
        }
        int[] answer = new int[answerList.size()];
        int index = 0;
        for (String w: answerList) {
            answer[index] = map.get(w);
            index++;
        }
        return answer;
    }
}