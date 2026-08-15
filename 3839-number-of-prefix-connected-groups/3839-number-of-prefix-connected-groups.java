class Solution {
    public int prefixConnected(String[] words, int k) {
        HashMap<String , Integer> map = new HashMap<>();
        int count = 0 ;
        for(int i=0;i<words.length;i++){
            if (k > words[i].length()) continue;
            String prefix =  words[i].substring(0 , k);
            map.put( prefix , map.getOrDefault(prefix , 0) +1 );
            if(map.get(prefix) == 2 ){
                count++;
            } 

        }
        return count;
    }
}