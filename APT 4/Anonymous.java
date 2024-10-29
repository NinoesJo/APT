import java.util.HashMap;

public class Anonymous {
    private HashMap<String, Integer> alphabets(String sentence) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] splitString = sentence.split(" ");
        for (String words: splitString) {
            String lowerWords = words.toLowerCase();
            for (char letter: lowerWords.toCharArray()) {
                map.putIfAbsent(String.valueOf(letter), 0);
                map.put(String.valueOf(letter), map.get(String.valueOf(letter)) + 1);
            }
        }
        return map;
    }

    private HashMap<String, Integer> alphabetsForList(String[] sentences) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String sentence: sentences) {
            String[] splitString = sentence.split(" ");
            for (String words: splitString) {
                String lowerWords = words.toLowerCase();
                for (char letter: lowerWords.toCharArray()) {
                    map.putIfAbsent(String.valueOf(letter), 0);
                    map.put(String.valueOf(letter), map.get(String.valueOf(letter)) + 1);
                }
            }
        }
        return map;
    }
    
    public int howMany(String[] headlines, String[] messages) {
        int count = 0;
        HashMap<String, Integer> headlineMap = alphabetsForList(headlines);
        for (String message: messages) {
            HashMap<String, Integer> messageMap = alphabets(message);
            boolean isGood = true;
            for (String key: messageMap.keySet()) {
                if (!headlineMap.containsKey(key) || messageMap.get(key) > headlineMap.get(key)) {
                    isGood = false;
                }
            }
            if (isGood) {
                count++;
            }
        }
        return count;
    }
}