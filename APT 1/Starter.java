import java.util.Arrays;
public class Starter {
     public int begins(String[] words, String first) {
         String[] usedWords = new String[words.length];
         int count = 0;
         int index = 0;
         for (String word: words) {
            if (word.substring(0, 1).equals(first) && Arrays.asList(usedWords).contains(word) == false) {
                count++;
                usedWords[index] = word;
                index++;
            }
         }
        return count;
     }
 }