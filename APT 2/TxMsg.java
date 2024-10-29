import java.util.ArrayList;

public class TxMsg {
    private boolean onlyContainsVowels(String word) {
        int vowelsCount = 0;
        for (char letter : word.toCharArray()) {
            if ("aeiou".indexOf(letter) >= 0) {
                vowelsCount++;
            }
        }
        if (vowelsCount == word.length()) {
            return true;
        }
        else {
            return false;
        }
    }

    private String newWord(String oldWord) {
        String newWord = "";
        if ("aeiou".indexOf(oldWord.charAt(0)) < 0) {
            newWord += oldWord.substring(0, 1);
        }
        for (int i = 1; i < oldWord.length(); i++) {
            if ("aeiou".indexOf(oldWord.charAt(i)) < 0 && "aeiou".indexOf(oldWord.charAt(i-1)) >= 0) {
                newWord += oldWord.substring(i, i+1);
            }
        }
        return newWord;
    }

    public String getMessage(String original) {
        String[] splitMsg = original.split(" ");
        ArrayList<String> newMessage = new ArrayList<>();
        for (String word : splitMsg) {
            if (onlyContainsVowels(word)) {
                newMessage.add(word);
            }
            else {
                newMessage.add(newWord(word));
            }
        }
        String answer = String.join(" ", newMessage.toArray(new String[newMessage.size()]));
        return answer;
   }
}