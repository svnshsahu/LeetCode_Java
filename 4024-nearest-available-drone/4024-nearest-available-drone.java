class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int idx = -1;
        int minDist = Integer.MAX_VALUE;

        for(int i = 0; i < drones.length; i++){
            int dist = Math.abs(drones[i][0] - target[0]) 
                     + Math.abs(drones[i][1] - target[1]);

            if(dist <= drones[i][2] && dist < minDist){
                minDist = dist;
                idx = i;
            }
        }
        return idx;
    }
}
