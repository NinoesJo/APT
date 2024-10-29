public class CounterAttack {
     public int[] analyze(String str, String[] words) {
        String[] newStr = str.split(" ");
        int index = 0;
        int[] answer = new int[words.length];
        for (String word: words) {
            int count = 0;
            for (String s : newStr) {
                if (word.equals(s)) {
                    count++;
                }
            }
            answer[index] = count;
            index++;
        }
        return answer;
     }
 }