class Solution {
    public int largestInteger(int n, int s) {
        if(s==0) return 0 ;
        int ans = 9 ;
        if(s<10){
            ans = s ;
            ans = ans * (int)Math.pow(10 , n-1);
            return ans;
        }
        
        n--;
        s=s-9;
        while(s>0){
            if(s<10){
                ans = ( ans * 10 ) + s ;
                n--;
                s = 0 ;
                break ; 
            }
            ans = ( ans * 10 ) + 9 ;
            n--;
            s = s-9 ;
        }
        if( n == 0 ) return ans ;
        else if(n<0) return -1 ;
        if(n>0){
            ans = ans * (int)Math.pow(10 , n);
        }
        return ans;

    }
}