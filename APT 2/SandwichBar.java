import java.util.Arrays;

public class SandwichBar {
    
    // returns the number of ingredients in the order based on the # of spaces
    public int ingredientNum(String order) {
        int ingredientCount = 1;
        for (char letter : order.toCharArray()) {
            if (letter == ' ') {
                ingredientCount++;
            }
        }
        return ingredientCount;
    }
    
    // returns the order into an array
    public String[] ingredients(String order, int ingredientCount) {
        String[] ingredient = new String[ingredientCount];
        int index = 0;
        int indexArray = 0;
        String food = "";
        while (index < order.length()) {
            if (order.charAt(index) == ' ') {
                ingredient[indexArray] = food;
                food = "";
                indexArray++;
                index++;
            }
            else if (index + 1 == order.length()) {
                food += order.charAt(index);
                ingredient[indexArray] = food;
                food = "";
                indexArray++;
                index++;
            }
            else {
                food += order.charAt(index);
                index++;
            }
        }
        return ingredient;
    }

    public int whichOrder(String[] available, String[] orders){
        int orderNumber = 0;
        int countRight = 0;
        for (int i = 0; i < orders.length; i++) {
            String[] foods = ingredients(orders[i], ingredientNum(orders[i]));
            for (int j = 0; j < foods.length; j++) {
                for (int k = 0; k < available.length; k++) {
                    if (foods[j].equals(available[k])) {
                        countRight++;
                        break;
                    }
                }
            }
            if (countRight == foods.length) {
                return orderNumber;
            }
            else {
                countRight = 0;
                orderNumber++;
            }
        }
        return -1; 
      }
   }