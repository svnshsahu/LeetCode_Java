class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer , List<Integer>> map = new HashMap<>();
        for(int i=0;i<reservedSeats.length;i++){
            if(!map.containsKey(reservedSeats[i][0])){
                map.put(reservedSeats[i][0] , new ArrayList<>());
            }
            if(reservedSeats[i][1] == 1 || reservedSeats[i][1] == 10 ) continue;
            map.get(reservedSeats[i][0]).add(reservedSeats[i][1]);
        }
int ans = 2 * n;

        for (int row : map.keySet()) {

            List<Integer> seats = map.get(row);

            int[] temp = new int[10];

            for (int seat : seats) {
                temp[seat - 1] = 1;
            }

            boolean left =
                temp[1] == 0 &&
                temp[2] == 0 &&
                temp[3] == 0 &&
                temp[4] == 0;

            boolean right =
                temp[5] == 0 &&
                temp[6] == 0 &&
                temp[7] == 0 &&
                temp[8] == 0;

            boolean middle =
                temp[3] == 0 &&
                temp[4] == 0 &&
                temp[5] == 0 &&
                temp[6] == 0;

            if (left && right) {
                // Already counted 2
                continue;
            }
            else if (left || right || middle) {
                // We counted 2, but this row can only have 1
                // (or middle gives 1)
                ans--;
            }
            else {
                // We counted 2, but this row can have 0
                ans -= 2;
            }
        }

        return ans;
    }
}