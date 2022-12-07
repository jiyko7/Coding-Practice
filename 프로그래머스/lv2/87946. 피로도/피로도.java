import java.util.Collections;
import java.util.Stack;

class Solution {
    static Stack<Integer> s = new Stack<>();
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        boolean[] visit = new boolean[dungeons.length];
        
        perm(dungeons, k, visit, dungeons.length, 0);
        Collections.sort(s);
        return s.pop();
    }
    
    static void perm (int[][]dungeons, int k, boolean[] visit, int n, int count){
        for (int i = 0; i<n; i++){
            if (!visit[i] && k>=dungeons[i][0]){
                visit[i] = true;
                perm(dungeons,k -dungeons[i][1], visit, n, count+1);
                visit[i] = false;
            }
        }
        s.push(count);
    }
}