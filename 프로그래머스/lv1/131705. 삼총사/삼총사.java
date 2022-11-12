class Solution {
    static int[] answer;
    public int solution(int[] number) {
        answer = new int [1];
        boolean[] visited = new boolean[number.length];
        comb(number, new int[3], visited, 0, number.length, 3);
        return answer[0];
    }
    
    static void comb(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
    if (r == 0) {
        if (output[0] + output[1] + output[2] == 0){
            answer[0]++;
        }
        return;
    }

    if (depth == n) {
        return;
    }

    visited[depth] = true;
    output[r-1] = arr[depth];
    comb(arr, output, visited, depth + 1, n, r - 1);

    visited[depth] = false;
    comb(arr, output, visited, depth + 1, n, r);
    }
}