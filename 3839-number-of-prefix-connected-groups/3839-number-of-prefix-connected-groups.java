class Solution {
    public int prefixConnected(String[] words, int k) {
        HashMap<String , Integer> map = new HashMap<>();
        int count = 0 ;
        for(int i=0;i<words.length;i++){
            if(words[i].length()< k ) words[i] = " ";
            else words[i] = words[i].substring(0 , k);
            if(!words[i].equals(" ")){
                map.put( words[i] , map.getOrDefault(words[i] , 0) +1 );
                if(map.get(words[i]) > 1){
                    count++;
                    map.put(words[i] , -5000);
                } 

            }
        }
        return count;
    }
}