import java.util.*;
import static java.util.stream.Collectors.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int num = nums.length/2;
        Set<Integer> numset = new HashSet<>();
        for (int i: nums){
            numset.add(i);
        }
        
        
        
        return Math.min(numset.size(),num);
    }
}