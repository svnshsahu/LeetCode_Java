class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int left = 0 ;
        int count = 0 ;
        String answer = "" ;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '0'){
                sb.append(s.charAt(i));
            }else{
                sb.append(s.charAt(i));
                count++;
                if(count>k){
                    while(count != k){
                        if(sb.charAt(left) == '0'){
                            sb.deleteCharAt(left);
                        }else{
                            sb.deleteCharAt(left);
                            count--;
                        }
                    }
                }
            }
            if(count == k){
                while (sb.length() > 0 && sb.charAt(0) == '0') {
                        sb.deleteCharAt(0);
                    }
                if (answer.equals("")
                        || sb.length() < answer.length()
                        || (sb.length() == answer.length()
                            && sb.toString().compareTo(answer) < 0)) {
                    answer = sb.toString();
                }
            }
        }
        return answer;

    }
}