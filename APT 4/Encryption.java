import java.util.HashMap;

public class Encryption {
    public String encrypt(String message) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String[] answerList = new String[message.length()];
        HashMap<String, String> encryption = new HashMap<>();
        int index = 0;
        for (int i = 0; i < message.length(); i++) {
            int oldSize = encryption.size();
            encryption.putIfAbsent(message.substring(i, i + 1), alphabets.substring(index, index + 1));
            if (encryption.size() > oldSize) {
                index++;
            }
            answerList[i] = encryption.get(message.substring(i, i + 1));
        }
        String answer = String.join("", answerList);
        return answer;
    }
}