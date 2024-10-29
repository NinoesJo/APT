import java.util.ArrayList;
import java.util.TreeMap;

public class MedalTable {
    private TreeMap<String, int[]> maps(String[] results) {
        TreeMap<String, int[]> map = new TreeMap<>();
        for (String r: results) {
            String[] country = r.split(" ");
            for (int i = 0; i < country.length; i++) {
                map.putIfAbsent(country[i], new int[3]);
                int[] temp = map.get(country[i]);
                temp[i] += 1;
            }
        }
        return map;
    }

    public String[] generate(String[] results) {
        TreeMap<String, int[]> map = maps(results);
        ArrayList<String> answerList = new ArrayList<>();
        for (String nation: map.keySet()) {
            int i = 0;
            while (i < answerList.size()) {
                String w = answerList.get(i);
                int nationGold = map.get(nation)[0];
                int nationSilver = map.get(nation)[1];
                int nationBronze = map.get(nation)[2];
                String[] wNum = w.split(" ");
                int wGold = Integer.parseInt(wNum[1]);
                int wSilver = Integer.parseInt(wNum[2]);
                int wBronze = Integer.parseInt(wNum[3]);
                if (nationGold > wGold || (nationGold == wGold && (nationSilver > wSilver || (nationSilver == wSilver && (nationBronze > wBronze || (nationBronze == wBronze && nation.compareTo(wNum[0]) < 0)))))) {
                    String c = nation + " " + map.get(nation)[0] + " " + map.get(nation)[1] + " " + map.get(nation)[2];
                    answerList.add(i, c);
                    break;
                }
                i++;
            }
            if (i == answerList.size()) {
                String c = nation + " " + map.get(nation)[0] + " " + map.get(nation)[1] + " " + map.get(nation)[2];
                answerList.add(c);
            }
        }
        String[] answer = answerList.toArray(new String[answerList.size()]);
        return answer;
    }
}