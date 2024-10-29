public class TrueSpace {
    private int reCalculate(int number, int clusterSize) {
        int newNumber = clusterSize;
        while (newNumber < number) {
            newNumber += clusterSize;
        }
        return newNumber;
    }
    
    public long calculateSpace(int[] sizes, int clusterSize) {
        long answer = 0;
        for (int number: sizes) {
            if (number == 0) {
                continue;
            }
            else if (clusterSize == 1) {
                answer += number;
            }
            else if (clusterSize >= number) {
                answer += clusterSize;
            }
            else {
                answer += reCalculate(number, clusterSize);
            }
        }
        return answer;
    }
}