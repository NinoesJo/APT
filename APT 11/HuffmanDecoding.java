import java.util.HashMap;

public class HuffmanDecoding {
    private HashMap<String, String> dictionary(String[] dictionary) {
        HashMap<String, String> map = new HashMap<>();
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int index = 0;
        for (String s: dictionary) {
            map.put(s, String.valueOf(alpha.charAt(index)));
            index++;
        }
        return map;
    }

    public String decode(String archive, String[] dictionary) {
        String answer = "";
        HashMap<String, String> map = dictionary(dictionary);
        String str = "";
        for (int i = 0; i < archive.length(); i++) {
            str += String.valueOf(archive.charAt(i));
            if (map.containsKey(str)) {
                answer += map.get(str);
                str = "";
            }
        }
        return answer;
    }
}