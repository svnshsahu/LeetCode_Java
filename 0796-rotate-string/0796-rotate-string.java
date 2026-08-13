class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            sb.append(sb.charAt(0));
            sb.deleteCharAt(0);
            String temp = sb.toString();
            if(temp.equals(goal)) return true;
        }
        return false;
    }
}