class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        
        int m = arr1.length;
        int n = arr2[0].length;
        int p = arr1[0].length;
        
        int[][] answer = new int[m][n];
        
        for (int i = 0; i <m; i++){
            for (int j = 0; j<n; j++){
                int temp = 0;
                for (int k = 0; k <p; k++){
                    temp +=  arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = temp;
            }
        }
        return answer;
    }
}