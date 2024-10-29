import java.util.ArrayList;

public class DNAMaxNucleotide {
    private String[] containsNuc(String[] strands, String nuc) {
        ArrayList<String> newStrands = new ArrayList<>();
        for (int i = 0; i < strands.length; i++) {
            if (strands[i].contains(nuc)) {
                newStrands.add(strands[i]);
            }
        }
        String[] strandsContain = new String[newStrands.size()];
        return newStrands.toArray(strandsContain);
    }

    private int count(String strand, String nuc) {
        int nucCount= 0;
        for (char letter : strand.toCharArray()) {
            if (String.valueOf(letter).equals(nuc)) {
                nucCount++;
            }
        }
        return nucCount;
    }

    public String max(String[] strands, String nuc) {
        String answer = "";
        String[] newStrands = containsNuc(strands, nuc);
        int largestCount = 0;
        for (String dna : newStrands) {
            if (count(dna, nuc) > largestCount) {
                answer = dna;
                largestCount = count(dna, nuc);
            }
            else if (count(dna, nuc) == largestCount && dna.length() > answer.length()) {
                answer = dna;
                largestCount = count(dna, nuc);
            }
            else {
                continue;
            }
        }
        return answer;
    }
}