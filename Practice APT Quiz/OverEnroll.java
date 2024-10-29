import java.util.HashMap;
import java.util.ArrayList;

public class OverEnroll {
    private ArrayList<String> getKeys(String[] data) {
        ArrayList<String> keys = new ArrayList<>();
        for (String c: data) {
            String key = "";
            for (char letter: c.toCharArray()) {
                if (String.valueOf(letter).equals(":")) {
                    key += String.valueOf(letter);
                    keys.add(key);
                    break;
                } else {
                    key += String.valueOf(letter);
                }
            }
        }
        return keys;
    }

    private ArrayList<Integer> getValues(String[] data) {
        ArrayList<Integer> values = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            String value = "";
            for (int j = data[i].length() - 1; j >= 0; j--) {
                if (data[i].substring(j, j + 1).equals(":")) {
                    values.add(Integer.parseInt(value));
                    break;
                } else {
                    value = data[i].substring(j, j + 1) + value;
                }
            }
        }
        return values;
    }

    private HashMap<String, Integer> createMap(ArrayList<String> keys, ArrayList<Integer> values) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            map.putIfAbsent(keys.get(i), 0);
            map.put(keys.get(i), map.get(keys.get(i)) + values.get(i));
        }
        return map;
    }

    private String getMax(HashMap<String, Integer> map) {
        String maxKey = "";
        Integer maxValue = 0;
        for (String key: map.keySet()) {
            if (map.get(key) > maxValue) {
                maxKey = key;
                maxValue = map.get(key);
            }
        }
        String max = maxKey + String.valueOf(maxValue);
        return max;
    }

    private String getMin(HashMap<String, Integer> map) {
        String minKey = "";
        Integer minValue = Integer.MAX_VALUE;
        for (String key: map.keySet()) {
            if (map.get(key) < minValue) {
                minKey = key;
                minValue = map.get(key);
            }
        }
        String min = minKey + String.valueOf(minValue);
        return min;
    }
    
    public String[] popular(String[] data) {
        ArrayList<String> keys = getKeys(data);
        ArrayList<Integer> values = getValues(data);
        HashMap<String, Integer> map = createMap(keys, values);
        String maximum = getMax(map);
        String minimum = getMin(map);
        String[] answer = new String[2];
        answer[0] = maximum;
        answer[1] = minimum;
        return answer;
    }
}