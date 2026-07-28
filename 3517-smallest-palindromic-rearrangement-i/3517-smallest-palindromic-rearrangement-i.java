class Solution {
    public String smallestPalindrome(String s) {
        if(s.length() == 1) return s;
        char[] str = s.toCharArray();
        Arrays.sort(str);
        String temp = "";
        StringBuilder right = new StringBuilder();

        for(int i=str.length-1 ; i >=0 ; i--){
            if( i!=0 && (str[i] == str[i-1])){
                right.append(str[i]);
                i--;
            }
            else if( i!=0 && (str[i] != str[i-1] )){
                temp = String.valueOf(str[i]);
            }
            else if( i == 0 ) temp =  String.valueOf(str[i]);
        }
       StringBuilder left = new StringBuilder(right).reverse();
        return left.toString() + temp + right;
    }
}