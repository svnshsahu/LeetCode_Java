class Solution {
    public int minimumPushes(String word) {
        int len = word.length();
        int ans  = 0 ;
        int mul = 1 ;
        while(len > 0){
            if(len<8){
                ans = ans + (len * mul);
                break;
            }else{
                ans = ans + ( 8 * mul ) ;
                mul++;
                len -= 8 ;
            }
        }
        return ans ;
    }
}