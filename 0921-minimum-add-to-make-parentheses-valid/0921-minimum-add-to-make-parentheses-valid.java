class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        int count = 0 ;
        for(int i=0 ; i< s.length() ; i++){
            if(s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty()){
                    count++;
                }else{
                    stack.pop();
                }
            }
        }
        while(!stack.isEmpty()) {
            count++;
            stack.pop();
        }
        return count ;
    }
}