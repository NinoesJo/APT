public class AccessLevel {
     public String canAccess(int[] rights, int minPermission) {
            // fill in code here
            String code = "";
            for (int number : rights) {
                if (number >= minPermission) {
                    code = code + "A";
                }
                else {
                    code = code + "D";
                }
            }
            return code;
     }
  }