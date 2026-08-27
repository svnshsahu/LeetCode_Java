class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int ascii = (int)ch;
            String binary = Integer.toBinaryString(ascii);
            // Add leading zeros to make it 8 bits
            while (binary.length() < 8) {
                binary = "0" + binary;
            }
            sb.append(binary);
        }
        int left = 0 ;
        int right = sb.length()-1;
        while(left<right){
            if(sb.charAt(left) == sb.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
}