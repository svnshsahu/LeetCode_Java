class Solution {
    public int countValidPrefixes(String s) {
        int countZero = 0 ;
        int countOne = 0 ;
        int ans = 0 ;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '0') countZero++;
            else countOne++;
            if ( (countOne == countZero) ||
                  (Math.abs(countOne - countZero) ==1 ) ) ans++;
        }
        return ans;
    }
}