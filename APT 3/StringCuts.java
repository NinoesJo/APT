import java.util.ArrayList;

public class StringCuts {
     public String[] filter(String[] list, int minLength) {
        ArrayList<String> newList = new ArrayList<>();
        for (String word : list) {
            if (word.length() >= minLength && newList.contains(word) == false) {
                newList.add(word);
            }
        }
        String[] answer = newList.toArray(new String[newList.size()]);
        return answer;
    }
}