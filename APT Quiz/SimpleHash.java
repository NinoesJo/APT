import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class SimpleHash {
    private HashMap<String, Integer> hashValue() {
        Integer hash = 1;
        int ascII = 97;
        HashMap<String, Integer> map = new HashMap<>();
        while (ascII <= 122) {
            char letter = (char) ascII;
            map.put(String.valueOf(letter), hash);
            ascII++;
            hash++;
        }
        return map;
    }

    private Integer value(String word, HashMap<String, Integer> map) {
        Integer val = 0;
        for (char letter: word.toCharArray()) {
            val += map.get(String.valueOf(letter));
        }
        return val;
    }
    
    public String[] calculate(String[] list) {
        HashMap<String, Integer> map = hashValue();
        TreeMap<Integer, ArrayList<String>> values = new TreeMap<>();
        for (String word: list) {
            Integer hashVal = value(word, map);
            values.putIfAbsent(hashVal, new ArrayList<>());
            values.get(hashVal).add(word);
        }
        ArrayList<String> answerList = new ArrayList<>();
        for (Integer key: values.keySet()) {
            String ans = "";
            if (values.get(key).size() > 2) {
                String[] temp = values.get(key).toArray(new String[values.get(key).size()]);
                String tempStr = String.join(" ", temp);
                ans = String.valueOf(key) + ":" + tempStr;
                answerList.add(ans);
            }
        }
        String[] answer = answerList.toArray(new String[answerList.size()]);
        return answer;
    }
}
