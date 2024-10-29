public class Totality {
     public int sum(int[] a, String stype) {
         int total = 0;
         if (stype.equals("all")) {
            for (int number1: a) {
                total += number1;
            }
         }
         else if (stype.equals("even")) {
            for (int number2 = 0; number2 < a.length; number2 += 2) {
                total += a[number2];
            }
         }
         else {
            for (int number3 = 1; number3 < a.length; number3 += 2) {
                total += a[number3];
            }
         }
         return total;
     }
 }