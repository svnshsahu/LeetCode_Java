class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for(int i=0; i<word.length( ) ;i++){
            freq[ word.charAt(i) - 'a']++;
        }
        Arrays.sort(freq);
        int eight = 8 ;
        int mul = 1 ;
        int ans = 0 ;
        for(int i=freq.length-1 ; i>=0 ; i--){
            if(freq[i] > 0){
                ans = ans + ( freq[i] * mul );
                eight--;
                if(eight == 0 ){
                    eight = 8 ;
                    mul++;
                }
            }
        }
        return ans ;

        
              


    }
}