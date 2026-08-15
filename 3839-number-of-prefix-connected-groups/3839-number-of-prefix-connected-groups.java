class Solution {
    public int prefixConnected(String[] words, int k) {
        String[] pre = new String[words.length];
        for(int i=0;i<words.length;i++){
            if(words[i].length()< k ) pre[i] = " ";
            else pre[i] = words[i].substring(0 , k);
        }
        Arrays.sort(pre);
        int count = 0 ;
        HashMap<String , Integer> map = new HashMap<>();
        for(int i=0;i<pre.length;i++){
            if(!pre[i].equals(" ")){
                map.put( pre[i] , map.getOrDefault(pre[i] , 0) +1 );
            }
        }
        for(String key : map.keySet()){
            if(map.get(key) > 1) count++;
        }
        return count;
    }
}