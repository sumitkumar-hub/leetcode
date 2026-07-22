class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length())
            return s;

        String[] rows = new String[numRows];

        for (int i = 0; i < numRows; i++)
            rows[i] = "";

        int row = 0;
        boolean down = true;

        for (char c : s.toCharArray()) {
            rows[row] += c;

            if (row == numRows - 1)
                down = false;
            else if (row == 0)
                down = true;

            row += down ? 1 : -1;
        }

        String ans = "";

        for (String str : rows)
            ans += str;

        return ans;
    }
}