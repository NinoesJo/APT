public class SoccerLeagues {
    public int[] points(String[] matches) {
        int[] points = new int[matches.length];
        for (int home = 0; home < matches.length; home++) {
            for (int away = 0; away < matches.length; away++) {
                if (String.valueOf(matches[home].charAt(away)).equals("W")) {
                    points[home] += 3;
                }
                else if (String.valueOf(matches[home].charAt(away)).equals("D")) {
                    points[home] += 1;
                    points[away] += 1;
                }
                else if (String.valueOf(matches[home].charAt(away)).equals("L")) {
                    points[away] += 3;
                }
                else {
                    continue;
                }
            }
        }
        return points;
    }
}