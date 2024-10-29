import java.util.HashSet;

public class BigWord {
    private String[] lowerCase(String[] originals) {
        String[] newSentences = new String[originals.length];
        for (int i = 0; i < originals.length; i++) {
            newSentences[i] = originals[i].toLowerCase();
        }
        return newSentences;
    }

    private String[] uniqueWords(String[] sentences) {
        HashSet<String> uniWords = new HashSet<>();
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            for (String word : words) {
                uniWords.add(word);
            }
        }
        String[] unique = uniWords.toArray(new String[uniWords.size()]);
        return unique;
    }

    private int indexLagest(int[] counts) {
        int largeIndex = 0;
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] > counts[largeIndex]) {
                largeIndex = i;
            }
        }
        return largeIndex;
    }
    
    public String most(String[] sentences) {
        String[] newSentences = lowerCase(sentences);
        String[] listWords = uniqueWords(newSentences);
        int[] counts = new int[listWords.length];
        int index = 0;
        for (String word : listWords) {
            int count = 0;
            for (String sentence : newSentences){
                String[] splitSentence = sentence.split(" ");
                for (String s : splitSentence) {
                    if (word.equals(s)) {
                        count++;
                    }
                }
            }
            counts[index] = count;
            index++;
        }
        String answer = listWords[indexLagest(counts)];
        return answer;
    }
}