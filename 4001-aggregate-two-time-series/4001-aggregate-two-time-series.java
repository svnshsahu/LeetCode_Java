class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        List<List<Integer>> ans = new ArrayList<>();
        int idx1 = 0 ;
        int idx2 = 0 ;

        int maxRange = Math.max( series1[series1.length-1][0] , series2[series2.length-1][0] ) ;

        while( idx1 < series1.length && idx2 < series2.length ){
            List<Integer> temp = new ArrayList<>();
            if(series1[idx1][0] == series2[idx2][0] ){
                temp.add(series1[idx1][0] );
                temp.add(series1[idx1][1] + series2[idx2][1]);
                ans.add(temp);
                idx1++;
                idx2++;
            }
            else if(series1[idx1][0] < series2[idx2][0]){
                temp.add(series1[idx1][0]);

                    temp.add( series1[idx1][1] + series2[idx2][1]);
                
                ans.add(temp);
                idx1++;
            }
            else if(series1[idx1][0] > series2[idx2][0]){
                temp.add(series2[idx2][0]);

                    temp.add(series2[idx2][1] + series1[idx1][1]);
                
                ans.add(temp);
                idx2++;
            }
        }
        while(idx1<series1.length){
            List<Integer> temp = new ArrayList<>();
            temp.add(series1[idx1][0]);
            temp.add(series1[idx1][1]);
            ans.add(temp);
            idx1++;
        }
        while(idx2<series2.length){
            List<Integer> temp = new ArrayList<>();
            temp.add(series2[idx2][0]);
            temp.add(series2[idx2][1]);
            ans.add(temp);
            idx2++;
        }
        return ans;
    }
}