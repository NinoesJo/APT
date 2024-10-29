import java.util.ArrayList;
import java.util.HashMap;

public class Aaagmnrs {
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
    
    public String[] anagrams(String[] phrases) {
        ArrayList<String> answerList = new ArrayList<>();
        answerList.add(phrases[0]);
        for (int i = 1; i < phrases.length; i++) {
            boolean isAnagram = false;
            for (int j = i - 1; j >= 0; j--) {
                HashMap<String, Integer> currentPhrase = alphabets(phrases[i]);
                HashMap<String, Integer> pastPhrase = alphabets(phrases[j]);
                if (currentPhrase.equals(pastPhrase)) {
                    isAnagram = true;
                    break;
                }
            }
            if (!isAnagram) {
                answerList.add(phrases[i]);
            }
        }
        String[] answer = answerList.toArray(new String[answerList.size()]);
        return answer;
    }
}