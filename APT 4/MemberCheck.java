import java.util.HashSet;
import java.util.Arrays;

public class MemberCheck {
    public String[] whosDishonest(String[] club1, String[] club2, String[] club3) {
        HashSet<String> memberDishonest = new HashSet<>();
        for (String member: club1) {
            if (Arrays.asList(club2).contains(member) || Arrays.asList(club3).contains(member)) {
                memberDishonest.add(member);
            }
        }
        for (String member: club2) {
            if (Arrays.asList(club1).contains(member) || Arrays.asList(club3).contains(member)) {
               memberDishonest.add(member);
            }
        }
        String[] answer = memberDishonest.toArray(new String[memberDishonest.size()]);
        Arrays.sort(answer);
        return answer;
    }
}