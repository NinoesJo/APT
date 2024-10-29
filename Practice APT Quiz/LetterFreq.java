import java.util.HashMap;

public class LetterFreq {
    private HashMap<String, Integer> originalMap() {
        int ascII = 97;
        HashMap<String, Integer> map = new HashMap<>();
        while (ascII <= 122) {
            char letter = (char) ascII;
            map.put(String.valueOf(letter), 0);
            ascII++;
        }
        return map;
    }

    public String findFreqs(String[] words) {
        HashMap<String, Integer> map = originalMap();
        for (String word: words) {
            for (char letter: word.toCharArray()) {
                if (map.containsKey(String.valueOf(letter))) {
                    map.put(String.valueOf(letter), map.get(String.valueOf(letter)) + 1);
                }
            }
        }
        String[] arr = new String[map.size()];
        int index = 0;
        for (Integer values: map.values()) {
            arr[index] = String.valueOf(values);
            index++;
        }
        String answer = String.join(":", arr);
        return answer;
    }
}