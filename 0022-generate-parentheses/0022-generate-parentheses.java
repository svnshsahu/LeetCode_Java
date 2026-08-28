class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        recursion(n, 0, 0, answer, "");
        return answer;
    }
    void recursion(int n, int open, int close, List<String> answer, String temp) {
        if (temp.length() == n * 2) {
            answer.add(temp);
            return;
        }
        if (open == n && close < n) {
            recursion(n, open, close + 1, answer, temp + ")");
        }
        else {
            recursion(n, open + 1, close, answer, temp + "(");
            if (open > close) {
                recursion(n, open, close + 1, answer, temp + ")");
            }
        }

    }
}