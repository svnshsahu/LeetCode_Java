class Solution {
    public int maxProduct(int n) {
        int idx1 = -1 ;
        int idx2 = -1;
        int max1 = -1 ;
        int max2 = -1 ;

        String num = String.valueOf(n);
        int digit = num.length();

        for(int i=0;i<digit;i++){
            int temp = num.charAt(i) - '0';
            if(temp>max1){
                max1 = temp ;
                idx1 = i ;
            }
        }

        for(int i=0;i<digit;i++){
            int temp = num.charAt(i) - '0';
            if((temp > max2) && idx1 != i ){
                max2 = temp;
                idx2 = i; 
            }
        }

        return max1 * max2 ;


    }
}