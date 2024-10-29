public class FriendScore {
    public int highestScore(String[] friends) {
        int answer = 0;
        for (int i = 0; i < friends.length; i++) {
            int friend = 0;
            for (int j = 0; j < friends.length; j++) {
                if (friends[i].charAt(j) == "Y" && i != j) friend++;

            }
            answer = Math.max(answer, friend);
        }
        return answer;
    }
}