class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int length = land.length-1;
        for (int j = 1; j<=length; j++){
            land[j][0] += Math.max(Math.max(land[j-1][1], land[j-1][2]), land[j-1][3]);
            land[j][1] += Math.max(Math.max(land[j-1][0], land[j-1][2]), land[j-1][3]);
            land[j][2] += Math.max(Math.max(land[j-1][0], land[j-1][1]), land[j-1][3]);
            land[j][3] += Math.max(Math.max(land[j-1][0], land[j-1][1]), land[j-1][2]);
        }
        
        return Math.max(Math.max(Math.max(land[length][0], land[length][1]), land[length][2]), land[length][3]);

    }
}
         