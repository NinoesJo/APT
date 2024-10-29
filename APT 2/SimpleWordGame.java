import java.util.Arrays;
import java.util.HashSet;

public class SimpleWordGame {
    public int points(String[] player, String[] dictionary) {
        HashSet<String> newPlayer = new HashSet<>();
        for (String p : player) {
            newPlayer.add(p);
        }
        int totalPoint = 0;
        for (String newString : newPlayer) {
            if (Arrays.asList(dictionary).contains(newString)) {
                totalPoint += (newString.length() * newString.length());
            }
        }
        return totalPoint;
    }
}