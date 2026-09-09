class Solution {
    public long countCommas(long n) {
        long num = n ; 
        long numOfDigits = 0 ;
        long ans = 0 ;
        long limit = 1 ;
        long count = 1 ;

        while(num > 0){
            numOfDigits++;
            num = num/10;
        }
        if(numOfDigits<4) return 0 ;
        long tempNumOfDigits = 4 ;

        while(tempNumOfDigits < numOfDigits){
            ans = ans + (  ((long)Math.pow(10 , tempNumOfDigits) -1 ) -
                        ((long)Math.pow(10 , tempNumOfDigits-1) -1 ))*count ;
            limit++;
            if(limit > 3) {
                count++;
                limit = 1; 
            }
            tempNumOfDigits++;
        }

        ans = ans + (  n - ( (long)Math.pow(10 , numOfDigits-1)-1 ) )*count;
        return ans;

    }
}