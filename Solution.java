public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        } 

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentdown = 0;
        boolean getlast = false;

        for (int i = 0; i < s.length(); i++) {
            rows[currentdown].append(s.charAt(i));

            if (currentdown == 0 || currentdown == numRows - 1) {
                getlast = !getlast;
            }

            if (getlast) {
                currentdown++;
            } else {
                currentdown--;   
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            result.append(rows[i]);
        }

        return result.toString();
    }
}
