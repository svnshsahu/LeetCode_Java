class Solution {
    public int titleToNumber(String columnTitle) {
        if(columnTitle.length() == 1 ) return (int)columnTitle.charAt(0) - 64 ;
        int ans = 0 ;
        int count = 0; 
        for(int i=columnTitle.length()-1 ; i>=0 ;i--){
            int temp = (int)Math.pow(  26 , count ) ;
            int temp2 = temp * (  (int)columnTitle.charAt(i) -64 ) ;
            ans += temp2 ;
            count ++;
        }
        return ans ;
    }
}