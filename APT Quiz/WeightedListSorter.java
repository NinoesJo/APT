import java.util.Comparator;
import java.util.TreeMap;
import java.util.Arrays;

public class WeightedListSorter {
    private TreeMap<String, Integer> maps(String[] words, ListNode weights) {
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String word: words) {
            map.put(word, weights.info);
            weights = weights.next;
        }
        return map;
    }
    
    public String[] sort(String[] words, ListNode weights) {
        TreeMap<String, Integer> map = maps(words, weights);
        Arrays.sort(words);
        Comparator<String> comp = (a, b) -> map.get(a) - map.get(b);
        Arrays.sort(words, comp);
        return words;
    }
}