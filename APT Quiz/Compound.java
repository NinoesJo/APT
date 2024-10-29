public class Compound {
    private int atomWeight(char compound, String atomic) {
        int weight = 0;
        for (int i = 0; i < atomic.length(); i++) {
            if (atomic.substring(i, i + 1).equals(String.valueOf(compound))) {
                if (String.valueOf(compound).equals("H")) {
                    weight = Integer.parseInt(atomic.substring(i + 2, i + 3));
                } else if (String.valueOf(compound).equals("I")) {
                    weight = Integer.parseInt(atomic.substring(i + 2, i + 5));
                } else {
                    weight = Integer.parseInt(atomic.substring(i + 2, i + 4));
                }
            }
        }
        return weight;
    }

    public int getWeight(String comp, String atomics) {
        int answer = 0;
        int index = 0;
        while (index < comp.length()) {
            int weight = 0;
            int coefficient = 1;
            if (Character.isDigit(comp.charAt(index)) == false) {
                weight = atomWeight(comp.charAt(index), atomics);
                if (index + 1 < comp.length() && Character.isDigit(comp.charAt(index + 1))) {
                    coefficient = Integer.parseInt(comp.substring(index + 1, index + 2));
                }
                answer = answer + (weight * coefficient);
            }
            index++;
        }
        return answer;
    }
}
