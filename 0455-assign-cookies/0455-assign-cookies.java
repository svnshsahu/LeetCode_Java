class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length == 0 )return 0 ;
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0 ;
        int idx = s.length - 1 ; 
        for(int i=g.length-1 ; i>=0 ;i--){
            if(g[i] <= s[idx]){
                idx--;
                count++;
                if(idx == -1) break;
                
            }
        }
        return count;
    }
}