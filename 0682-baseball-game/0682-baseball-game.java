class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String st : operations) {

            if (st.equals("+")) {
                int val1 = stack.pop();
                int val2 = stack.peek();
                int res = val1 + val2;

                stack.push(val1);
                stack.push(res);
            }
            else if (st.equals("C")) {
                stack.pop();
            }
            else if (st.equals("D")) {
                stack.push(stack.peek() * 2);
            }
            else {
                int val = Integer.parseInt(st);
                stack.push(val);
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }
}