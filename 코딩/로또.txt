import java.util.*;


class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        Set<Integer> set = new HashSet<Integer>();
        int count = 6;
        int zerocount = 0;
        
        for (int w : win_nums){
            set.add(w);
            
        }
       
        
        for (int l:lottos){
            if (l == 0){
                zerocount++;
                continue;
            }
            set.remove(l);
        }
        
        count -= set.size();
        answer[0] = 7-count-zerocount > 5 ? 6 : 7-count-zerocount;
        //answer[0] = Math.min( 7-count-zerocount, 6);
        
        answer[1] = 7-count > 5 ? 6 : 7-count; 
        //answer[1] = Math.min(7-count, 6);
        
        
        
        System.out.println(set);
        
        return answer;
    }
}