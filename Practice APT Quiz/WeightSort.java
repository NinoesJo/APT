import java.util.Comparator;
import java.util.Arrays;

public class WeightSort {
    private int count(String str) {
        int total = 0;
        for (char s: str.toCharArray()) {
            int sub = (s - 'A') + 1;
            total += sub;
        }
        return total;
    }

    public String[] sort(String[] strs) {
        Arrays.sort(strs);
        Comparator<String> comp = (a, b) -> count(a) - count(b);
        Arrays.sort(strs, comp);
        return strs;
    }
}