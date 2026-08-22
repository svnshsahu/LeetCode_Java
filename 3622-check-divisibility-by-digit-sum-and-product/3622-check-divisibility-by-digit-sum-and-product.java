class Solution {
    public boolean checkDivisibility(int n) {
        int num = n ;
        int sum = 0 ;
        int product = 1;
        while(n>0){
            int temp = n % 10 ;
            sum += temp ;
            product *= temp ;
            n = n / 10 ;
        }
        int total = sum + product ;
        if( num % total == 0) return true;
        else return false;
    }
}