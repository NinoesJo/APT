import java.util.Comparator;
import java.util.Arrays;

public class LetterCountSort {
    String chars;
    private int count(String str) {
        int total = 0;
        for (char c: str.toCharArray()) {
            if (chars.indexOf(String.valueOf(c)) >= 0) {
                total++;
            }
        }
        return total;
    }

    public String[] sort(String[] list, String specialChars) {
        chars = specialChars;
        Arrays.sort(list);
        Comparator<String> comp = (a, b) -> count(a) - count(b);
        Arrays.sort(list, comp);
        return list;
    }
}