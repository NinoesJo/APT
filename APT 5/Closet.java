import java.util.TreeSet;

public class Closet {
    public String anywhere(String[] list) {
        TreeSet<String> answerSet = new TreeSet<>();
        for (String words: list) {
            String[] wordList = words.split(" ");
            for (String word: wordList){
                if (! answerSet.contains(word)) {
                    answerSet.add(word);
                }
            }
        }
        String answer = String.join(" ", answerSet);
        return answer;
    }
}